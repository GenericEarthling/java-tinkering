

package oca;

public class PlusPlusMinusMinus {

    public static void main(String[] args) {
        short ss = 9;
        Short s = 9;
        Integer i = 9;
        int ii = 9;
        System.out.println(i==ii);
//        System.out.println(s==i);   // compile error, cannot compare diff objects
        boolean b = (args == null? false : true);
        if (b){
            System.out.println("has params: " + b + " args: " + args);
            }else     {
            System.out.println("no params");
        }
        System.out.println("....Objects and Integer.........");
        Integer t = new Integer(107);
        int k = (Integer)t.intValue()/9;   // auto unboxing
        System.out.println(k + " is k, 107/9 = "+(107/9));

        System.out.println();

        System.out.println("....Using ++ and --.........");
        int x1 = -4;       // -4
        System.out.println("x1: " + x1);     // -4
        int x2 = x1--;     // -4  -5
        System.out.println("x2: " + x2);     // -4
        int x3 = ++x2;     // -3   -3
        System.out.println("x1: " + x1);     // -5
        System.out.println("x2: " + x2);     // -3 
        System.out.println("x3: " + x3);     // -3
        x1++;              // -4
        System.out.println(x1+x2+x3);        // -4 -3 -3
        System.out.println();

//        System.out.println(null + true);
//        System.out.println(true + null);
//        System.out.println(null + null);
        
    }
    
}
