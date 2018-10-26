/**
 */
package array;

import java.util.Arrays;
import java.util.Random;

public class FindMatchInArray {

    public static void main(String[] args) {        
        int[] a = createIntArray();        
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println( "Result: " + firstDuplicate(a) );
        
        // Array Exploration
        String inter = "cake";
        inter = inter.intern();
        int indexOfString = inter.indexOf("k", 0);
        System.out.println(indexOfString);
        // copy an array to another array using java.lang.System method
        float[] cArray = new float[10];
        float[] dArray = new float[10];
        for (int i=0; i<cArray.length; i++) {
            cArray[i] = (float)Math.random()*10; // populate array w/numbers
        }
        System.out.println("Source Array");
        for (float d : cArray) System.out.print(d + ", ");
        System.out.println("\nTarget Array");
        for (float d : dArray) System.out.print(d + ", ");
        // (sourceArray, sourceIndex, targetArray, targetIndex, sourceArray.length)
        System.arraycopy(cArray, 0, dArray, 0, cArray.length);
        System.out.println("\nTarget Array");
        for (float d : dArray) System.out.print(d+ ", ");
        System.out.println("\nSort Array");
        Arrays.sort(dArray);
        for (float d : dArray) System.out.print(d+ ", ");
        java.util.Properties prop = new java.util.Properties();
        prop = java.lang.System.getProperties();
        System.out.println("\nSystem Properties: " + prop);
        System.out.println("System Security Manager: " + java.lang.System.getSecurityManager());
        
        // create an array of characters
        System.out.println("Random Character Array");
        char[] characters = createCharArray();
        for (char c : characters) System.out.print(c);
    }
        

    static int firstDuplicate(int[] a) {
        int result = -1;
        String aString = Arrays.toString(a);
        for (int i = 0; i < aString.length()-1; i++ ) {
            // get the first character
            char firstChar = aString.charAt(i);
            char nextChar = aString.charAt(i+1);

            // compare each char to rest of the string
        }    
        // compare each character to the next
        // stop when reaching the 2nd char match
        // save that index to result
        // return result

        return result;
    }


    static int[] createIntArray() {
    //        int[] ints = new int[8];
    //        for (int i = 0; i < ints.length; i++) {
    //            ints[i] = (int)(Math.random()*10);
    //        }
        int[] ints = {2,1,3,5,3,2};
    //        System.out.println("Ints in array: " + ints.toString());
        return ints;
    }

    private static char[] createCharArray() {
        char[] chars = new char[20];
        for (int i = 0; i < chars.length; i++) {
//            Random random = new Random();
//            chars[i] = (char)(random.nextInt()+'a');
            char aChar = '\u0041', zChar = '\u005A';
            int unicode = aChar + (int)((zChar - aChar +1) * Math.random());
            chars[i] = (char)unicode;
        }
        return chars;
    }
}