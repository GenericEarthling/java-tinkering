/**
 * 1. Boolean class has two constructors - Boolean(String) and Boolean(boolean)
 * The String constructor allocates a Boolean object representing the value true 
 * if the string argument is not null and is equal, ignoring case, to the string 
 * "true". Otherwise, allocate a Boolean object representing the value false. 
 * Examples: new Boolean("True") produces a Boolean object that represents true. 
 * new Boolean("yes") produces a Boolean object that represents false.
 * 
 * 2. Boolean class has two static helper methods for creating booleans - 
 *      parseBoolean and valueOf
 * parseBoolean
 * Boolean.parseBoolean(String ) method returns a primitive boolean  
 * The boolean returned represents the value true if the string argument is not 
 * null and is equal, ignoring case, to the string "true". 
 * valueOf
 * Boolean.valueOf(String ) and its overloaded Boolean.valueOf(boolean ) version, 
 * return a reference to either Boolean.TRUE or Boolean.FALSE wrapper objects. 
 * They don't create a new Boolean object but just return static constants

3. Using equality operator ( == ) with booleans, 
* if exactly one of the operands is a Boolean wrapper, it is first unboxed into 
* a boolean primitive and then the two are compared (JLS 15.21.2). 
* If both are Boolean wrappers, then their REFERENCES are compared just like 
* in the case of other objects. Thus, new Boolean("true") == new Boolean("true") 
* is false, but new Boolean("true") == Boolean.parseBoolean("true") is true.
 */
package oca;

import java.lang.System.*;
import static java.lang.System.out;

public class Booleans {

    public static void main(String[] args) {
        out.println(new Boolean("true")); // true
        out.println(new Boolean("true") == new Boolean("true")); // false (#3 above)
        out.println(new Boolean("true") == Boolean.parseBoolean("true")); // true
        out.println(Boolean.valueOf("true") == Boolean.parseBoolean("true")); // true
        out.println(Boolean.valueOf("true") == Boolean.valueOf("true")); // true
        out.println(Boolean.valueOf("true") == Boolean.valueOf(Boolean.TRUE)); // true - comparing objects
        out.println();  

        Boolean b = new Boolean("true"); 
        boolean c = true;
        out.println(b == c);                           // true
        out.println(Boolean.valueOf("true") == b);     // false
        out.println(Boolean.valueOf("true") == c);      // true - comparing values
        out.println(new Boolean("true") == b);         // false 
        out.println(Boolean.valueOf("true") == b);      // false
        out.println(Boolean.parseBoolean("true") == c); // true
        out.println(); 

        Boolean d = new Boolean("true");
        Boolean e = new Boolean(Boolean.TRUE);
        out.println(d == e);                  // false
        out.println(Boolean.TRUE == e);       // false - comparing wrapper object REFERENCE 
        out.println(true == e);               // true
        out.println(Boolean.TRUE == true);    // true - comparing values
       
      System.out.println(".......... Testing Logical Operators .............");  
      int i = 0 ;
      boolean bool1 = true ;
      boolean bool2 = false;
      boolean bool  = false;
      bool = ( bool2 &  method1(i++) ); //1  
      System.out.println(bool);
      bool = ( bool2 && method1(i++) ); //2 
      System.out.println(bool);
      bool = ( bool1 |  method1(i++) ); //3
      System.out.println(bool);
      bool = ( bool1 || method1(i++) ); //4
      System.out.println(bool);
      System.out.println(i);    
    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }
    
}
