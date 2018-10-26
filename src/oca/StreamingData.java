/**
 * .filter() takes a Predicate
 * .anyMatch() returns a boolean
 * .map() used to apply a function to the data in the stream
 *      can be used to extract data from an element .map(Transaction::getId)
 * .reduce() takes 2 parameters:  .reduce(initialValue, BinaryOperator<T>  to 
 *      combine 2 elements to produce a new value
 * .findAny() .findFirst() return an Optional
 * .max() Returns: an Optional describing the maximum element of this stream, 
 *      or an empty Optional if the stream is empty
 * 
 * easy to read article
 * http://www.oracle.com/technetwork/articles/java/ma14-java-se-8-streams-2177646.html
 */
package oca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingData {

    public static void main(String[] args) {
        String[] list = {"red","green","blue"};
        List<String> colors = Arrays.asList("red","green","blue");
        List<String> result = colors.stream()
                .filter( s -> ! s.startsWith("b") )
                .collect(Collectors.toList());
        System.out.println(result);                 // d [red, green]
        
        result = colors.stream()
            .filter( s -> s.length() != 4 )
            .collect(Collectors.toList());
        System.out.println(result);                 // c [red, green]
        
       
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,6,8);
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);            // 34560
        int products = numbers.stream()    
                .reduce(1, Integer::max);                // 8            
        System.out.println(product); 
        
        System.out.println( Stream.of("red","green","blue")
                .max( (s1,s2) -> s1.compareTo(s2) )         // Optional[red]
                .filter( s -> s.endsWith("n"))              // Optional.empty
                .orElse("yellow")                           // yellow
                );
        System.out.println( Stream.of("apple","green","blue")
                .max( (s1,s2) -> s1.compareTo(s2) )         // Optional[green]
                .filter( s -> s.endsWith("n"))              // Optional[green]
                .orElse("yellow")                           // returns: green
                );

    }
    
}

