/**
 *  Nautical miles
 *  Given the latitude and longitude (in degrees) of two points compute
 *  the great circle distance (in nautical miles) between them. The
 *  following formula assumes that sin, cos, and acos are computed
 *  in degrees, so need to convert back and forth between radians.
 *
 *     d  = 60 * acos (sin(L1)*sin(L2) + cos(L1)*cos(L2)*cos(G1 - G2))
 *
 *  27.87 -82.32 riverview
 *  32.74 -97.33 ft worth
 *  1537.420622235217 result in GreatCircle1
 */
package liang;


public class GreatCircle2 { 
    public static void main(String[] args) { 
        double x1 = Math.toRadians(27.87);
        double y1 = Math.toRadians(-82.32);
        double x2 = Math.toRadians(32.74);
        double y2 = Math.toRadians(-97.33);

       /*************************************************************************
        * Compute using law of cosines
        *************************************************************************/
        // great circle distance in radians
        double angle1 = Math.acos(Math.sin(x1) * Math.sin(x2)
                      + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        // convert back to degrees
        angle1 = Math.toDegrees(angle1);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance1 = 60 * angle1;

        System.out.println(distance1 + " nautical miles");


       /*************************************************************************
        * Compute using Haverside formula
        *************************************************************************/
        double a = Math.pow(Math.sin((x2-x1)/2), 2)
                 + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2);

        // great circle distance in radians
        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle2 = Math.toDegrees(angle2);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance2 = 60 * angle2;

        System.out.println(distance2 + " nautical miles");
    }

}