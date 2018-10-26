/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author Tender
 */
public abstract class AbstractParent implements MyInterface {
//    abstract void method1();


    public static void main(String[] args) {
        
        int y = 1;
        Float k = -3.3f;
        int[] a = {8,-9,5};
        String s = "string";
        System.out.println("Before method: s = " + s + ", y = " + y + ", k = " + k + ", a[0] = " + a[0] );
        change(s,y,k,a);
        System.out.println("After method: s = " + s + ", y = " + y + ", k = " + k + ", a[0] = " + a[0] );
        
        System.out.println();
        int i =10, j=12;
        for (;;) {
            System.out.println("i= " +i+ ", j= " +j);
            if (i++ < j--)
                continue;
            else
                break;
//            System.out.println("i= " +i+ ", j= " +j);
        }
        System.out.println("outside loop: i= " +i+ ", j= " +j);
    }
    static void change(String s, int y, Float k, int[] a) {
        s = "yadayada";
        y = 11;
        k = 33.3f;
        a[0] = 88;
        a[1] = 99;
        a[2] = 55;
        System.out.println("Inside method: s = " + s + ", y = " + y + ", k = " + k + ", a[0] = " + a[0] );

    }    
}
