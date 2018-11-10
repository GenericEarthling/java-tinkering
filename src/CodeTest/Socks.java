/**
 * This program counts how many pairs of integers are in an array
 */
package CodeTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author Tender
 */
public class Socks {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count=0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<ar.length; i++) {
            list.add(ar[i]);
        }   
        System.out.println("list size: "+list.size());
        // go through array comparing ar[i] with inner loop ar[j]
        // if there is a match, remove from list
        int j;        
        for (int i=0; i<list.size()-1; i++) {
            System.out.println("for-1: "+list); 
           for (j=i+1; j<list.size(); j++ ) {
                System.out.println("for-2: "+list.get(i)+ " "+list.get(j)+" j: "+j);
                if ( list.get(i).equals(list.get(j)) )  {  
                    Integer sock1 = list.get(i);
                    list.remove(i);
                    list.remove(list.indexOf(sock1));                    
                    count++;
                    i--;
                    System.out.println(" if-3: "+list); 
                    break;                  
                } 
            }           
        }
        return count;
    }

    public static void main(String[] args)  {        
        int[] arra = {6};
//        arra[0]+=5;
        int[] ar = {4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
//        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2};
        int n = ar.length;
//        System.out.println(++arra[0]);
        System.out.println(sockMerchant(n, ar));
    }
    
}
