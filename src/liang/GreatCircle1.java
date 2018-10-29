/*
 *  kilometers
 *  Geometry: great circle distance
 *  Distance between 2 points on the surface of a sphere
 *  Given the latitude and longitude (in degrees) of two points compute
 *  the great circle distance (in nautical miles) between them. The
 *  following formula assumes that sin, cos, and arcos are comptued
 *  in degrees, so need to convert back and forth between radians.

    distance in degrees = radius * acos (sin(x)*sin(xx) + cos(x)*cos(xx)*cos(y - yy))

    acos() = Returns the arc cosine of a value; 
             the returned angle is in the range 0.0 through pi
 */
package liang;

import java.util.Scanner;
/**
 *
 * @author Tender
 */
public class GreatCircle1 {

    public static void main(String[] args) {
//        27.875330 -82.322580   -- Riverview, FL
//        32.749900 -97.330340   -- Fort Worth, TX
 
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and Longitude in degrees): ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.print("Enter point 2 (latitude and Longitude in degrees): ");
        double xx = input.nextDouble();
        double yy = input.nextDouble();
        double radius = 6_371.01;        // avg radius of earth in km
        
        // The degree values are passed to method
        // The method converts the values to radians
        // The double returned is the angle in degrees in kilometers
        // NOTE: The degrees of the angle is from the center of the circle 
        //       radiating out to the two points on the spheres' (earth) surface.
        double distanceInRadians = distanceBetweenPoints(radius, x, xx, y, yy);
        
        // display results
        System.out.println("The distance in kilometers is " + distanceInRadians);        
    }
    static double distanceBetweenPoints(double radius, double x, double xx, double y, double yy) {
        return radius * Math.acos(
                  Math.sin(Math.toRadians(x)) * Math.sin(Math.toRadians(xx))
                + Math.cos(Math.toRadians(x)) * Math.cos(Math.toRadians(xx))
                * Math.cos(Math.toRadians(y-yy))
        );
    }
    
}
