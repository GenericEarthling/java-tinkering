/**
 * Adding objects to the collection: add(E), addAll(Collection)
 * Testing size and membership: size(), isEmpty(), contains(E), containsAll(Collection)
 * Iterating over members: iterator()
 * Removing members: remove(E), removeAll(Collection), clear(), retainAll(Collection)
 * Generating array representations: toArray(), toArray(T[])
 * 
 * Iterator:
 * hasNext(): boolean 
 * next(): return next object
 * remove()
 */
package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tender
 */
public class HashList {


    public static void main(String[] args) {
        // create ingredient list and add to arraylist
        Ingredient ingred1 = new Ingredient("sugar", 240, 125, 3.2);
        Ingredient ingred2 = new Ingredient("flour", 400, 170, 5.5);
        Ingredient ingred3 = new Ingredient("milk", 200, 176, 2.5);
        Ingredient ingred4 = new Ingredient("sugar", 244, 135, 0);
        List listOfIngred = new ArrayList();
        listOfIngred.add(ingred1);
        listOfIngred.add(ingred2);
        listOfIngred.add(ingred3);
        listOfIngred.add(ingred4);
        
        System.out.println("Displaying a Recipe Object with Ingredients....................");
        // create recipe object(name,notes,servings,numOfIngred) and add ingredients
        Recipe recipe = new Recipe("Apple Pie", "cook the pie", 8, 4);
        recipe.setIngredient(ingred1);
        recipe.setIngredient(ingred2);
        recipe.setIngredient(ingred3);
        recipe.setIngredient(ingred4);
        System.out.print(recipe + "\n");

        System.out.println("Iterating over a HashSet of Ingredient objects....................");        
        // create hashset (TreeSet to get them sorted)
        Set<Ingredient> unique = new HashSet<>();
        unique.add(ingred4);
        unique.add(ingred3);
        unique.add(ingred1);
        unique.add(ingred2);
        
        // display the ingredient list list
        Iterator iter = unique.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }

        System.out.println("\nIterating over a HashMap....................");
        // HashMap
        Map<String, Ingredient> map2 = new HashMap<>();
        map2.put(ingred1.getName(), ingred1);
        System.out.println(map2);
        
        Map<String, ArrayList<Object>> map = new HashMap<>();
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("e");
        list2.add("f");
        map.put("one", list1);
        map.put("two", list2);

        for(Entry<String, ArrayList<Object>> en : map.entrySet()){
            for(Object obj : en.getValue()){
                System.out.print(en + ": " + obj + "\n");
            }
        }
        System.out.println();
        
//        // -----------------------------------------------------
//        HashMap<String, Integer> aMap = new HashMap<String,Integer>();
//        String parm0="key1", parm1="123";
//        doWork(aMap, parm0, parm1);
//        Integer test = aMap.get(parm0);
//        System.out.println(test.toString());
    }
//    private static void doWork(HashMap aMap, Object parm0, Object parm1){
//        aMap.put(parm0, parm1);
//    }
}
