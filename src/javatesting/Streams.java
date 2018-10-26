/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatesting;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Tender
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stream.of("red", "teal", "green", "yellow", "blue", "Apple", "apple", "black", "orange")
//                    .distinct()                          // stream reference pipeline number 
//                    .count()                           // prints 9
//                    .min((a,b) -> a.compareTo(b))      // prints Apple
//                    .filter(c -> c == "apple")         // stream reference pipeline number                
//                    .filter(s -> s.endsWith("n"))      // prints green
//                    .orElse("yellow")                  // prints yellow
                .filter(color -> { 
                    System.out.println("filter: " + color);
                    return color.startsWith("t");        // predicate
                    
                })
                // the foreach makes it a terminal event
                // if foreach is removed, nothing will print
                .forEach(color -> System.out.println("Starts with t: " + color)
                );
        
        
        Arrays.asList("red", "teal", "green", "yellow", "blue", "Apple", "apple", "black", "orange")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);    // prints Apple
    }
    
}
