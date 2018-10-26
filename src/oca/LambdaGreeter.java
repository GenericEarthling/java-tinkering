/**                PROGRAMMING TO AN INTERFACE
 * These are together: LambdaGreeter Greeting, HellowWorldGreeting
 * Greeting is an interface
 * HellowWorldGreeting implements Greeting
 *      overrides perform() method
 */
package oca;

public class LambdaGreeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    
    public static void main(String[] args) {    
        LambdaGreeter greeter = new LambdaGreeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello");   
        
        // inner class 
        Greeting innerClassGreeting = new Greeting(){
            public void perform() {
                System.out.println("Hello from innerClassGreeting.");
            }
        };   // don't forget the semi-colon for inner class
        
        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);
        greeter.greet(helloWorldGreeting);
        
        
    }
}
// Hello
// Hello from innerClassGreeting.
// ... from HelloWorldGreeting