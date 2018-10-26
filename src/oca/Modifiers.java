/**
 * which modifiers prevent use
 */
package oca;


class Aa {
    public void m1() {
        System.out.println("m1");
    }
    protected void m2() {
        System.out.println("m2");
    }
    private void m3() {
        System.out.println("m3");
    }    
    void m4() {
        System.out.println("m4");
    }
}

public class Modifiers { 
    public static void main(String[] args) {
        Aa a = new Aa();
//        a.m3();        // this one is private
        System.out.println(5.5 % 3);
        System.out.println(5 % 3);
        System.out.println();
        
        byte w;
        Short k = 9; 
        final short z=100;
        w = z;              // FINAL short assigned to a byte!!
        Integer i=9;
        Integer p=new Integer(9);
        int j=9;
        int t=9;
        float f=9;
        Boolean b = false; 
        char c='a'; 
        String str = i+"";
        String str2 = "123";
        int charNum = 'a';
        String s = new String("");
        if ( ( str != null ) || ( i == str.length()) )
            System.out.println("Str is not null, "+str.length());
        System.out.println(str);
        
    }
    
}
