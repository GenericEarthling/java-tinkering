
package oca;

public class EqualityChecks {
     int rate = 0;
     int speed = 0;
    public static void main(String[] args) {
        int int97 = 97; 
        Integer INT97 = 97; 
        char char97a = 'a'; 
        Double DOUBLE97 = 97.0; 
        Boolean BOOLFalse = Boolean.FALSE;
        Boolean newBOOLFalse = new Boolean(Boolean.FALSE);
        boolean boolFalse = false;
        System.out.println(int97 == INT97);          // true (unboxing to compare values)
        System.out.println(int97 == char97a);        // true (int and char same values)
        System.out.println(97 == char97a);           // true (char value of '97' is 'a')
        System.out.println(int97 == DOUBLE97);         // true (unboxing comparing values)
        System.out.println(boolFalse == BOOLFalse);    // true (unboxing because BOOLFalse is Obj)
        System.out.println(newBOOLFalse == BOOLFalse);// false (comparing 2 obj. reference)
        System.out.println();
        Integer INT97also = new Integer(97);
        System.out.println(INT97.equals(INT97also));
        System.out.println(INT97 == INT97also);
        
        EqualityChecks ec = new EqualityChecks();
        System.out.println(ec.toString());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.rate;
        hash = 29 * hash + this.speed;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EqualityChecks other = (EqualityChecks) obj;
        if (this.rate != other.rate) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        return true;
    }
    
}
