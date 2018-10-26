/**
 * which catch stmt will show error
 * even if ArithmeticExceiption is not in a catch, it will throw it at runtime
 * if trying to divide by 0
 */
package oca;

public class CatchingExeptions {

    public static void main(String[] args) {
        String[] s = { "4", null };
        try {
            int num1 = Integer.parseUnsignedInt(s[0]);
            int num2 = Integer.parseUnsignedInt(s[1]);   // null throws NumberFormatException
            System.out.println(num1/num2);
        }catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        }catch (NullPointerException e) {
            System.out.println(e.getClass()); 
        }catch (ArithmeticException e) {           
            System.out.println(e.getClass());
        }catch (Exception e) {
            System.out.println(e.getClass());
        }    
    }
    
}
