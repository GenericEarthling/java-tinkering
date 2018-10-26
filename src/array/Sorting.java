/**
 * 
 */
package array;

public class Sorting {

    public static void main(String[] args) {
        int[] integer = {7,5,3,2,9};
        int[] sortedInts = integerSwapSort(integer);
        System.out.println("sorted ints");
        for ( int i : sortedInts)
            System.out.print(i + " ");
        System.out.println();
    }

    private static int[] integerSwapSort(int[] integer) {
        // find the low number and swap with first num
        for (int i=0; i<integer.length-1; i++) {
            int currentLow = integer[i];             // the number in this index position
            int currentLowIndex = i;                      // the current index
            System.out.println("i: " +i + ", currentLow: " + currentLow);
            for (int j = i+1; j<integer.length; j++) {   // repeat loop to compare each number with prior numbr       
                
                if ( currentLow > integer[j]) {          // if the current low number > next number in array
                    System.out.println("if " + integer[i]+" > " + integer[j]);
                    currentLow = integer[j];             // save the next number in the array as the current low number
                    currentLowIndex = j;                 // save the indes of the new low number
                    System.out.println("save " + integer[j] + " to current low and save it's index.");
                } 
            }
            if (currentLowIndex != i) {                  // if 
                System.out.println("if " + currentLowIndex+" != " + i + " (the lowest position in the index...)");
                integer[currentLowIndex] = integer[i];
                integer[i] = currentLow;
                System.out.print("save current number, " + integer[i] + ", to array at " + i + " position." );
                for (int c : integer) System.out.print(c);
                System.out.println();
            }
            

        }
        
        return integer;
    }
    
}
