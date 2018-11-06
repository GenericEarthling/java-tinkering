/**
 * https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
 * Given a linked list, the task is to find the n'th node from the end.  
 * It is needed to complete a method that takes two argument, head of linked list 
 * and an integer n. There are multiple test cases. For each test case, this 
 * method will be called individually.
 * 
 * Input: The first line of input contains number of test cases.  
 * Every test case contains two lines.  First line of every test case contains 
 * two space separated values, number of nodes  in linked list followed by 
 * value of n.  Second line of every test case contains data items of linked list.
 * 
 * Output: Corresponding to each test case, output a single integer that is the 
 * nth integer in the linked list from the end. Print -1 if the value of n is 
 * greater than the number of elements in the linked list.
 * 
 * Constraints:
 * 1 <= T <= 200
 * 1 <= No of Nodes <= 1000
 * 0 <= Data in Nodes <= 1000
 */
package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Tender
 */
public class FindElementInList {

    public static void main(String[] args) {
        int head = 0;
        int n = 0;
        int cases = 0;
        // Scanner for input
        Scanner in = new Scanner(System.in);
        // Get the number of test cases 
        cases = in.nextInt();
        
        while (cases <= 200) {
            // Get 2 values separated by a space
            //   value 1) number of nodes in linked list
            //   value 2) value of "nth" node (index from the end of the list)
            head = in.nextInt();
            n = in.nextInt();

            // Display single integer at nth integer in the linked list from the end
            System.out.println( nodeFromTheEnd(head, n));
        }
        
    }
    static int nodeFromTheEnd(int h, int n) {
        int result = 0;
        final int MAX_VALUE = 1000;
        final int MIN_VALUE = 0;
        LinkedList<Integer> list = new LinkedList<>();
         // {1,2,3,4,5,6,7,8,9};
        int j;
        int index = 0;
        Scanner in = new Scanner(System.in);
        // Get data items for linked list
        while ( (in.hasNext()) & (index < h) ) {
            j = in.nextInt();
            if ( j < MAX_VALUE & j > MIN_VALUE ) {
                list.add(index, j);
            } else {
                break;
            }
            index++;
        }
        // if the num of nodes is less than the nth
        if ( n < h) {
            System.out.println(list.get(list.size()-n));
        } else {
            return -1;
        } 
        System.out.println(list);
        return result;
    }
    
}
