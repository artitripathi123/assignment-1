//  import java.util.*;

// public class Stringlevel1 {
//     public static boolean compareStringsUsingCharAt(String s1, String s2) {
        
//         if (s1.length() != s2.length()) {
//             return false;
//         }
//         for (int i = 0; i < s1.length(); i++) {
//             if (s1.charAt(i) != s2.charAt(i)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first string: ");
//         String str1 = scanner.next();

//         System.out.print("Enter second string: ");
//         String str2 = scanner.next();
//         boolean manualComparison = compareStringsUsingCharAt(str1, str2);

//         boolean builtInComparison = str1.equals(str2);

//         System.out.println("\nComparison using charAt(): " + manualComparison);
//         System.out.println("Comparison using equals(): " + builtInComparison);

//         if (manualComparison == builtInComparison) {
//             System.out.println(" Both methods gave the same result.");
//         } else {
//             System.out.println(" The results of charAt() and equals() do not match.");
//         }

//         scanner.close();
//     }
// }

// import java.util.*;
// public class Stringlevel1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the text: ");
//         String text = scanner.next();
//         System.out.print("Enter start index: ");
//         int start = scanner.nextInt();

//         System.out.print("Enter end index: ");
//         int end = scanner.nextInt();

//         String manualSubstring = "";
//         for (int i = start; i < end; i++) {
//             manualSubstring += text.charAt(i);
//         }

//         String builtInSubstring = text.substring(start, end);

//         boolean areEqual = true;
//         if (manualSubstring.length() != builtInSubstring.length()) {
//             areEqual = false;
//         } else {
//             for (int i = 0; i < manualSubstring.length(); i++) {
//                 if (manualSubstring.charAt(i) != builtInSubstring.charAt(i)) {
//                     areEqual = false;
//                     break;
//                 }
//             }
//         }

//         System.out.println("Manual Substring (using charAt): " + manualSubstring);
//         System.out.println("Built-in Substring: " + builtInSubstring);
//         System.out.println("Are both substrings equal? " + areEqual);
//     }
// }




// import java.util.*;
// public class Stringlevel1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String text = scanner.next();

//         char[] manualArray = new char[text.length()];
//         for (int i = 0; i < text.length(); i++) {
//             manualArray[i] = text.charAt(i);
//         }

//         char[] builtInArray = text.toCharArray();

//         boolean areEqual = true;
//         if (manualArray.length != builtInArray.length) {
//             areEqual = false;
//         } else {
//             for (int i = 0; i < manualArray.length; i++) {
//                 if (manualArray[i] != builtInArray[i]) {
//                     areEqual = false;
//                     break;
//                 }
//             }
//         }

//         System.out.println("Manual Character Array: ");
//         for (char c : manualArray) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\nBuilt-in Character Array: ");
//         for (char c : builtInArray) {
//             System.out.print(c + " ");
//         }

//         System.out.println("\nAre both arrays equal? " + areEqual);
//     }
// }


// import java.util.*;
// public class Stringlevel1 {
//     public static void generateNullPointerException() {
//         String text = null;
//         System.out.println("Length of text: " + text.length());
//     }
//     public static void handleNullPointerException() {
//         String text = null;
//         try {
//             System.out.println("Length of text: " + text.length());
//         } catch (NullPointerException e) {
//             System.out.println("Handled NullPointerException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {

        
//         handleNullPointerException();
//     }
// }



// import java.util.*;
// public class Stringlevel1 {
//     public static void generateStringIndexOutOfBounds(String text) {
//         System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
//     }

//     public static void handleStringIndexOutOfBounds(String text) {
//         try {
//             System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String userInput = scanner.next();

//         handleStringIndexOutOfBounds(userInput);
//     }
// }



// import java.util.*;
// public class Stringlevel1 {
//     public static void generateIllegalArgumentException(String text) {
//         System.out.println("Substring: " + text.substring(5, 2));
//     }
//     public static void handleIllegalArgumentException(String text) {
//         try {
//             System.out.println("Substring: " + text.substring(5, 2));
//         } catch (IllegalArgumentException e) {
//             System.out.println("Handled IllegalArgumentException: " + e.getMessage());
//         } catch (RuntimeException e) {
//             System.out.println("Handled RuntimeException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a string: ");
//         String userInput = scanner.next();

//         handleIllegalArgumentException(userInput);
//     }
//    }


// import java.util.*;
// public class Stringlevel1 {
//     public static void generateNumberFormatException(String text) {
//         int number = Integer.parseInt(text);
//         System.out.println("Parsed number (no handling): " + number);
//     }
//     public static void handleNumberFormatException(String text) {
//         try {
//             int number = Integer.parseInt(text);
//             System.out.println("Parsed number (handled): " + number);
//         } catch (NumberFormatException e) {
//             System.out.println("Handled NumberFormatException: " + e.getMessage());
//         } catch (RuntimeException e) {
//             System.out.println("Handled RuntimeException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number (as text): ");
//         String userInput = scanner.next();

//         handleNumberFormatException(userInput);
//     }
// }




// import java.util.*;
// public class Stringlevel1 {
//     public static void generateArrayIndexOutOfBounds(String[] names, int index) {
//         System.out.println("Name at index " + index + ": " + names[index]);
//     }
//     public static void handleArrayIndexOutOfBounds(String[] names, int index) {
//         try {
//             System.out.println("Name at index " + index + ": " + names[index]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
//         } catch (RuntimeException e) {
//             System.out.println("Handled RuntimeException: " + e.getMessage());
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String[] names = {"Alice", "Bob", "Charlie", "David"};

//         System.out.println("The array has " + names.length + " names (0 to " + (names.length - 1) + ")");
//         System.out.print("Enter the index to access: ");
//         int index = scanner.nextInt();

//         handleArrayIndexOutOfBounds(names, index);
//     }
// }



// import java.util.*;
// public class Stringlevel1 {
//     public static String convertToUpperManual(String text) {
//         String result = "";

//         for (int i = 0; i < text.length(); i++) {
//             char ch = text.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 ch = (char)(ch - 32);
//             }

//             result += ch;
//         }

//         return result;
//     }

//     public static boolean compareStrings(String s1, String s2) {
//         if (s1.length() != s2.length()) {
//             return false;
//         }

//         for (int i = 0; i < s1.length(); i++) {
//             if (s1.charAt(i) != s2.charAt(i)) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a sentence: ");
//         String input = scanner.nextLine();
//         String manualUpper = convertToUpperManual(input);

//         String builtInUpper = input.toUpperCase();

//         boolean isEqual = compareStrings(manualUpper, builtInUpper);

//         System.out.println("Manual Uppercase:   " + manualUpper);
//         System.out.println("Built-in Uppercase: " + builtInUpper);
//         System.out.println("Are both strings equal? " + isEqual);
//     }
// }
