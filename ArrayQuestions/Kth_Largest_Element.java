package ArrayQuestions;

import java.util.PriorityQueue;

public class Kth_Largest_Element {

    static int kthLargest(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<k; i++) {
            pq.add(arr[i]);
        }

        for (int i=k ; i<arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 60, 30, 50, 40};
        int result = kthLargest(arr, 3);
        System.out.println(result);
    }
}
