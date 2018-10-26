package javatesting;
import java.util.concurrent.*;
class Sum extends RecursiveTask<Long> {
       int low, high;
       int[] array;
       Sum(int[] arr, int lo, int hi){
            array = arr;
            low = lo;
            high = hi;
        }
//       @Override
//       public void compute(){};
       protected Long compute() {
           if (high - low <= 4) {
               long sum = 0;
               for (int i=low; i<high; ++i)
                   sum += array[i];
               return sum;
           } else {
               int mid = low + (high - low)/2;
               Sum left = new Sum(array, low, mid);
               Sum right = new Sum(array, mid, high);
               left.fork();
               long rightAns = right.compute();
               long leftAns = left.join();
               return leftAns + rightAns;               
           }           
       }
       static long sumArray(int[] array){
           return new ForkJoinPool().invoke(new Sum(array,0,array.length));
       }
       public static void main(String[] args) {
           System.out.println(Sum.getPool());
           System.out.println(4 + (29-4)/2);
           System.out.println((29 + 4)/2);
    }
    
}
