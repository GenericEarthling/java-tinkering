/* interfaces & privacy modifiers
 * Parent, Child, and MyInterface classes are together
 * 
 */
package javatesting;

public abstract class Child extends Parent  {

    @Override
    public void method1() {  }            // Good: public in both parent and interface          
//    abstract void method1();            // Error: cannot be abstract--if you assign weaker access privileges          
//    public void method1();              // Error: must have {body} or declared abstract
    
    @Override
//    public static void method2(){  }    // Error: cannot be static
//    static void method2();              // Error: cannot override parent with static
//    abstract void method2();            // Good: with abstract (abstract in parent, static in interface)
    public void method2()  {              // Good: public requires method body
        System.out.println("Child method2");
    }
    public static void main(String[] args) {
        MyInterface.method2();            // inherits Parent class's implementation
//        Child c = new Child();          // Error: Child and Parent are abstract
        
    }  // end main
                      
    
} // end class
