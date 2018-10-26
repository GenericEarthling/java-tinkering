/*
 * Parent, Child, and MyInterface classes are together
 */
package javatesting;

/**
 *
 * @author Tender
 */
abstract class Parent implements MyInterface {
//    abstract void method1();     // cannot be abstract since interface method1() is static
                                   // or take out abstract and add a body to implement it
    public void method1()   { System.out.println("Parent method1");  }                              

    abstract void method2();

}
