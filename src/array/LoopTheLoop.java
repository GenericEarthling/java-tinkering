
package array;

public class LoopTheLoop {

    public static void main(String[] args) {
        int[] numbers = {5,6,9,5,4,2};
        loops(numbers);
        for(int i : numbers) System.out.print(i);
        
    }

    private static void loops(int[] numbers) {
        for (int i=0; i<numbers.length-1; i++) {
            System.out.println("First Loop -> i: " +i+", array number: " +numbers[i]);
            for ( int j=0; j<numbers.length; j++) {
                System.out.println("j: "+j+", array number: " +numbers[j]);
            }
        }
    }
    
}
