/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.ArrayList;
/**
 *
 * @author h8saini
 */
public class FoodCategory extends FoodComponent {
    private ArrayList<FoodItem> items = new ArrayList<>();
    private ArrayList<FoodCategory> categories = new ArrayList<>();

    public FoodCategory(String name) {
        super(name);
    }

    public void add(FoodComponent component) {
        if (component instanceof FoodItem) {
            items.add((FoodItem) component);
        } else if (component instanceof FoodCategory) {
            categories.add((FoodCategory) component);
        }

    }
   
    public void remove(FoodComponent component){
       if (component instanceof FoodItem) {
            items.remove((FoodItem) component);
        } else if (component instanceof FoodCategory) {
            categories.remove((FoodCategory) component);
        } 
    }

    public double getPrice() {
        double price = 0;
        for (FoodItem x : items) {
            price += x.getPrice();
        }
        return price;
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (FoodItem x : items) {
            totalPrice += x.getPrice();
        }
       
        for (FoodCategory x : categories) {
            totalPrice += x.totalPrice();
        }
        
         return totalPrice;
    }

    public void print(int level) {
        String space = "";
        for (int i = 0; i < level; i++) {
            space += "\t";
        }

        double totalPrice = totalPrice();

        System.out.printf("%s Food Category (%s,%.1f) contains \n",space, getName(), totalPrice());


        for (FoodCategory x : categories) {
            x.print(level + 1);
        }
                for (FoodItem x : items) {
            x.print(level+1);
        }
    }

}