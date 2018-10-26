/**
 * Consumer Functional Interface
 * accept(), andThen()
 * example from:
 * https://www.javabrahman.com/java-8/java-8-java-util-function-consumer-tutorial-with-examples/
 */
package functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAccept {

    public static void main(String[] args) {
        Consumer<Integer> consumer = i -> System.out.print(" " + i);
        Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.print("( printed " + i + "), "));
        List<Integer> integerList = Arrays.asList(new Integer(1),
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));
        printList(integerList, consumer);
        printList(integerList, consumerWithAndThen);
        System.out.println("\n...... Each of the objects ..............");
        System.out.println(integerList);
        System.out.println(consumer);
        System.out.println(consumerWithAndThen);
    }

    private static void printList(List<Integer> integerList, Consumer<Integer> consumer) {
        for (Integer integer:integerList) {
            consumer.accept(integer);
        }
        System.out.println();
    }
    
}
