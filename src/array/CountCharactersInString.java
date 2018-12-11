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
public class CountCharactersInString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long numberOfStringRepeats = n/s.length(); // get the number of times the string repeats
        long remaining = n%s.length();      // get the remainer
        
        if ( !s.contains("a") )
                return 0;
        long numberOfAs = 0;
        
        // count the number of a's in string and multiply by numberOfStringRepeats
        for ( int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == 'a') {
                numberOfAs++;
            }
        }
        numberOfAs = numberOfAs * numberOfStringRepeats;
        // count the number of a's in the remaining
        for (int i = 0; i < remaining; i++) {
            if ( s.charAt(i) == 'a') 
                numberOfAs++;
        }
        
        return numberOfAs;
    }
    public static void main(String[] args) {
        String str = "a";
        long longNum = 100000000000L;
        long max = Long.MAX_VALUE;
        System.out.println(max);
        System.out.println( repeatedString(str, longNum) );
    }
    
}
