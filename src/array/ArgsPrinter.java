
package array;

import java.util.ArrayList;

public class ArgsPrinter {

    final public static void main(String[] args) {

       Object a, b, c;
       a = new String("A");
       c = a;
       System.out.println(c);
       
       Boolean ok = Boolean.parseBoolean("true");
       System.out.println(ok);
       
       ArrayList<Double> al = new ArrayList<>();
       al.add(Double.valueOf(111));
       System.out.println(al.indexOf(111.0)+" "+ al.contains(111));
       
       int aaa = 5, bbb=7, kkk=0;
       Integer m = null;
       int crab = new Integer(aaa) + new Integer(bbb);   // auto-unboxing
       int cakes = new Integer(9) + bbb;
       int drizzle = aaa + new Integer(bbb);
       m = new Integer(crab);
       m = aaa;                                          // autoboxing
       System.out.println(crab + " " + cakes + " " + drizzle + " " + m+"\n");
       
       // Boolean.parseBoolean("true") returns a primitive, not a Boolean wrapper object
       System.out.println("new Boolean(\"true\") == Boolean.parseBoolean(\"true\"): "+(new Boolean("true") == Boolean.parseBoolean("true")));
       System.out.println("new Boolean(\"true\") == new Boolean(\"true\"): " + (new Boolean("true") == new Boolean("true")) );
       System.out.println("Boolean.TRUE == new Boolean(\"true\"): " + (Boolean.TRUE == new Boolean("true")));
       System.out.println("Boolean.TRUE == new Boolean(Boolean.TRUE): " + (Boolean.TRUE == new Boolean(Boolean.TRUE)));
    }
    
}
