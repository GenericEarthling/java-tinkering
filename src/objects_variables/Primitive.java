/**
 */
package objects_variables;

import java.util.ArrayList;

public class Primitive {

    public static void main(String[] args) {
        System.out.println(".........Casting..............");
        byte byteNum=127;
        int intNum=124;
        double d = 4f;
        long longNum = byteNum;
        intNum = (int) longNum;
        System.out.println(byteNum == intNum);                         // true
        System.out.println("cast long to int =  " + (long)intNum);      // 127
        System.out.println("cast byte to long =  " + (byte)longNum);    // 127
 
        longNum = 32767+1;
        System.out.println("cast long to short =  " + (short)longNum);   // -32768
        long longMax = Math.toIntExact(456934335);
        System.out.println("long to math.toIntExact =  " + longMax);     // 456934335
        short shortNum = (short)longNum;
        System.out.println("long cast to short =  " + shortNum);         // -32768
        shortNum = 0;
        
        boolean yesNo;
        char c = '\u0123';
        System.out.println(c);                                       // g (with accent)
        char e = '5';
        System.out.println(e);                                      // 5
        
        System.out.println();
        System.out.println(".........Primitive value limits..............");
        System.out.println("Integer Min\t"+Integer.MIN_VALUE);                     // int min: 
        System.out.println("Integer Max\t"+Integer.MAX_VALUE);                     // 
        System.out.println("Character Min\t"+Character.MIN_VALUE);                     // 
        System.out.println("Character Max\t"+Character.MAX_VALUE);                     // 
        System.out.println("Short Min\t"+Short.MIN_VALUE);                     // 
        System.out.println("Short Max\t"+Short.MAX_VALUE);                     // 
        System.out.println("Byte Min\t"+Byte.MIN_VALUE);                     // 
        System.out.println("Byte Max\t"+Byte.MAX_VALUE);                     // 
        System.out.println("Float Min\t"+Float.MIN_VALUE);                     // 
        System.out.println("Float Max\t"+Float.MAX_VALUE);                     // 
        System.out.println("Long Min\t"+Long.MIN_VALUE);                     // 
        System.out.println("Long Max\t"+Long.MAX_VALUE);                     // 
        System.out.println("Double Min\t"+Double.MIN_VALUE);                     // 
        System.out.println("Double Max\t"+Double.MAX_VALUE);                     // 
        System.out.println();
        
        System.out.println(".........Objects..............");
        ArrayList line = new ArrayList();
        line.add("word");
        Object dot = line;
        System.out.println("line: " + line + "  dot: " + dot);
        line.add("cake");
        System.out.println("line: " + line + "  dot: " + dot);
        Object dash = line.clone();
        System.out.println("line: " + line + "  dot: " + dot + "  dash: " + dash);
        System.out.println("line equals dot: " + line.equals(dot) + "  line equals dash: " + line.equals(dash) + "  dot equals dash: " + dot.equals(dash));
        System.out.println("line == dot: " + (line == dot) + "  line == dash: " + (line == dash) + "  dot == dash: " + (dot == dash));
        System.out.println("line.toString: " + line.toString() + ", dot.toString: "+dot.toString()+", dash.toString: " + dash.toString());

        Integer num = new Integer("s");
        System.out.println(num);
    }
    
}
