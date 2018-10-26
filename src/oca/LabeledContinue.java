
package oca;

public class LabeledContinue {

    public static void main(String[] args) {
 
        String searchMe = "see me";
        String me = "me";
        String s = "";
        int index = 0;
        boolean foundIt = false; 
        int max = searchMe.length() - me.length();   // 4
    test:
        for (int i = 0; i <= max; i++) {    // iterates over "see me" 0-4 times
            int n = me.length();            // search string length is 2  
            int j = i;                      // j is char position in "me"
            int k = 0;                      // k is char position in "see me"
            while (n-- != 0) {              // iterates 2 times (num of chars in "me")
                System.out.println("if: "+(searchMe.charAt(j) != me.charAt(k)) );
                // if there is no match, continue to outer for-loop
                // if false twice in a row, it must be a match
                if (searchMe.charAt(j++) != me.charAt(k++)) {  // increment char position after this bool test 
                    System.out.println("there is no match, start over at label, test: " );
                    continue test;     // stop here and go back to label, "test:"
                }
                index = j-1; // current index minus the length of "me" so we get the start index
                s += searchMe.charAt(j-1);
            }
            System.out.println("After 2 false returns in a row, it must be a \n"
                    + "match because the length of search word is 2\n"
                    + "while loop finishes all the iterations of 'n' \n"
                    + "then the rest of the for-loop iterates\n"
                    + "that changes foundIt=true then \"break test:\" executes\n"
                    + "after \"break test:\" the next line after the for-loop\ntakes over. "
                    + "Word searched: "+s+" found at index: "+index );
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
    
}
