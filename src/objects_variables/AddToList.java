
package objects_variables;

import java.util.*;
import static java.lang.Math.*;

public class AddToList {
    void probe(int... x){System.out.println("var-args");}
//    void probe(Integer x){System.out.println("Integer");}
//    void probe(long x){System.out.println("long");}
//    void probe(Long x){System.out.println("Long");}

    public static void main(String[] args) {
        List<Map<List<Integer>, List<String>>> opl = new ArrayList<>();
        Map<List<Integer>, List<String>> opm = new HashMap<>();
        opl.add(null);
        opl.add(opm);
        opl.add(new HashMap<List<Integer>, List<String>>());
        opl.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(new AddToList().b);
        System.out.println(PI);
        
        System.out.println();
        Integer a = 4;
        new AddToList().probe(a);
        int c = 4;
        new AddToList().probe(c);
        
    }
    
    int a;
    static int b;
    int f() { return b; }  // instance methods CAN return static variables
    static int g() { return b; }  // static methods can only access static variables
    
    
}
