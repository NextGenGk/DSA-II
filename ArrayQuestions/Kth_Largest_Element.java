package ArrayQuestions;

import java.util.PriorityQueue;

// Kth Largest Element Class
public class Kth_Largest_Element {

    // Function to find k largest array element
    static int kthLargest(int[] arr, int k) {

        // Implementation using a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Loop through kth Element (put kth element in the min heap)
        for (int i=0; i<k; i++) {
            // Insert elements into the priority queue
            pq.add(arr[i]);
        }

        // Loop through (Start from kth element to length of the array)
        for (int i=k ; i<arr.length; i++) {
            // Check, if the current element is bigger than current top element, then
            if (pq.peek() < arr[i]) {
                // remove
                pq.poll();
                // add (current big element)
                pq.add(arr[i]);
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

// Output -
// 40

// Algorithm -
/*
1. Create a Min Heap (Priority Queue)
2. Put kth element in the min heap (Loop)
3. And insert the element in the priority queue
4. Start from kth element to length of the array (Loop)
5. Check, if the current element is bigger than current top element, then remove this element
6. And adding the bigger element
7. Finally return min heap top most element
 */

// Time & Space Complexity -
/*
Time - O(n*log(k))
Space - O(k)
 */