/*
 * TESTING equals and ==
 * Tracing object calls to super
 */
package javatesting;


public class Equals extends Test {

    public static void main(String[] args) {
        System.out.println("Testing equals w/string......................");
        String first = "first";
        String second = new String("first");
        first = second;
        System.out.println(first.equals(second));         // true, checks the content 
        System.out.println(first == second);              // true, checks the reference
        System.out.println(second == "first");            // false, checks reference
        System.out.println(first.equals("first"));        // true, checks content
        
        System.out.println();
        System.out.println("Tracing object calls......................");
        
        // TESTING object calls
        Test eTest1 = new Test();
        System.out.println("1 object created, Count = " + getCount());      // Count = 1
        Test eTest2 = new Equals();
        Test eTest3 = new Equals();
        System.out.println("+2 more objs created, Count = " + getCount());  // Count = 3
        
        System.out.println();
        System.out.println("Testing equals w/objects......................");
        
        // TESTING class objects and equals
         eTest1 = eTest2;                                 // makes a shallow copy of reference
        System.out.println(eTest1.equals(eTest2));        // true, checks content
        System.out.println(eTest1 == eTest2);             // true, checks ref. address
        System.out.println(eTest1.equals(eTest3));        // false
        System.out.println(eTest1.toString());            // eTest1/eTest2 are same reference
        System.out.println(eTest2.toString());            // eTest1/eTest2 are same reference
        System.out.println(eTest3.toString());            // eTest3 diff. ref. address
        
        System.out.println("\nTesting getClass()......................");
        System.out.println(eTest3.getClass());    //eTest2.getClass(): class javatesting.Equals

        System.out.println("\nArrays can implement methods of lang.Object?......................");
        int[] a = new int[3];
        int[] b;
        a[0] = 5;
        a[1] = 4;
        a[2] = 10;
        b = a.clone();                             // returns equal content, but not equal ref. address
        System.out.println("b.equals( a )? "+ b.equals(a));  // false, even though content is equal
        System.out.println("b == a? "+ (b==a));              // false
        System.out.println("b = " + b[1] + "  a = " + a[1]);
        System.out.println("b = " + b + "  a = " + a);
        b = a;                                               // returns equal content, AND equal ref. address
        System.out.println("b.equals( a )? "+ b.equals(a));  // true
        System.out.println("b = " + b[2] + "  a = " + a[2]);
        System.out.println("b = " + b + "  a = " + a);       // returns same ref. address
    }
    
}
class Test {
    protected static int count = 0;
    public Test(){ count++; }
    static int getCount() { return count; }
    
    
        
    }

