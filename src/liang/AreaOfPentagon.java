/*
Vertex is the the point at which the sides of the pentegon meet.
 */
package liang;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Tender
 */
public class AreaOfPentagon {

    public static void main(String[] args) {
        System.out.println( "\nFind the area of a pentagon...." );
        double centerToVertex = 5.5;
        double side = 0;
        double area = 0;
        
        side = (2 * centerToVertex) * ( Math.sin(Math.PI/5) );
        area = (5 * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI/5) );
        System.out.println( area );

        // Big Decimal, rounding UP 2 decimals
        System.out.println( "\nUsing Big Decimal...." );
        BigDecimal bd = new BigDecimal(area);
        double bdArea = bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
//        double bdArea = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        double bdArea = bd.doubleValue();
        System.out.println( bdArea );
        
        // formating
        System.out.println( "\nFormatted to 2 decimals...." );          
        DecimalFormat df = new DecimalFormat("#00.##");
        area = Double.valueOf(df.format(area));        
        System.out.println( area );        
    }
    
}
