/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Tender
 */
public class CircleWithRadiusException {
    
    private double radius;
    private static int numberOfObjects = 0;
    
    // default constructor (this) calls the following constructor
    public CircleWithRadiusException() {
        this(1.0);
    }

    public CircleWithRadiusException(double newRadius) {
        try {
            setRadius(newRadius);
            numberOfObjects++;
            System.err.println("Number of Objects are: " + numberOfObjects);
        } catch (InvalidRadiusException ex) {
            ex.printStackTrace();
        }
    }

    // I think this should be protected or private
    public void setRadius(double newRadius) 
        throws InvalidRadiusException {
        if (newRadius >= 0) {
            radius = newRadius;
        } else {
            throw new InvalidRadiusException(newRadius);
        }
    }

    public double getRadius() {
        return radius;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }    
    
    // don't think i need these two
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }       
    public static void setNumberOfObjects(int numberOfObjects) {
        CircleWithRadiusException.numberOfObjects = numberOfObjects;
    }   
    
}
