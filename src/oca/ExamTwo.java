
package oca;

import static java.lang.Boolean.valueOf;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class ExamTwo {

    public static void main(String[] args) {
        int x=0;
        do {
            x=x+2;  // 2, 3, 4, 5, 6
            System.out.print("x: " + x + ", ");
//        } while (--x<5);  // breaks out of loop x = 6
        } while (x--<5);    // breaks out of loop x = 5
    System.out.println("\n..........Objects .............");
    ArrayList d1 = new ArrayList();
    Integer obj1 = 8;   
    Float obj2 = 3F;
//    obj1 = obj2;       // Float cannot be saved to an Integer
    System.out.println(obj1);
    System.out.println("..........overloaded methods.............");
    testLoops();
    testLoops(5);
    System.out.println(testLoops(9.5f));
    System.out.println("..........boolean.............");
    boolean b1 = false;
    Boolean b2 = false;
    System.out.println(b2.compareTo(b1));     // switching the booleans will cause: boolean cannot be dereferenced
    System.out.println(b2.compareTo(true));
    System.out.println(valueOf(b1).compareTo(b2));    
    int i1 = 1;
    Integer i2 = 1;
    // ucInteger.compareTo(lcinteger)  or  Integer.compareTo(int/Integer)  or  Object.compareTo(primative/wrapper)
    // int.compareTo(Integer)
    System.out.println(i2.compareTo(i1));  // switching the variables will cause dereference error
    System.out.println("...........Continue/Break............");    
    for (x =0; x<10; x++) {
        if(x%2 == 0) {
            System.out.print("x: " + x + " is even, ");
            break;
        } else {
            System.out.print("x: " + x + " is odd, ");
        }
        x++;
    }
    System.out.println("\n...........Primitives values............");    
    short value = -32768;          // up to 32767
    byte bite = -128;              // up to 127
    int number = 1;
    Number int1 = new Integer(0);
//    Double ddd = (Double)int1;           // runtime ClassCastException
//    System.out.println("Number converted to a Double: " + ddd); 
    System.out.println("...........MultiDimentional Arrays............");    
    int[][] intArray = new int[3][4];
    String[] str = new String[3];    
    Number i = 3.3d;
    i = i.intValue();
    int b = 1;
    int d;
    System.out.println(d=b+3);   // cannot add i because it's an object
    System.out.println(i); 
    System.out.println("...........Date/clone()/casting/try-catch...........");
    Date date = new Date();
//    Date dateA = ((Date)date).clone();   // clone() returns an object 

    try {
        Object dateA = (Date)date.clone();
        String[] stri = new String[3];
        stri[3]="three";                        // index out of bounds
        System.out.println(stri[1]);
    }catch(java.lang.ClassCastException | java.lang.ArrayIndexOutOfBoundsException e){
        System.out.println("classcast | arrayindexoutofbounds: "+e.toString());
    }catch(Exception ex){
        System.out.println("exception");
        ex.printStackTrace();
    }finally{
        System.out.println("finally");
    }
    

    }
    public static void testLoops(){
        int counter = 0;
        do {
            for (int i=0; i<100; i++) {
                counter++;
            }
            counter++;  
            System.out.println("testLoops() = "+counter);
            break;           
        }while(true);
    }    
    private static void testLoops(int i) {
        System.out.println(i);
    }
    private static int testLoops(float f) {
        int i = (int)f;
        return i;
    }
}
