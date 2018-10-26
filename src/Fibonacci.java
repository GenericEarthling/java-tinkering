
public class Fibonacci {
    private static long count = 0; // count of the calls to the method fib

    public static void main(String[] args) {    

      int num = 5;
//      try {
////         num = Integer.parseInt( num );
//         if ( num < 0 )
//            throw new IllegalArgumentException( "Must be a positive Integer" );
//      } catch ( Exception e ) {
//         System.err.println( "Exception: java Fibonacci <num> where <num> is a positive Integer" );
//         System.exit( 1 );
//      }

      System.out.println( "fib(" + num + ") = "  + fib( num ) );
      System.out.println( "\nNumber of calls to method fib: " + count );
   }

   private static long fib ( int num )
   {
      ++count;  // Count how many times this method is invoked

      // fib(0) and fib(1) are 0 and 1 by definition:
      if ( num == 0 ) return 0;
      if ( num == 1 ) return 1;

      // fib(n) is fib(n-1) + fig(n-2) by definition:
      long result = fib( num-1 ) + fib( num-2 );
          System.out.print(fib(num-1)+" = fib(num-1)...num = "+num+ "  " +fib(num-2)+" = fib(num-2)...num = "+num);
          System.out.println();
//          System.out.print(fib(num-2));
      return result;
   }
}
    
/*
3
3-1    +    3-2
2+1=3

5
5-1  +  5-2
4+3=7


*/    
    
    
    
    
    
    
//        static long[] nums = { 1, 2, 3, 4, 5, 6 };
//        static long firstNum, secondNum, next;
//
//        private static long fib(long number) {
//            if ( number < 0) {
//                throw new UnsupportedOperationException("UnsupportedOperationException Not supported yet."); 
//            }
//            long previous = 0, current = 1, next;
//            for ( int i=2; i <= number; ++i) {
//                next = previous + current; 
//                previous = current;
//                current = next;
//                return current;
//            }
//            return 1;                                  // return not correct, error here
//        }
//
//        static void load() {        
//            for ( long number : nums) {
//                System.out.print( fib( number ));
//            }        
//        } // end load
//    }
    
