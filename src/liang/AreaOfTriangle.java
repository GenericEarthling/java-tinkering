/*
 * Liang Ch2, 2.19
enter 3 points
1.5 -3.4 4.6 5 9.5 -3.4
s = (side1 + side2 + side3)/2
area = sqrt(s(s-side1)(s-side2)(s-side3)
or
area = Math.abs( Ax(By-Cy) + Bx(Cy-Ay) + Cx(Ay-By)/2 )
 */
package liang;

import java.util.Scanner;

/**
 *
 * @author Tender
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 points for the triangle: ");
        double aX = in.nextDouble();
        double aY = in.nextDouble();
        double bX = in.nextDouble();
        double bY = in.nextDouble();
        double cX = in.nextDouble();
        double cY = in.nextDouble();
        
        // formula from: https://www.mathopenref.com/coordtrianglearea.html
        Double area = Math.abs( (aX*(bY-cY) + bX*(cY-aY) + cX*(aY-bY))/2 );
        System.out.println("Area is: " + area);
        
        // formula from Liang Chapt 2 
        area = 0.0;
        Double side1 = distanceBetweenTwoPoints(aX,aY,bX,bY);
        Double side2 = distanceBetweenTwoPoints(bX,bY,cX,cY);
        Double side3 = distanceBetweenTwoPoints(cX,cY,aX,aY);
        Double s = (side1 + side2 + side3)/2;
        area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        
        System.out.println("Side 1: "+side1+"  Side 2: "+side2+"  Side 3: "+side3);
        System.out.println("Second Area is: " + area);
    }

    private static Double distanceBetweenTwoPoints(double oneX, double oneY, double twoX, double twoY) {
        double result = Math.sqrt((Math.pow((twoX-oneX), 2))+(Math.pow((twoY-oneY), 2)));
        return result;
    }
    
}
