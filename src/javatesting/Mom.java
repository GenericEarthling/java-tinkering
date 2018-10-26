/*
 * Determines the order of execution for super classes and subclasses
 */
package javatesting;

public class Mom extends Grandma {
    public Mom() { 
        count++;
        System.out.println("Mom count is: " + count);
    }

    public static void main(String[] args) {
        System.out.println("Count is: " + count);        // Count is: 0 
        Mom daughter = new Mom();                        // Grandma count is: 1
                                                         // Mom count is: 2, 
        System.out.println("Count is : " + count);       // Count: 2
    }
}

class Grandma {
    protected static int count = 0;
    public Grandma(){ 
        count++;
        System.out.println("Grandma count is: " + count);
    }
    static int getCount() { return count; }
}
