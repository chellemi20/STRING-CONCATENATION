import java.util.Scanner;

public class StringConcatenation {
    
    // Method to concatenate three strings manually using character arrays
    public static String Concatenation(String str1, String str2, String str3) {
        
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        
        // Add 2 for the spaces between the strings
        char[] str4 = new char[len1 + len2 + len3 + 2];
        
        int i = 0;  // Index for the concatenated array
        
        // Copy characters from str1
        for (int k = 0; k < len1; k++) {
            str4[i++] = str1.charAt(k);
        }
        
        // Add space after str1
        str4[i++] = ' ';
        
        // Copy characters from str2
        for (int k = 0; k < len2; k++) {
            str4[i++] = str2.charAt(k);
        }
        
        // Add space after str2
        str4[i++] = ' ';
        
        // Copy characters from str3
        for (int k = 0; k < len3; k++) {
            str4[i++] = str3.charAt(k);
        }
        
        // Return the concatenated string
        return new String(str4);
    }
    
    public static void main(String[] args) {
        // Initialize the Scanner object for input
        Scanner scan = new Scanner(System.in);
        
        // Default hardcoded names
        String defaultFirstName = "Rochelle Mae";
        String defaultMiddleName = "Tegio";
        String defaultLastName = "Bardaje";
        
        // Prompt the user to input their first, middle, and last names (with default options)
        System.out.print("Enter your first name (default: Rochelle Mae): ");
        String str1 = scan.nextLine();
        if (str1.isEmpty()) {
            str1 = defaultFirstName;  // Use default if no input is given
        }
        
        System.out.print("Enter your middle name (default: Tegio): ");
        String str2 = scan.nextLine();
        if (str2.isEmpty()) {
            str2 = defaultMiddleName;  // Use default if no input is given
        }
        
        System.out.print("Enter your last name (default: Bardaje): ");
        String str3 = scan.nextLine();
        if (str3.isEmpty()) {
            str3 = defaultLastName;  // Use default if no input is given
        }
        
        // Call the Concatenation method to combine the names
        String fullName = Concatenation(str1, str2, str3);
        
        // Output the concatenated full name
        System.out.println("Full Name: " + fullName);
        
        scan.close();  // Close the scanner to avoid resource leak
    }
}
