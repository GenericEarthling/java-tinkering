/**
 * https://www.geeksforgeeks.org/java-8-predicate-with-examples/
 */
package functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> lesserthan = i -> (i<18);
        System.out.println(lesserthan.test(18));
    }


    
}
