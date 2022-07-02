package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Print All the Duplicates in the Input String Class
public class Print_All_the_Duplicates_in_Input_String {

    // Using Set
    static void printChar(String str) {
        // Create a HashSet
        Set<Integer> set = new HashSet<>();

        // Loop through string length
        for (int i=0; i<str.length(); i++) {
            // If current char is not added in this set, means this is duplicates
            if (!set.add((int) str.charAt(i))) {
                System.out.println("Using Set Find " + str.charAt(i));
            }
        }
    }

    // Using Sorting
    static void printChar2(String str2) {
        // Create a Char Array (char [])
        char[] charArray = str2.toCharArray();
        // Sorting the (charArray)
        Arrays.sort(charArray);

        // Loop through charArray length
        for (int i=1; i<charArray.length; i++) {
            // If current char is equal to current previous
            // charArray[i] == charArray[i-1]
            if (charArray[i] == charArray[i-1]) {
                System.out.println("Using Sorting Find " + charArray[i]);
            }
        }
    }


    // Main Function
    public static void main(String[] args) {
        String str = "Gaurav";
        // Using Set
        printChar(str);
        // Using Sorting
        printChar2(str);
    }
}

// Output -
/*
Using Set Find a
Using Sorting Find a
 */

// Algorithm -
// Using Set
/*
1. Create a HashSet
2. Loop through string length
3. If current char is not added in this set, means this is duplicates
 */

// Using Sorting -
/*
1. Create a Char Array (char [])
2. Sorting the (charArray)
3. Loop through charArray length
4. If current char is equal to current previous
 */

// Time & Space Complexity -
// Using Set -
/*
Time - O(n)
Space - O(n)
 */

// Using Sorting -
/*
Time - O(n*log*n)
Space - O(1)
 */