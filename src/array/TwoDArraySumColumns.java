/**
 * adds the columns in the array
 * from Liang 2-d arrays, p 295
 * has many 
 */
package array;

public class TwoDArraySumColumns {

    public static void main(String[] args) {
        int[][] matrix = {{5,5,5,5,5},{2,3,4,6,7},{6,7,8,9,0}};
        // summing columns
        for(int col=0; col<matrix[0].length; col++){
            int total = 0;
            for(int row=0; row<matrix.length; row++) {
                total+= matrix[row][col];
            }
            System.out.println("Sum for column "+col+" is " + total);
        }
        int[][] twoD = {{5,5,5,5},{5,6,8,6,5}};
        for(int col=0; col<twoD[0].length; col++){
            int total = 0;
            for(int row=0; row<twoD.length; row++) {
                total+= twoD[row][col];
            }
            System.out.println("Sum for twoD "+col+" is " + total);
        }
//        for (int[] i : twoD) System.out.print(i);  // prints address
        int[][] r = {{1,2},{3,4},{5,6}};
        System.out.println("array.length is " + r.length);
        for (int i = r.length-1; i>=0; i--) {
            for (int j = r[i].length-1; j>=0; j--) 
                System.out.print(r[i][j]+" ");
            System.out.println();
        }

        
    }
}
