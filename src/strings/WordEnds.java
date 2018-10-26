/*
return a string made of each char just before and just after every 
appearance of the word in the string. Ignore cases where there is no 
char before or after the word, and a char may be included twice if 
it is between two words.

wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
 */
package strings;

import java.util.*;
import java.lang.StringBuilder;

public class WordEnds {

    public static void main(String[] args) {
        System.out.println( wordEnds("abcXY123XYijk", "XY") );
        System.out.println( wordEnds("XY123XY", "XY") );
        System.out.println( wordEnds("XY1XY", "XY") );
    }
    
   public static String wordEnds(String str, String word) {
       
        int indexStart = str.indexOf(word);
        int indexStart2 = str.indexOf(word, indexStart);
        int wordLength = word.length();  
        int lengthOfString = indexStart + wordLength + 1;
        char charBefore;
        char charAfter;
        String result = "";
        
        if (indexStart >= 1) {
            charBefore = str.charAt(indexStart-1);
            System.out.println("charBefore:" + charBefore);
            result += Character.toString(charBefore);
        } 
        if (str.length() > lengthOfString) {
            charAfter = str.charAt(indexStart+wordLength);
            System.out.println("charAfter:" + charAfter);
            result += Character.toString(charAfter); 
        }
        
        return result;
    }


    
    
}
