 /**
 * Variable-Length Argument Lists used in method parameters
 * treats variable-length parameter as an array.
 * Java Language Specification refers to it as: variable arity parameter
 */
package array;


public class EllipsisInParameter {

    public static void main(String[] args) {
        printMax(34,5,66,28,19);
        printMax(4.5,6.5,8.3,99,45.6,41.2,42,33.65);
    }

    private static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] > result)
                result = numbers[i];
        }
        System.out.println("The max value is: " + result);
    }
    
}
