/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
 
public class StringBeforeAfter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( wordEnds("abcXY123XYijk", "XY") );
        System.out.println( wordEnds("XY123XY", "XY") );
        System.out.println( wordEnds("XY1XY", "XY") );
        // Fib
        loadFib();
    }
        // coding bat
        public static String wordEnds(String str, String word) {
            String result = "wordEnds";     
            return result;
        } // end wordEnds()

        static long[] nums = { 1, 2, 3, 4, 5, 6 };
//        static long previous = 0, current = 0, next;

        private static long fib(long enteredNumber) {
            if ( enteredNumber < 0) {
                throw new UnsupportedOperationException("UnsupportedOperationException Not supported yet."); 
            }
//            if (enteredNumber==0){
//                return 0;
//            }
//            if (enteredNumber==1) {
//                return 1;
//            }
            
            long previous = 0, current = 1, result = 0;
            for ( int i = 2; i <= enteredNumber ; ++i) {                   // 2 <=2   ... 3<= 3   ... 2 <= 3   ... 3<=4     ... 4<=5     ... 5<=6     ...  
                System.out.print("previous="+previous+" " + "current="+current+" " + "enteredNumber="+enteredNumber+" " + "result="+result+"\n");
                result = previous + current;                               // 2 = 0+2 ... 4 = 1+3 ... 6 = 3+3 ... 7 = 3+4 ... 9 = 4+5 ... 11 = 5+6 ...
                previous = enteredNumber;                                  // 1 = 1   ... 3 = 3   ... 3 = 3   ... 4 = 4   ... 5 = 5   ... 6 = 6   ... 
                current = result;
            }
            return result;                                                 // 2       ... 4       ... 6       ... 7       ... 9       ... 11
        } // end fib()

        static void loadFib() {        
            for ( long number : nums) {
                System.out.println( fib( number ));
            }        
        } // end load
    
    

}  // end class
