/*
 * Exception handling classes always extends Exception
 */
package exceptions;

public class InvalidRadiusException extends Exception {
    private double radius;

    // calls the Exception (super) construction
    public InvalidRadiusException(double radius) {
        super("Error in InvalidRadiusException Class, Invalid radius: " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
     
    
    
}
