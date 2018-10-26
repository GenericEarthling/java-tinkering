// goes with B and C
package oca;

 class A {  
    public A(int k){
        System.out.println("A constructor");
    }
    
    public int i = 1;
    static int j = 11;
    public int getH() {
        return i;
    }
    public static void main(String[] args) {
        A ac = new C();
        System.out.println(ac.i+" "+ac.getH());  // 1 3
        System.out.println(ac.j+" "+C.j);        // 11 33
        System.out.println(C.k);                 // 444
        B bac = (B)ac;
        System.out.println(bac.i+" "+bac.getH());// 2 3
        System.out.println(bac.j+" "+B.j);       // 22 22
        B bc = new C();
        System.out.println(bc.i+" "+bc.getH());  // 2 3
        A ab = new B();
        System.out.println(ab.i+" "+ab.getH());  // 1 2
        B b = new B();
        System.out.println(b.i+" "+b.getH());    // 2 2
        System.out.println(b);
        
        
    }
    
}
