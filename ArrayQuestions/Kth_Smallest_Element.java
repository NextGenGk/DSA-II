package ArrayQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

// Kth Smallest Element Class
public class Kth_Smallest_Element {

    // Function to find k smallest array element
    static int kthSmallest(int[] arr, int k) {

        // Implementation using a Priority Queue (Max Heap) [Pass Comparator]
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Loop through to length of the array
        for (int i=0; i< arr.length; i++) {
            // add current element
            pq.add(arr[i]);

            // Checks, If size of the priority queue exceeds k
            if (pq.size() > k) {
                // than remove topmost element
                pq.poll();
            }
        }
        // finally return top element
        return pq.peek();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int result = kthSmallest(arr, 3);
        System.out.println(result);
    }
}

// Idea -
/*
Find Largest Element then use (Min Heap) [In Java By Deafault Min Heap]
Find Smallest Element then use (Max Heap) [Use Comparator - Collections.reverseOrder()]
 */


// Output -
// 3 smallest elements are : 3  2  1

// Algorithm -
/*
1. Create a Max Heap (Priority Queue)
2. Loop through to length of the array
3. And add current element
4. Checks, If size of the priority queue exceeds k, than remove (Max Heap) topmost element
5. Finally return (Max Heap) topmost element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */