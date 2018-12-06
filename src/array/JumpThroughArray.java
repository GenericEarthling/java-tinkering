/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Tender
 */
public class JumpThroughArray {
    // Complete the jumpingOnClouds function below. 
    // Count the number of jumps
    static int jumpingOnClouds(int[] c) {
        int jumpCount = -1;
        for (int i = 0; i < c.length; i++) {
            if ((i<c.length-2) && (c[i+2] == 0)) {
                i++;                     // move index an extra position 
            } 
            jumpCount++;           
        }
        return jumpCount;
    }
    public static void main(String[] args) {
        int[] cloud = {0,0,1,0,0,1,0};         // 7   4 jumps
        int[] cloud2 = {0,0,0,1,0,0};          // 6   3 jumps
        int[] cloud3 = {0,0,1,0,0,1,0,1,0,0};  // 10  6 jumps
        int result = jumpingOnClouds(cloud);
        int result2 = jumpingOnClouds(cloud2);
        int result3 = jumpingOnClouds(cloud3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
    
}
