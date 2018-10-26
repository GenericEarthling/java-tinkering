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
public class RadiusExceptionTest {

    
    public static void main(String[] args) {
        CircleWithRadiusException c1 = new CircleWithRadiusException();
        System.out.println("Area of () is: " + c1.findArea());
        
        CircleWithRadiusException c2 = new CircleWithRadiusException(120);
        System.out.println("Area of 120 is: " + c2.findArea());
        
        CircleWithRadiusException c3 = new CircleWithRadiusException(42);
        System.out.println("Area of 42 is: " + c3.findArea());
        
        CircleWithRadiusException c4 = new CircleWithRadiusException(-45);
        System.out.println("Area of -45 is: " + c4.findArea());
        
    }
    
}
