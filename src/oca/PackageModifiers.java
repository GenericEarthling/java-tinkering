// This file goes with: PackageModifierSubclass in objects_variables package
package oca;

import objects_variables.PackageModifierSubclass;

public class PackageModifiers {

    protected PackageModifiers() {
        protectedInt = 2;
        publicInt = 2;        
    }
    static{ STATIC_INT = 99; }
    
    protected int protectedInt = 1;
    public int publicInt = 1;
    public static final int STATIC_INT;
        

    public static void main(String[] args) {
        PackageModifiers pm = new PackageModifierSubclass();
        System.out.println(pm.protectedInt);
        System.out.println(pm.publicInt);
        System.out.println();
        PackageModifierSubclass pms = new PackageModifierSubclass();
        System.out.println(pms.protectedInt);
        System.out.println(pms.publicInt);
        System.out.println(pms.publicPMSint);
        System.out.println(pms.STATIC_INT);
        System.out.println(pms.newInt);

    }
    
}
class g{
    
}
