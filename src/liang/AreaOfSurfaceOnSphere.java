/**
 * Chap 4, 4.3
 * Compute the estimated area enclosed by 4 cities
 * GPS locations: (latitude, longitude)
 *  Atlanta, Georgia    33.7 -84.3
 *  Orlando, Florida    28.5 -81.3
 *  Savannah, Georgia   32.0 -81.0
 *  Charlotte, North Carolina   35.2 -80.8
 *                     829.6493732390925 nautical miles
 */
package liang;

/**
 *
 * @author Tender
 */
public class AreaOfSurfaceOnSphere {

    public static void main(String[] args) {
        System.out.println("------------Method #1------------------");   
        // using law of cosines
        // find distance between 2 cities
        double ax = Math.toRadians(33.7);  //atlanta
        double ay = Math.toRadians(-84.3);
        double ox = Math.toRadians(28.5);  // orlando
        double oy = Math.toRadians(-81.3);
        double sx = Math.toRadians(32.0);  // savannah
        double sy = Math.toRadians(-81.0);
        double cx = Math.toRadians(35.2);  // charlotte
        double cy = Math.toRadians(-80.8); 
        
        // great circle distance in radians
        double a2o = getAngleInRadians(ax, ay, ox, oy); // a ax
        double o2s = getAngleInRadians(ox, oy, sx, sy); // b ox
        double s2c = getAngleInRadians(sx, sy, cx, cy); // c sx
        double c2a = getAngleInRadians(cx, cy, ax, ay); // d cx
        double a2s = getAngleInRadians(ax, ay, sx, sy); // e

        // convert back to degrees with Math.toDegrees() method
        // multiply by 60 to get nautical miles
        //   - each degree on a great circle of Earth is 60 nautical miles
        double a2oAngleInDegrees = Math.toDegrees(a2o)*60; // side: a
        double o2sAngleInDegrees = Math.toDegrees(o2s)*60; // side: b
        double s2cAngleInDegrees = Math.toDegrees(s2c)*60; // side: c
        double c2aAngleInDegrees = Math.toDegrees(c2a)*60; // side: d
        double a2sAngleInDegrees = Math.toDegrees(a2s)*60; // side: e
        System.out.println("Side 1: "+a2oAngleInDegrees+"  Side 2: "+o2sAngleInDegrees+"  Side 3: "+s2cAngleInDegrees+"  Side4: "+ c2aAngleInDegrees);

        // Divide the polygon into two triangles and compute the area of a triangle
//        double triangleArea1 = Math.abs( ((ax*(oy-sy) + ox*(sy-ay) + sx*(ay-oy))/2) );
//        double triangleArea2 = Math.abs( ((ax*(cy-sy) + cx*(sy-ay) + sx*(ay-cy))/2) ); 
        double triangleArea1 = (a2oAngleInDegrees + o2sAngleInDegrees + a2sAngleInDegrees)/2;
        double triangleArea2 = (s2cAngleInDegrees + c2aAngleInDegrees + a2sAngleInDegrees)/2;
        
        double triArea = triangleArea1 + triangleArea2;
        System.out.println("A Triangle 1 area is: " + triangleArea1);
        System.out.println("A Triangle 2 area is: " + triangleArea2);
        System.out.println("A Triangle 1 + Triangle 2 = "+triArea);

        System.out.println("------------Method #2------------------");
        // formula from Liang Chapt 2 
        double areaTotal;
        double side1 = distanceBetweenTwoPoints(ax, ay, ox, oy);
        double side2 = distanceBetweenTwoPoints(ox, oy, sx, sy);
        double side3 = distanceBetweenTwoPoints(sx, sy, cx, cy);
        double side4 = distanceBetweenTwoPoints(cx, cy, ax, ay);
        double side5 = distanceBetweenTwoPoints(ax, ay, sx, sy);
        double triangle = (side1 + side2 + side3)/2;
        double triangle2 = (side3 + side4 + side5)/2;
        double area =  Math.sqrt( (triangle*(triangle-side1)*(triangle-side2)*(triangle-side3)) );
        double area2 = Math.sqrt((triangle2*(triangle2-side3)*(triangle2-side4)*(triangle2-side5)));
        areaTotal = area + area2;
        System.out.println("Side 1: "+side1+"  Side 2: "+side2+"  Side 3: "+side3+"  Side4: "+ side4);
        System.out.println("B Triangle 1 area is: " + area);
        System.out.println("B Triangle 2 area is: " + area2);
        System.out.println("B Triangle 1 + Triangle 2 = "+areaTotal);

        System.out.println("----------- nautical miles --------------");
        System.out.println(a2oAngleInDegrees + " miles atlanta to orlando");
        System.out.println(o2sAngleInDegrees + " miles orlando to savannah");
        System.out.println(s2cAngleInDegrees + " miles savannah to charlotte");
        System.out.println(c2aAngleInDegrees + " miles charlotte to atlanta");
         
    }

    private static double getAngleInRadians(double x1, double y1, double x2, double y2) {
        return Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }
    
    private static Double distanceBetweenTwoPoints(double oneX, double oneY, double twoX, double twoY) {
    double result = Math.sqrt((Math.pow((twoX-oneX), 2))+(Math.pow((twoY-oneY), 2)));
    return result;
    }
}
