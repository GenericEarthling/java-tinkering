/**
 * 
 */
package array;

public class PassingTwoDArray {

    public static void main(String[] args) {
        int[][] array2 = new int[4][5];
        int[][] array = {{1, 2, 3, 6, 4}, {5, 6, 7, 8},{5,66,5},{78}};
        System.out.println(m1(array)[0]);     // returns n [0]  = 4 Length of array
        System.out.println(m1(array)[1]);     // returns n [1]  = 5 length of array in zero position
        System.out.println(m1(array)[2]);     // returns n [2]  = 78  
        System.out.println(m1(array)[3]);     // returns n [3]  = 5  
        System.out.println(m1(array)[4]);     // returns n [4]  = 3 (length of row 2)  
    }

    private static int[] m1(int[][] array) {
        int[] n = new int[5];
        n[0] = array.length;                 // array length
        n[1] = array[0].length;              // row 1 length
        n[2] = array[3][0];
        n[3] = array[2][2];
        n[4] = array[2].length;
        return n;
    }
    
}
