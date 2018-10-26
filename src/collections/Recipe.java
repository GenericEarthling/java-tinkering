/**
 * Recipe Object with Ingredient array object
 */
package collections;

import java.util.Iterator;

/**
 *
 * @author Tender
 */
public class Recipe {
    private String name;
    private String notes;
    private Ingredient[] ingredient;
    private int ingredientSize;
    private int servings;

    public Recipe() {
    }

    public Recipe(String name, String notes, int servings, int ingredientCapacity) {
        ingredientSize = 0;
        this.name = name;
        this.notes = notes;
        this.servings = servings;
        ingredient = new Ingredient[ingredientCapacity];
    }
    
//    public Recipe(String name, String notes, Ingredient[] ingredient, int servings) {
//        this.name = name;
//        this.notes = notes;
//        this.ingredient = ingredient;
//        this.servings = servings;
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

//    public Ingredient[] getIngredient() {
//        return ingredient;
//    }

    public void setIngredient(Ingredient ingred) {
        ingredient[ingredientSize] = ingred;
        ingredientSize++;
    }

    
    
    @Override
    public String toString() {
        String recipe = "Recipe: " + name + "\nNotes: " + notes + "\nServings: " + servings + "\nIngredient List:\n";
        recipe += "NAME\tAMT\tCAL.\tFAT\n";
        for ( int i = 0; i < ingredientSize; i++) {
            recipe += ingredient[i].toString() + "\n";
        }
            
        return recipe;
    }
    
    
}
