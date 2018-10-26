
package jvm;

import java.lang.Runtime.*;

public class JavaVirtuaMemoryInfo {

    public static void main(String[] args) {
        System.out.println("Current JVM Heap Size: " + Runtime.getRuntime().totalMemory());
        System.out.println("Maximum JVM Heap Size: " + Runtime.getRuntime().maxMemory());
        System.out.println("Free JVM Heap Size: " + Runtime.getRuntime().freeMemory());
    }
    
}
