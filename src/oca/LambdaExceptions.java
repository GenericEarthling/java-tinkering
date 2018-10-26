/**
 * By moving the try catch block to another BiConsumer/Lambda, the method 
 * has a cleaner easy to read code.
 * 
 * This will take each number in the array and divide by 3 (key)
 */
package oca;

import java.util.function.BiConsumer;

public class LambdaExceptions {

    public static void main(String[] args) {
        
        int [] someNums = { 51,62,23,14,5 };
        int key = 3;
        
        // process() method w/3 parameters; try catch is in wrapperLambda() method
        process(someNums, key, wrapperLambda( (v,k) -> System.out.println(v/k) ));
            
        System.out.println();
    }

    private static void process(int[] someNums, int key, BiConsumer<Integer, Integer> consumer) {
        for ( int i : someNums){
           consumer.accept(i, key);
           System.out.println("i = "+ i + " key = " + key + " -- i/key = " + (i/key));
        }
    }
    
    // wrapper class to perform try/catch exceptions that returns a lambda
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v,k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException ae) {
                System.out.println("Wrapper Lambda Exception caught: " + ae);
            }
        };
    }
    
}
