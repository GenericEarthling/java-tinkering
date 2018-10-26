/**
 * Chap 3: OCA prep on strings
 */
package strings;

/**
 *
 * @author Tender
 */
public class OCAStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = new String("String one");
        String s2 = "String two";
        String s3 = "String " + "three";
        
        // .substring() starts with the value
        String s = s2.substring(0);
        System.out.println("s: " + s); 
        
        String str = s2.substring(7, 10);
        System.out.println("str: " + str);
        System.out.println("s2.length(): " + s2.length());
        System.out.println("cow: " + "cow".substring(0,2));
        
        s1 = s1 + " one more";
        System.out.println(s1);
        s1 += s1;
        System.out.println(s1);
        s1 += s2;
        System.out.println(s1);
        
       
    }
    
}
