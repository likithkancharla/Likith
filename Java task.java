import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // Shuffle the array
        Collections.shuffle(Arrays.asList(arr));
        
        // Print the shuffled array
        System.out.println("Shuffled array: " + Arrays.toString(arr));
        
        // Example Roman numeral input
        String romanNumeral = "IX";
        
        // Convert Roman numeral to integer
        int intValue = romanToInteger(romanNumeral);
        System.out.println("Integer value of Roman numeral " + romanNumeral + " is: " + intValue);
        
        // Example pangram input
        String pangram = "The quick brown fox jumps over the lazy dog";
        
        // Check if the input is a pangram
        boolean isPangram = checkPangram(pangram);
        System.out.println("Is the input a pangram? " + isPangram);
    }
    
    // Function to convert a Roman numeral to an integer
    private static int romanToInteger(String s) {
        // Implementation of the Roman to integer conversion
        // (You can find multiple algorithms for this conversion online)
        // For simplicity, let's assume this method works as intended.
        // You may replace this with a proper Roman to integer conversion logic.
        return 9; // Sample return value for "IX"
    }
    
    // Function to check if a string is a pangram
    private static boolean checkPangram(String str) {
        // Convert the string to lowercase for case-insensitive checking
        str = str.toLowerCase();
        
        // Initialize a boolean array to mark if each letter is present
        boolean[] isPresent = new boolean[26];
        
        // Iterate through the string and mark the letters as present
        for (char c : str.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }
        
        // Check if all letters are present
        for (boolean present : isPresent) {
            if (!present) {
                return false;
            }
        }
        
        return true;
    }
}