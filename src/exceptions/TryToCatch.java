
package exceptions;

public class TryToCatch {

    public static void main(String[] args) {
        int x=5, y=0;
        try {
            try {
                System.out.println(x);
                System.out.println(x/y);
                 
            }catch (ArithmeticException ex) {
                System.out.println("Inner Catch 1: " + ex.getLocalizedMessage());
                throw ex;
            }catch (RuntimeException ex) {
                System.out.println("Inner Catch 2");
                throw ex;
            }finally {
                System.out.println("Inner Finally");
            }
        }catch (Exception ex) {
            System.out.println("Outer Catch");
        }
        
        int d = 2;
        switch (d) {
            case 0: System.out.print("0");
            case 1: System.out.print("1");
            case 2: System.out.print("2");
            case 3: System.out.print("3");
        }
    }
    
}
