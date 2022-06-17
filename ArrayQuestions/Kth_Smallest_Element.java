package ArrayQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element {

    static int kthSmallest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i=0; i< arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45};
        int result = kthSmallest(arr, 3);
        System.out.println(result);
    }
}
