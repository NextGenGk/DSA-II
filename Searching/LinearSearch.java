package Searching;

// Linear Search Class
public class LinearSearch {

    // Linear Search Method
    public static int linearSearch(int[] arr, int value) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Value is found at the index of " + i);
                return i;
            }
        }
        System.out.println("The element " + value+ " not found.");
        return -1;
    }

    // Main Method
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LinearSearch.linearSearch(arr,3);
    }
}
