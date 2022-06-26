package ArrayQuestion_v2;

import java.util.Arrays;

public class Minimize_The_Maximum_Heights {

    static int minimizeHeights(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int diff = arr[n-1] - arr[0];

        for (int i=1; i<n; i++) {
            if (arr[n-1] -k < 0) continue;

            int min = Math.min(arr[0]+k, arr[i]-k);
            int max = Math.max(arr[i-1]+k, arr[n-1] -k);

            int ans = Math.min(diff, max-min);
        }
        return diff;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = minimizeHeights(arr, arr.length, k);
        System.out.println(ans);
    }
}
