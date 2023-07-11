/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author h8saini
 */
public class FoodItem extends FoodComponent {

    private double price;

    public FoodItem(String name , double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void print(int level) {
        String spaces = "";
        for(int i=0;i<level;i++){
            spaces += "\t";
        }
        System.out.printf("%s FoodItem : %s, %.1f\n",spaces,getName(),getPrice());

    }

}