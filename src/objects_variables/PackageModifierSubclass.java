/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects_variables;

import oca.PackageModifiers;
import static oca.PackageModifiers.STATIC_INT;


public class PackageModifierSubclass extends PackageModifiers {

    public PackageModifierSubclass() {
        super();

    }
    public int publicPMSint = 3;
    public int publicInt = 3; 
    public int newInt = STATIC_INT * publicInt;
    
}
