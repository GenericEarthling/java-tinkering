
package functional_interfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample_1 {

    public static void main(String[] args) {
        Predicate<String> length = (s) -> s.length() > 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean,String> booleaner = i -> Boolean.toString(i);
        Function<String,Boolean> stringer = s -> Boolean.parseBoolean(s);
        
        System.out.println("A: "+ booleaner.compose(stringer).apply("true").substring(0,3));
//        System.out.println("B: "+ booleaner.andThen(stringer).apply("true"));
        System.out.println("C: "+ stringer.compose(booleaner).apply(true));
        System.out.println("D: "+ length.negate().or(equalizer).test("CAR"));
        System.out.println("E: "+ booleaner.apply(true));
    }
    
}
