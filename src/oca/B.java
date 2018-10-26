/*
 * Goes with A and C classes
 */
package oca;

public class B extends A {
    public B(){
        super(2);
    }
    public int i = 2;
    static int j = 22;
    @Override
    public int getH() {
        return i;
    }   
}

