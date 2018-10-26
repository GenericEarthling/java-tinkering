/**
 * 
 */
package objects_variables;

public class ObjectPlay {

    public static void main(String[] args) {
//        Object object = new Object();
        Object object = null;
        System.out.println(object);
        Object object2 = null;
        System.out.println(object2);
        System.out.println(object == object2);
//        System.out.println(object2.equals(object));    // null pointer Exception
        object2 = new Object();
        Exception e = new Exception();
        System.out.println(e.toString());  // prints class (java.lang.Exception)
        System.out.println(object2.toString());  // prints class and ref address
        
        String value1 = "null";
        String value2 = null;
        System.out.println(value1.equals(value2));  // returns false
        value2 = "null";
        System.out.println(value1.equals(value2));  // returns true
        value2 = "Null";
        System.out.println(value1.equalsIgnoreCase(value2));  // returns true
        
        int[][] array = new int[3][];
         
    }
    
}
