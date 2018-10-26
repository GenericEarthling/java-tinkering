/**
 * fork() and join()
 * 
 * Recursion example
 *  
 */
package threads;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Long> {
    int low, high;
    int[] array;        
    Sum(int[] array, int low, int high) {
        array = array;
        low = low;
        high = high;
    }
    @Override
    public Long compute() {
        if( (high-low) <= 4) {
            long sum = 0;
            for(int i = low; i < high; ++i) 
                sum += array[i];
            return sum;
        } else {
            int mid = low + (high-low)/2;   // find the medium point
            Sum left = new Sum(array, low, mid);
            Sum right = new Sum(array, mid, high); 
            left.fork();
            long rightAns = right.compute();
            long leftAns = left.join();
            return leftAns + rightAns;            
        }        
    }    
    static long sumArray(int[] array) {
        return new ForkJoinPool().invoke(new Sum(array, 0, array.length));
    }
    public static void main(String[] args) {
    
    }
    
}
