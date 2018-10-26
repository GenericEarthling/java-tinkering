/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects_variables;

import java.util.*;

interface SelectString {
    boolean select(MyString s);
}
class MyString {
    String str;
    @Override
    public String toString() { return str; }
    MyString(String s) { str = s; }
}
public class MyStringList {
    static List<MyString> list = Arrays.asList(new MyString("CAR"), new MyString("TRUCK"));
    public static void pss(SelectString ss) {
        for (MyString s : list)
            if (ss.select(s))
                System.out.println(s);
    }

    public static void main(String[] args) {
        // A
        pss(new SelectString() {
            @Override
            public boolean select(MyString s) {
                return s.str.length()<4; 
            }
        });
        // B
        pss(s -> s.str.charAt(0) == 'C');
        // c
        // D
//        pss(
//            @Override
//            public boolean select(MyString s) {
//                return s.str.length() < 4;            
//        });
        // E
//        pss(new SelectString() {
//            return s.str.length() < 4;
//        }); 

    }
    
}
