/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author h8saini
 */
public class QueueOfDistinctStrings {

// Overview: QueueOfDistinctStrings are mutable, bounded         
// collection of distinct strings that operate in      
// FIFO (First-In-First-Out) order.      
//     
// The abstraction function is:     
// a) Write the abstraction function here 
 
//     AF(q) = An abstract queue of non-null distinct strings where newQ is a QueueOfDistinctStrings object.
//              newQ.items = queue.items, an array list of distinct string elements with no null elements.
//              newQ.items.get(i) == a distinct string element, i is an integer index for the queue.items with a size [1..n]
//              newQ.items.get(0) == the front element of the queue.items
//              newQ.items.get((newQ.items.size()-1)) == the end/last element of the queue.items
//   if(!(this.repOK())) checks if it passed the rep invariant, if it doesn't, it will print out "Queue is Empty...ERROR: Rep invariant not satisfied"
//     
// The rep invariant is:      
// b) Write the rep invariant here

//       RI(q) = if queue.items.get(i) == null ,  then it return false
//             if queue.items.get(i) != <String>,  then it return false 
//             if queue.items.get(i) contains duplicate elements or repetition then return false
//             if all elements in queue.items are unique, not null, and of only type String then return true.
    
//the rep
    private ArrayList<String> items;

    public QueueOfDistinctStrings() {
        items = new ArrayList<String>();
    }
// MODIFIES: this     
// EFFECTS: Appends the element at the end of the queue      
//          if the element is not in the queue, otherwise     
//          does nothing.

    public void enqueue(String element) throws Exception {
        if (items.contains(element) == false) {
            items.add(element);
        }
        if (items.contains(element)== true){ 
        }
        if (element == null) throw new Exception();
    }

    public String dequeue() throws Exception {
// MODIFIES: this         
// EFFECTS: Removes an element from the front of the queue 
        if (items.size() == 0) throw new Exception();
        return items.remove(0);
    }

    public boolean repOK() {

        //EFFECTS: Returns true if the rep invariant holds for this object; otherwise returns false
        if(this.items == null){

            return false;
        }

        for(int i=0; i<items.size(); i++){
            if(!(items.get(i) instanceof String)) return false;
            for(int j=i+1; j<items.size(); j++)
                if(items.get(i).equals(items.get(j))) return false;
        }
        return true;
    }

    public String toString() {
// EFFECTS: Returns a string that contains the strings in the          
//          queue, the front element and the end element.          
//          Implements the abstraction function.
//           d) Write the code for the toString() here

        // majority of the work is being done by enqueue method since it checks for duplication
        // since we are using ArrayList String, we don't have to check for integer either.
        // therefore, reOk should only check for null
        if(!(this.repOK()))
            return "ERROR: Rep invariant not satisfied";
        
        // prints all elements of the queue and determines front & last element. 
        String x = "Printing queue of distinct strings: " + '\n'; 
        String y = "";
        for (String e : items) 
            y += e + '\n';
            
        String z = "The front elements is: " + this.items.get(0) + " and the end element is: " + this.items.get(this.items.size() - 1);
        
        return x + y + z;
    
    }

    public static void main(String [] args) throws Exception {
        QueueOfDistinctStrings newQ = new QueueOfDistinctStrings();
        
        String t = new String("a"); //creating a variable t that hold a string value
        newQ.enqueue(t); // adding that variable t in the queue
        newQ.enqueue("b"); //adding string values directly to the array 
        newQ.enqueue("c");
        newQ.enqueue("d");
        newQ.enqueue("d"); //duplication, this is already handled by enqueue method. it does not add to queue
       
       System.out.println(newQ); //prints out the toString method
       System.out.println(newQ.repOK()); //prints true if all conditions hold for rep variant
       newQ.dequeue(); //deletes the first element of string queue
        
       System.out.println(newQ);
       System.out.println(newQ.repOK());
    }
}
