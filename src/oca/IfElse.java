/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca;

/**
 *
 * @author Tender
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 0;
       int j = 2;
       String s = "true";
//       String ss = true;
       Boolean b = true;
       boolean bf = false;
//       boolean bfs = "false";
       boolean bt = new Boolean("true");
       boolean bb = b.equals(new Boolean(Boolean.TRUE));
       if ( false ) {
           System.out.println("both are true");  
       } else {
           System.out.println("At least one is false.");
       }
    }
    
}
