/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Tender
 */
public class PredicateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> letter = new ArrayList( Arrays.asList("Z","C","L","H","U","B") );
        List<String> letters = new ArrayList( Arrays.asList("D","B","A","C","F","G") );
        System.out.println(letters);
        Predicate<String> p1 = s -> s.compareTo("C") > 0;
        System.out.println(p1);
        Predicate<String> p2 = s -> s.equals("B");
        System.out.println(p2);
        
        letter.removeIf(p1.negate().or(p2));
        System.out.println(letter);
        letter.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(letter);
        
        letters.removeIf(p1.negate().or(p2));
        System.out.println(letters);
        letters.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(letters);
     }
    
}
