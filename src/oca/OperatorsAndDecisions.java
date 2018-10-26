
package oca;

public class OperatorsAndDecisions {

    public static void main(String[] args) {
        System.out.println("...Finding NullPointerException.....");
        // Which of the following lines of code may throw a NullPointerException in certain situations?
        int i = 0;
        String s = "word";
//        s = null;
        if ((s != null) | ( i==s.length())) 
            System.out.println("A");
//        s = null;
        if ((s == null) | ( i==s.length())) 
            System.out.println("B");
//        s = null;
        if ((s != null) || (i==s.length())) 
            System.out.println("C");
//        s = null;
        if ((s == null) || (i==s.length())) 
            System.out.println("D");
        System.out.println();
        
        System.out.println("...Testing condition? this : that ..............");
        System.out.println( 10>20 ? out1() : out2() );
        System.out.println();

        System.out.println("...if-elseif-else ..............");    
        if ( 10 == 20 )
            System.out.println("if (true)");
        else if (20 == 10)
            System.out.println("else if (true)");
        else
            System.out.println("else");
       System.out.println();

        System.out.println("...explicit casting ..............");    
        short x = 2;
        int u = 3;
        x += u;
        byte v = (byte)u;    // must explicitly cast
//        byte z = v * v;    // compile error: ALL math operations promote 
//        short q = x * x;   //        short/byte to at least ints
        int p = 'k' * 1;   // can perform math on chars
        int k = 'k';
        System.out.println(k);
        System.out.println(p);
       System.out.println();

       System.out.println("... Ternary Operator ..............");
       double f = Math.random();
       boolean mathstrg = f <.05? true : false;
       System.out.println(f+" is " +mathstrg);

       System.out.println("...  .............."); 
    }
    public static int out1() { return 2;}
    static public byte out2() { return 3; }
    
}
