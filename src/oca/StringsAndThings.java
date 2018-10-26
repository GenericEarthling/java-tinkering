
package oca;

public class StringsAndThings {

    public static void main(String[] args) {         
        String myStr = "good";         
        char[] myCharArr = {'g', 'o', 'o', 'd' };                  
        String newStr = "";         
        for(char ch : myCharArr){             
            newStr = newStr + ch;         }          
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
        System.out.println(newStr);
        
        String[] sA = new String[] { "aaa"};
        String str = null;
//        str = str.concat("bla");     // null pointer exception
        System.out.println(str);
        
        Integer i = new Integer(null);  // number format exception
        System.out.println(i);
        
    }    
}
