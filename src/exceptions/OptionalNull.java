/**
 * 
 */
package exceptions;

import java.util.Optional;

public class OptionalNull {

    public static void main(String[] args) {
        String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.println(a.length());
            System.out.println(b.orElse("").length()); // Return the value if present, otherwise return other
        } catch (Exception ex) {
            System.out.println(a);
        } finally {
            a = "string";
            System.out.println(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
                
    }
    
}
