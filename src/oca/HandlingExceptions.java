
package oca;

abstract class HandlingExceptions {
    abstract void handleIt();
   public static void main(String args[]) {
       try{
           m1();
           System.out.println("A");
       }
       catch (Exception e) {
           
       }
       finally{
           System.out.println("B");
       }
       System.out.println("C");
       HandlingExceptions he = null;
//       he.handleIt();                 // NullPointerException
       
   }
   public static void m1() throws Exception { throw new Exception(); }
}
