
package oca;

public class TypeInferenceGreeting {
    
    public static void main(String[] args) {
        String string = "Hello Lambda";
        // don't need the (String s) or you could use (s) or no parenthesis
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getClass());  // returns package.classADDRESS
        System.out.println( myLambda.getLength(string) );
    
    }
    @FunctionalInterface
    interface StringLengthLambda {
        int getLength(String s);
    }
    
    
}
