
package oca;

public class DataTypes {

    public static void main(String[] args) {
        float floatWithF = -143.53f;       // compiler error if 'f' is missing
        float castFloat = (float)-143.53;  // must cast
        float f = -123;                    // implicit widening conversion
        float f1 = 3;
        float minFloat = new Float(Float.MIN_NORMAL);
        byte b = 127;
        float f2 = b;
        System.out.println(minFloat);
        System.out.println(f2);
    }
    
}
