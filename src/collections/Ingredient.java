
package collections;

import java.util.logging.Logger;

/**
 *
 * @author Tender
 */
public class Ingredient {
    
    private String name;
    private double amount;
    private double calorie;
    private double fat;

    public Ingredient() {
    }

    public Ingredient(String name, double amount, double calorie, double fat) {
        this.name = name;
        this.amount = amount;
        this.calorie = calorie;
        this.fat = fat;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return name + "\t" + amount + "\t" + calorie + "\t" + fat;
    }
   
    
    
}
