
package javatesting;

import java.io.PrintStream;
import java.lang.Math;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PrimativeStreams {
    int primativeStreams;

    public static void main(String[] args) {
        IntStream.range(1,4)
                .forEach(System.out::print);        
        System.out.println();
        
        // find the average of the numbers squared
        Arrays.stream(new int[] {1,2,3,4})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);    
        System.out.println();
        
        
        // map doubles to ints
        Stream.of(1.5, 2.3, 4.5)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);        
        System.out.println();

        // -incrementing a primitive through a method call does NOT change the 
        // value even if it is resaved to a variable
        // -must use static import to use abs() without the class name of Math
        int i = Math.abs(-21);
        int[] iArr = {1,2,4,5};
        System.out.println(i);
        i = 2;
        i = increment(i);
        System.out.println(i);
        
        System.out.println(System.console());
        

    }
    public static int increment(int num){
        int a;
        return num++;
    }
}
