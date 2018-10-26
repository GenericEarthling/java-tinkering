/**
 */
package strings;

/**
 *
 * @author Tender
 */
public class OCAAssignmentOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte a;
        a = 10;
        System.out.println("sb 13    " + (a += 3) ); // 13
        a = 15;
        System.out.println("sb 12    " + (a -= 3) );
        a = 20;
        System.out.println("sb 60    " + (a *= 3) );
        a = 25;
        System.out.println("sb 8    " + (a /= 3) );
        a = 65;
        System.out.println("sb 2    " + (a %= 3) );
        a = 35;
        System.out.println("sb 3    " + (a &= 3) ); // unconditional and
        a = 40;
        System.out.println("sb 43    " + (a ^= 3) ); // exclusive or
        a = 45;
        System.out.println("sb 47    " + (a |= 3) );  // unconditional or
        a = 50;
        System.out.println("sb -56    " + (a <<= 2) ); 
        a = 50;
        System.out.println("sb 0 49 % 26 % 5 % 1    " + (49 % 26 % 5 % 1) ); 
        
        // bitwise operators
          a = 60;	/* 60 = 0011 1100 */
          int b = 13;	/* 13 = 0000 1101 */
          int c = 0;

          c = a & b;        /* 12 = 0000 1100 */
          System.out.println("a & b = " + c );

          c = a | b;        /* 61 = 0011 1101 */
          System.out.println("a | b = " + c );

          c = a ^ b;        /* 49 = 0011 0001 */
          System.out.println("a ^ b = " + c );

          c = ~a;           /*-61 = 1100 0011 */
          System.out.println("~a = " + c );

          c = a << 2;       /* 240 = 1111 0000 */
          System.out.println("a << 2 = " + c );

          c = a >> 2;       /* 15 = 1111 */
          System.out.println("a >> 2  = " + c );

          c = a >>> 2;      /* 15 = 0000 1111 */
          System.out.println("a >>> 2 = " + c );        
          
          long p = 17496;
          Double psr = Math.sqrt(p);
          System.out.println(psr);
          System.out.println(psr.longValue());
          System.out.println(psr.longValue() % 5);
          System.out.println(c % b == 0 );
        
    }
    
}
