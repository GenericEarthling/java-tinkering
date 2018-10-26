/*
palindrome is a word or sentence that is symmetric—
it is spelled the same forward and backward, ignoring case and punctuation. 
*/
package spring;

public class Palindrome {

    public static void main(String[] args) {
        // example reversing with a String
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put char in a char array
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        } 
        // this is an alternative to the first for loop
        // palindrome.getChars(0, len, tempCharArray, 0);
        
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        // the program converts the string to an array of 
        // characters (first for loop), reverses the array 
        // into a second array (second for loop), and then 
        // converts back to a string.
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
        
        // example reversing it back with a StringBuilder        
        StringBuilder sb = new StringBuilder(reversePalindrome);        
        sb.reverse();  
        System.out.println(sb); 
    }
    
}
