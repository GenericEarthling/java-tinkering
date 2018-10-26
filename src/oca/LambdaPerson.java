/**
 * Using Predicate and Consumer
 * Connected to Person.java
 */
package oca;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaPerson {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Lucien", "Tender", 50),
                new Person("Sharon", "Tender", 51),
                new Person("Mark", "Jackson", 30),
                new Person("Kate", "Bently", 25),
                new Person("Wally", "Brick", 90)
                );
        /**
         * create a method that prints all elements Sort list by last name
         */
//        // old way...
//        System.out.println("\nAnonymous Inner Class sort by last name: ");
//        Collections.sort(people, new Comparator<Person>(){
//            @Override
//            public int compare(Person p1, Person p2){
//                return p1.getFirstName().compareTo(p2.getFirstName());
//            }
//        });
        printAll(people);        
        // Lambda way
        System.out.println("\nLambda sort by last name: ");
        Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
        performConditionally(people, p -> true, p -> System.out.println(p));  

        System.out.println("\nDoes the sorted order stay sorted?: Yes");
        printAll(people);

        /**
         * create a method that prints all peeps with last name begin with B, 
         * methods should accept behavior instead of hardcoding
         */
//        System.out.println("\nAnonymous Inner Class last name starts with B: ");        
//        performConditionally(people, new Condition(){            
//            @Override
//            public boolean test(Person p) {
//                return p.getLastName().startsWith("B");
//            }
//        });
        System.out.println("\nLambda Last name starts with B: ");
        performConditionally(people, p -> p.getLastName().startsWith("B"), p -> System.out.println(p));
        performConditionally(people, p -> p.getFirstName().startsWith("S"), p -> System.out.println(p));
    }

    private static void printAll(List<Person> people) {
        for (Person p : people)
            System.out.println(p);
    }

//    // old way
//    private static void performConditionally(List<Person> people, Condition condition) {
//        for (Person p : people){
//            if (condition.test(p)){
//                System.out.println(p);
//            }
//        }
//    }
    
    // Lambda way using a Predicate
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
    for (Person p : people){
        if (predicate.test(p)){
            consumer.accept(p);
        }
    }
    }
}

interface Condition {
    boolean test(Person p);
}