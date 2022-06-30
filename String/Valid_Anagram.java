package String;

import java.util.Arrays;

// Valid Anagram Class
public class Valid_Anagram {

    // It is assumed that the characters are stored using
    // 8 bit and there can be 256 possible characters.
    static int NO_OF_CHARS = 256;

    // Are Anagram Function
    static boolean areAnagram(char[] str1, char[] str2) {

        // Create 2 count arrays and initialize
        // all values as 0
        int[] count1 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (int i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length) {
            return false;
        }

        // Compare count arrays
        for (int i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    // main Function
    public static void main(String[] args) {
        char[] str1 = ("geeksforgeeks").toCharArray();
        char[] str2 = ("forgeeksgeeks").toCharArray();
        boolean result = areAnagram(str1, str2);
        System.out.println(result);
    }
}

// Output -
// true

// Algorithm -
/*
It is assumed that the characters are stored using 8 bit and there can be 256 possible characters.
1. Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
2. Iterate through every character of both strings and increment the count of character in the corresponding count arrays.
3. Compare count arrays. If both count arrays are same, then return true.
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */