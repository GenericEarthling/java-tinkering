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
public class AutoBoxingUnBoxing {
    
    public static void main(String[] args){
        int a = 5, b = 7, k = 0, c = -22;
        Integer m = null;

        k = new Integer(a) + new Integer(b);   // 12
        k = new Integer(a) + b;                // 12
        k = a + new Integer(b);                // 12
        m = new Integer(a) + new Integer(b);   // 12
        k = new Integer(c) + new Integer(b);
        Integer d = new Integer(c) + new Integer(b);  // -15
        System.out.println(k);
        System.out.println(d.toString());
        System.out.println();
        System.out.println();
        System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println(Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
    }
}
