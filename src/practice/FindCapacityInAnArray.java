/*
An element of array can store water if there are higher bars on left and right. 
We can find amount of water to be stored in every element by finding the heights 
of bars on left and right sides. The idea is to compute amount of water that can 
be stored in every element of array. For example, consider the 
array {3, 0, 0, 2, 0, 4}, we can store two units of water at indexes 1 and 2, 
and one unit of water at index 2.

A Simple Solution is to traverse every array element and find the highest bars on left and right sides. Take the smaller of two heights. The difference between smaller height and height of current element is the amount of water that can be stored in this array element. Time complexity of this solution is O(n2).
An Efficient Solution is to prre-compute highest bar on left and right of every bar in O(n) time. Then use these pre-computed values to find the amount of water in every array element. Below is C++ implementation of this solution.
Examples:
    Input: arr[]   = {2, 0, 2}
    Output: 2
    Structure is like below
    | |
    |_|
    We can trap 2 units of water in the middle gap.

    Input: arr[]   = {3, 0, 0, 2, 0, 4}
    Output: 10
    Structure is like below
         |
    |    |
    |  | |
    |__|_| 
    We can trap "3*2 units" of water between 3 an 2,
    "1 unit" on top of bar 2 and "3 units" between 2 
    and 4.  See below diagram also.

    Input: arr[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    Output: 6
           | 
       |   || |
    _|_||_||||||
    Trap "1 unit" between first 1 and 2, "4 units" between
    first 2 and 3 and "1 unit" between second last 1 and last 2 
 */
package practice;

public class FindCapacityInAnArray {

    static int arr[] = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
      
    // Method for maximum amount of water 
    static int findWater(int n)     { 
        // left[i] contains height of tallest bar to the left of i'th bar including itself 
        int left[] = new int[n]; 
       
        // Right [i] contains height of tallest bar to the right of ith bar including itself 
        int right[] = new int[n]; 
       
        // Initialize result 
        int water = 0; 
       
        // Fill left array 
        left[0] = arr[0]; 
        for (int i = 1; i < n; i++) 
           left[i] = Math.max(left[i-1], arr[i]); 
       
        // Fill right array 
        right[n-1] = arr[n-1]; 
        for (int i = n-2; i >= 0; i--) 
           right[i] = Math.max(right[i+1], arr[i]); 
       
        // Calculate the accumulated water element by element 
        // consider the amount of water on i'th bar, the 
        // amount of water accumulated on this particular 
        // bar will be equal to min(left[i], right[i]) - arr[i] . 
        for (int i = 0; i < n; i++) 
           water += Math.min(left[i],right[i]) - arr[i]; 
       
        return water; 
    } 

    public static void main(String[] args)      { 
          
        System.out.println("Maximum water that can be accumulated is " +  
                                        findWater(arr.length)); 
    } 
    
}
