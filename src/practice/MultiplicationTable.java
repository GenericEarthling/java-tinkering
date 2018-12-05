/**
 * Pattern: (a + (2^0*b)) + (2^1*b) + (2^2*b))... ( (2^(n-1)) *b)
 * input: number of test cases
 *      
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Tender
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();                          // first input
        int a=0, b=0, n=0;
        final int Q_LIMIT = 500;
        if(t>0 & t<=Q_LIMIT) {
            for(int index=0;index<t;index++){
                a = in.nextInt();                    // 2nd input: 3 numbers separated w/a space
                b = in.nextInt();                    // first input
                n = in.nextInt();
                int k=0;            
                if ( n>0 & n<=15 ) {    
                        for (int j=0; j<n; j++) {       // loop through the power factors
                            k += (int) Math.pow(2,j)*b;
                            System.out.print(a+k + " ");                        
                        }
                } else {
                    System.out.println("Exceeded maximum power factors");
                }
                System.out.println(); 
            }
        } else {
            System.out.println("Exceeded maximum query limit");
        }       
        in.close();     }
    
}
