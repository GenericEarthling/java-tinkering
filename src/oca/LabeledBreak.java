
package oca;

public class LabeledBreak {

    public static void main(String[] args) {
 
        int[][] arrayOfInts = { 
            { 32, 87, 3, 589 },
            { 12, 1076, 2000, 8 },
            { 622, 127, 77, 955 }
        };
        int searchfor = 12;
 
        int i;
        int j = 0;
        boolean foundIt = false;
 
    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            System.out.println("outer: i: "+ i +" j: "+j);
            for (j = 0; j < arrayOfInts[i].length; j++) {
                System.out.println("inner: i: "+ i +" j: "+j+ " number: "+ arrayOfInts[i][j]);
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    System.out.println("break search");
                    break search;
//                    break;
                }
            }
        }
 
        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
    
}
