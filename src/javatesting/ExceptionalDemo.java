/*
 * what is the output based on reviewing code alone
 */
package javatesting;

import java.util.Optional;

public class ExceptionalDemo {

    public static void main(String[] args) {
        String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.println("In try: a.length(): "+a.length());
            System.out.println("In try: b: "+b.orElse("").length());
            
        }
        catch (Exception e) {
            System.out.println("In catch e: "+e);
            
        }
        finally {
            a = "String";
            System.out.println("In finally: a.length(): "+a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
        
        int x = 10;
        try {
            for (int z = 2; z >=0; z--){
                int ans = x/z;
                System.out.print(ans + " ");
            }
        }
        catch (ArithmeticException ae) {
            System.out.println("E2");
        }        
        catch (Exception e){
            System.out.println("E1");
        }
        System.out.println();
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        System.out.println(s1);
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(4, 8));
        String s3 = s1.substring(4);
        System.out.println(s3);
        int foundAt = s1.indexOf(s2);
        System.out.println("found at: " + foundAt);

    }
    
}
