package ArrayQuestions;

// Find Min Max Class
public class Find_Min_Max {

    // Create a class Pair()
    // Class Pair is used to return two values from getMinMax()
    static class Pair {
        int max;
        int min;
    }

    // Find Min & Max Function
    static Pair getMinMax(int[] arr, int n) {
        // Creating an object of Pair() class
        Pair minMax = new Pair();

        // If there is only one element then return it as min and max both
        if (n == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        // If there is two element
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        }
        else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        // If there are more than two elements, then initialize min and max
        for (int i=2; i< arr.length; i++) {
            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            }
            if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {50, 19, 100, 38, 89};
        int n = 5; // n is the number of element
        Pair minMax = getMinMax(arr,n);
        System.out.println("Maximum element is " + minMax.max);
        System.out.println("Minimum element is " + minMax.min);
    }
}

// Output -
/*
Maximum element is 100
Minimum element is 19
 */

// Algorithm (Simple Linear Search) -
/*
1. Initialize values of min and max as minimum and maximum of the first two elements respectively.
2. Starting from 3rd, compare each element with max and min, and change max and min accordingly (i.e., if the element
   is smaller than min then change min, else if the element is greater than max then change max, else ignore the element
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */