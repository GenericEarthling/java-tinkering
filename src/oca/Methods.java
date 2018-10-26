
package oca;

public class Methods {

    public static void main(String[] args) {
        System.out.println( getDatabase().url);
        System.out.println();
        
        Integer q = 4;
        new Methods().probe(q);
        int w = 4;
        new Methods().probe(w);
        System.out.println();
        
        int a = 'A';
        int b = 'b';
        char c = 0 ;
        System.out.println("int A="+a+", int b="+b+", char c="+c+", (int)c="+((int)c));
        System.out.println();
        
        System.out.println("... overloading/overriding super methods.....");
        
        System.out.println();
        
    }
    void probe(String s, int... x) { System.out.println(s+"In ..."); }  // variable arity parameter, variable-length argument
    void probe(Integer x) { System.out.println("In Integer"); } 
    void probe(long x) { System.out.println("In long"); }  
    void probe(Long x) { System.out.println("In LONG"); } 

//    public static double getAngle();    // will not compile without body
    static String url = "jdbc://derby://localhost:1527//mydb";
    static Methods getDatabase() {
        System.out.println("Getting DB");
        return null;
    }    
}
