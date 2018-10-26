/**
 */
package array;

public class MultidimentionalMethod {

    public static void main(String[] args) {
        int[][][] data = {          // array number 1 has 2 arrays in it
            {{1,2},{3,4}},          // array number 2 has 2 arrays in it
            {{5,6},{7,8}}           // array number 3 has 2 arrays in it
        };
        System.out.print(ttt(data[1]));   // data[1] only returns array num 1 data = 4 
        int[][] s = new int[4][];
    }

    private static int ttt(int[][] m) {
        int v = m[0][0];                   // array for first set, {{1,2},{3,4}} = 1
        
        for (int i = 0; i < m.length; i++)    // length for  is 2
            for (int j = 0; j < m[i].length; j++)
                if ( v < m[i][j] )
                    v = m[i][j];
        
        return v;
    }
    
}
