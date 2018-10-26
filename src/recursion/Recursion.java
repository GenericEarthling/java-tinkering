
package recursion;


public class Recursion {

    public static void main(String[] args) {
        myMethod(2);
    }

    public static void myMethod( int counter) {
        if(counter == 0)
            System.out.println("counter = 0");
        else {
           System.out.println("hello, counter is at " + counter);
           
           // recursion part
           myMethod(--counter);
           System.out.println(counter);
        }
} 
    }
    

