
package javatesting;

public class DataTypes {

    public static void main(String[] args) {
        
        System.out.println("........DATA TYPES..........");
        boolean bool = false;                 // default false
        byte byteish = 127;                // -128 - 127
        char charlie = '\u0041';           // A (default \u0000 = 0)
        char sp = 'A';                     // numeric value is 65
        char c = 65;                       // prints A
        short shorty = 32767;              // -32,768 
        int intish   = 231;                // -2^31
        long longish = 1222222222;         // -2^63
        float floaty = 1.23e9f;                 // single precision 1.23e100f
        double doubly = 1.23e100d;                // double precision (more decimal places)

        long longValue = 100;
        byte b = (byte)longValue;
        
        System.out.println(c);
        System.out.println(sp + charlie);
        System.out.println(doubly + doubly);
    }
    
}
