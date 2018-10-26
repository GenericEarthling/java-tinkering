/**
 * S h i v e r   M e   T  i  m  b  e  r  s  !
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
 */
package strings;

public class OCAStringBuilder {

    public static void main(String[] args) {
        StringBuilder msg2 = new StringBuilder("Shiver Me Timbers!");  // 0-17, length = 18
        System.out.println("msg length: " + msg2.length());
        
//        msg.insert(0, "Starting at zero: ");
        System.out.println(msg2.length());
        msg2.insert(msg2.length(), " - added at msg.length()18");
        msg2.insert(1, " ");
        System.out.println(msg2);
        System.out.println();
        
        StringBuilder sb = new StringBuilder("cow");
        System.out.println(sb + " length: " + sb.length());
        sb.insert(3, "s");   // added s to the end, length is now 4
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        System.out.println();
        
        StringBuilder stb = new StringBuilder(3);
        System.out.println("stb capacity is: " + stb.capacity());
        System.out.println();
        
        StringBuilder msg = new StringBuilder("Shivers!");
        msg.append(" Bad Storm!");
        System.out.println(msg);
        StringBuilder e = new StringBuilder("Example");
        e.append("  1) ").append("1");
        e.append("  2) ").append(new StringBuffer("2"));
        e.append("  3) ").append('\u0021');
        e.append("  4) ").append(1D);
        e.append("  5) ").append(true);
        System.out.println(e);
        
        
    }
    
}
