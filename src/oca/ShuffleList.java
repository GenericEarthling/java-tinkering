/*
This link pertains to the mixItUp() method, but it uses a deck of cards
https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

This program has a runtime exception
*/
package oca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ShuffleList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("cake", "donuts", "cookies", "jelly",
                "peanut", "butter", "flour", "pastries", "candy", "chocolate");
//        Collections.shuffle(list);
        System.out.println(list);
        List<String> list2 = list.subList(6, 10);
        System.out.println(list2);
        int j = list.subList(8, 9).lastIndexOf("candy");
        System.out.println(j + " " + list);
        
//        ArrayList<String> smallBowl = mixItUp(list, 5);
//        System.out.println(mixItUp(list, 5));
        
    }
    public static <E> List<E> mixItUp(List<E> ingred, int n) {
        int ingredSize = ingred.size();
        List<E> bowlView = ingred.subList(ingredSize - n, ingredSize);
        List<E> smBowl = new ArrayList<E>(bowlView);
        bowlView.clear();
        return smBowl;
}
}
