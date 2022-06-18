package ArrayQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

// Kth Largest Element Class
public class Kth_Largest_Element {

    // Function to find k largest array element
    static int kthLargest(int[] arr, int k) {

        // Implementation using
        // a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < arr.length; ++i) {

            // Insert elements into
            // the priority queue
            pq.add(arr[i]);

            // If size of the priority
            // queue exceeds k
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // finally return top element
        return pq.peek();
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {20, 10, 60, 30, 50, 40};
        int result = kthLargest(arr, 3);
        System.out.println(result);
    }
}

// Idea -
/*
Find Largest Element then use (Min Heap) [In Java By Deafault Min Heap]
Find Smallest Element then use (Max Heap) [Use Comparator - Collections.reverseOrder()]
 */

// Output -
// 40

// Algorithm -
/*
1. Create a Max Heap (Priority Queue)
2. Loop through to length of the array
3. And add current element
4. Checks, If size of the priority queue exceeds k, than remove (Min Heap) topmost element
5. Finally return (Min Heap) topmost element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */