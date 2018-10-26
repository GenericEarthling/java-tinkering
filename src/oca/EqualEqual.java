/*
use equals() when comparing string objects
use == when comparing object references
*/
package oca;

public class EqualEqual {
    public static void main(String[] args) {
        String s1 = "Cake";
        String s2 = s1;
        String s3 = s2 + "";
        String s4 = "Cake and donuts";
        System.out.println(s1 == s3);   // false
        System.out.println(s1.equals(s3));   // true 
        System.out.println(s4 == s1 + " and donuts");     // false
        System.out.println(s4 == "Cake" + " and donuts");   // true
        System.out.println();
    }
    
}
