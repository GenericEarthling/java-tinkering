/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tender
 */
public class Lists {

    static void runThis() {
//        List<String> list = Arrays.asList("red", "green", "blue")
        Arrays.asList("red", "green", "blue")
            .stream()
//                .anyMatch(s -> s.startsWith("b"))  // Output: will not compile
                .filter(s -> !s.startsWith("b"))  // Output: red, green
//                .filter(s -> s.length() !=4)  // Output: red, green
//            .reduce( (s1,s2) -> s2.equals("blue")? s1 : s2)  // Output: will not compile
//            .map(s -> !s.startsWith("b"))  // Output: true, true, false
            .forEach(System.out::println);

    }
    public static void main(String[] args) {
        runThis();
    }
    
}
