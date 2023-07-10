/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.ArrayList;
/**
 *
 * @author h8saini
 */
public class ProceduralAbstraction {
    public static int reverseFactorial(int x){
       //Requires: None 
       //Modifies: None //Effects: Returns the smallest positive integer n for which n!  
       // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive  
       // integer x. Otherwise returns 1.
      
       int factorial=1;
       
       int counter=1;
       if(x<0){
           System.out.println(1);
           return 1;
       }
       while(factorial<x){
           counter++;
           factorial*=counter;
       }
       System.out.println("The reverse factorial of " + x + " is:");
       System.out.println(counter);
       return counter;
    }
    
    public static boolean isMatrixNice(int[][] arr) {
        // returns false if the array is empty or null
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.\n");
            return false;
        }
        // initializing sum to 0
        int sum = 0;
        
        // The code is split into 3 parts
        
        /*Part 1 checks to make sure the rows are correct and is a square matrix
        if it is a square matric then it calculates the sume of each row and checks if they all are equal
        */
        
        // loop runs through each row
        for (int i = 0; i < arr.length; i++) {
            // if current row has different length, returning false
            if (arr[i].length != arr.length) {
                System.out.println("Not a nice matrix.\n");
                return false;
            }
            // finding sum of values in current row
            int row = 0;
            for (int j = 0; j < arr[i].length; j++) {
                row += arr[i][j];
            }
            // if i is 0 (first row), setting s as sum
            if (i == 0) {
                sum = row;
            } 

            // otherwise if sum is not equal to sum of current row, returning false
            else if (sum != row) {
                System.out.println("Not a nice matrix.\n");
                return false;
            }
        }
        
        /*
        Part 2: this checks whether or not the colums sum is the same
        */
        // loops through each column and finds the sum of each
        for (int i = 0; i < arr.length; i++) {
            int col = 0;
            for (int j = 0; j < arr.length; j++) {
                col += arr[j][i];
            }
            // if sum of current col is not equal to sum, returns false
            if (col != sum) {
                System.out.println("Not a nice matrix.\n");
                return false;
            }
        }
        
        /*
        Part 3 of the code is to ensure that the 2 diagnols of a square matrix has the same sum
        */
        
        int diagnol1 = 0, diagnol2 = 0;
        // loops through the diagnols to find sum
        for (int i = 0; i < arr.length; i++) {
            // sum of diagnol1 (top left to bottom right)
            diagnol1 += arr[i][i];
            // sum of diagnol2 (bottom left to top right)
            diagnol2 += arr[arr.length - 1 - i][i];
        }
        //if diagnol1 and diagnol2 are not equal to each other. then it returns false
        //it also checks if the diagnols sum matches with the sum of rows and columns
        if (diagnol1 != sum || diagnol2 != sum) {
            System.out.println("Not a nice matrix.\n");
            return false;
        } 
        else {
            //printing sum and returning true
            System.out.println("\nThis is a nice matrix.");
            System.out.println("The sum of this matrix is: " + sum + ".\n");
            return true;
        }
    }
   
    public static void main(String args[]){
       //test case 1
       int[][] a = {
           {2,7,6},
           {9,5,1},
           {4,3,8}
               
       };
       isMatrixNice(a);
       
       //test case 2
       int [][] b = {
           {3,4},
           {4,4}
       };
       isMatrixNice(b);
       
       //test case 3
       int [][] c = {
           {4,4},
           {4,4}
       };
       isMatrixNice(c);
       
       // Test case 4
       int [][] d = {
           {3,4,-1},
           {5,2,0},
           {9,8,1}
           };
       isMatrixNice(d);
       
       //reverseFactorial Test cases
       reverseFactorial(24);
       reverseFactorial(119);
       
    }
}
