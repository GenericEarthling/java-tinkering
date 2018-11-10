/**
 * Input: 
 *  6 x 6 2-D array
 * Constraints: 
 *  -9 <= array[i][j] <= 9    // smallest num is -9, largest 9
 *   0 <= i,j, <= 5           // array reference variables 0-5
 * Output:
 *  Print the largest hourglass sum found in the array
 */
package CodeTest;

import java.util.Scanner;

/**
 *
 * @author Tender
 */
public class HourGlassArray {
    
    // hourglassSum function gets largest hourglass sum
    static int hourglassSum(int[][] arr) {
        int sumHigh=0;
        int sum=0;

        // row
        for (int i=0; i<4; i++) {
            // column
            for (int j=0; j<4; j++) {
                sum = 
                     arr[ i ][j]+ arr[ i ][j+1]+ arr[ i ][j+2]
                    +             arr[i+1][j+1]
                    +arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];

                System.out.println("ij: "+i+" "+j
                        +"    sum: " +sum+"\t value: "+ arr[i][j]);
                // save the highest sum
                sumHigh = Math.max(sum, sumHigh);
            }
        }
        return sumHigh;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[][] arr = new int[6][6];
        int[][] arr = { { 1, 1, 1, 0, 0, 0 },
                        { 0, 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 0, 0, 0 },
                        { 0, 0, 2, 4, 4, 0 },
                        { 0, 0, 0, 2, 0, 0 },
                        { 0, 0, 1, 2, 4, 0 }  };

        
        System.out.println( hourglassSum(arr) );
    }
    
}
