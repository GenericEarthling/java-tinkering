
package oca;

public class BreakContinue {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};

        for (int i : data) {
            if (i < 3) {
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
            if (i == 3) {
                System.out.println("break");
                break;
            }            
        }
        System.out.println();
        
        int x = 0;
        if (true){
            x=3;
        }
    }
    
    

}

