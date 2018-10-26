
package oca;

public class BitWise {

    public static void main(String[] args) {
        int bitmask = 0x000F;  // 15
        int value = 0x2222;    // 8753
        System.out.println(bitmask);
        System.out.println(value & bitmask);  // 2
        System.out.println(value | bitmask);
        System.out.println(value ^ bitmask);
    }
    
}
