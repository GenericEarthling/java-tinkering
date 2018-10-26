/**
 * depends on 2 other classes: A and B
 */
package oca;

public class C extends B implements I {
    public int i = 3;
    static int j = 33;
    @Override
    public int getH() {
        return i;
    }    
    public int getI() {
        return k;
    }
 
}
