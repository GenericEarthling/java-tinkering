/*
 * ABSTRACT interface methods cannot contain a body  
 * Parent, Child, and MyInterface classes are together
 */
package javatesting;

interface MyInterface {
//    abstract void method1();
    public void method1();

    static void method2(){ 
        System.out.println("interface method2"); 
    }
}
