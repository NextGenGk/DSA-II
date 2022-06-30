package String;

// Valid Palindrome Class
public class Valid_Palindrome {

    // Valid Palindrome Function
    static boolean validPalindrome(String str) {
        // All the string char converted into lowerCase
        str = str.toLowerCase();
        // Create an empty String
        StringBuilder builder = new StringBuilder();

        // Loop trough string length
        for (int i=0; i<str.length(); i++) {
            // Check, If current char is a digit OR current char is letter
            // add current char to new string
            if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
                builder.append(str.charAt(i));
            }
        }

        // Store last char of last index
        int n = builder.length()-1;
        // Loop through new string length by 2
        for (int i=0; i<builder.length()/2; i++) {
            // Check, If current char is not equal to current char of last index, return false;
            if (builder.charAt(i) != builder.charAt(n-i)){
                return false;
            }
        }
        return true;
    }

    // Main Function
    public static void main(String[] args) {
        String str = "Too hot to hoot.";
        boolean result = validPalindrome(str);
        System.out.println(result);
    }
}

// Output -
// true

// Algorithm -
/*
1. All the string char converted into lowerCase
2. Create an empty String
3. Loop trough string length & check
    1. If current char is a digit OR current char is letter
       add current char to new string
4. Loop through new string length by 2 & check
    1. If current char is not equal to current char of last index, return false
 */

// Time & Space Complexity -
/*
Time - O(n)
Space - O(1)
 */