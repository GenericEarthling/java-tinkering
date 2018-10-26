
package javatesting;

// Java program to demonstrate working of lambda expressions
public class LambdaTest {

    // operation is implemented using lambda expressions
    interface FunctionalInterface1  {
        int operation(int a, int b);
    }
 
    // sayMessage() is implemented using lambda expressions above
    interface FunctionalInterface2  {
        void sayMessage(String message);
    }
 
    // Performs FunctionalInterface1's calculation on 'a' and 'b'
    private int calculate(int a, int b, FunctionalInterface1 fiMessage)  {
        return fiMessage.operation(a, b);
    }
    
    public static void main(String[] args) {

        // lambda expression for addition for two parameters
        // data type for x and y is optional.
        // This expression implements 'FunctionalInterface1' interface
        FunctionalInterface1 add = (int x, int y) -> x + y;
 
        // lambda expression multiplication for two parameters
        // This expression also implements 'FunctionalInterface1' interface
        FunctionalInterface1 multiply = (int x, int y) -> x * y;
 
        // Creating an object of Test to call calculate using
        // different implementations using lambda Expressions
        LambdaTest lambdaTest = new LambdaTest();
 
        // Add two numbers using lambda expression
        System.out.println("Addition is " +
                          lambdaTest.calculate(6, 3, add));
 
        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " +
                          lambdaTest.calculate(6, 3, multiply));
 
        // lambda expression for single parameter
        // This expression implements 'FunctionalInterface2' interface
        FunctionalInterface2 fiMessage = message -> System.out.println("Hello "
                                                 + message);
        fiMessage.sayMessage("Geek");        
        
    }
    
}


