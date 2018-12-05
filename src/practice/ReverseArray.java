/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 *
 * @author Tender
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums = in.nextInt();          // get number of ints in array
        int[] arr = new int[nums];        // set the array length
        for ( int i =0; i<nums; i++) {  
            arr[i] = in.nextInt();        // input the ints in the array
        }
        int[] revArr = reverse(arr);
        for ( int i =0; i<revArr.length; i++) {  
            System.out.print(revArr[i]+ " ");
        }
        System.out.println( "Tada!" );
        
    }

    private static int[] reverse(int[] arr) {
        int[] returnArray = new int[arr.length];
        int j = 0;
        for (int i=arr.length-1; i>=0; i--) {
            returnArray[i] = arr[j++];
        }
        return returnArray;    
    }
    
}
