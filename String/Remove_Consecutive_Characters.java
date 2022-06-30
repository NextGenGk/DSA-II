package String;

// Remove Consecutive Characters Class
public class Remove_Consecutive_Characters {

    // Remove Duplicates Function
    static String removeDups(String str) {
        // Create an empty string
        String result = "";
        // Loop through string length
        for (int i=0; i<str.length(); i++) {
            // If current char is smaller than string length - 1
            // && current char is equal to current + 1 char then, simply skip this char
            if (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                continue;
            }
            // Else add current char to result
            else {
                result = result + str.charAt(i);
            }
        }
        // Finally return result
        return result;
    }

    // Main Function
    public static void main(String[] args) {
        String str = "aabccba";
        String result = removeDups(str);
        System.out.println(result);
    }
}

// Output -
// abcba

// Algorithm -
/*
1. Create an empty string
2. Loop through string length & check
    1. If current char is smaller than string length - 1 &&
    2. current char is equal to current + 1 char then, simply skip this char
3. Else add current char to result
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */