
// public class Stringhandling {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         str = str.toLowerCase().replaceAll("[^a-z]", ""); non-alphabetic chars
//         int vowels = 0, consonants = 0;

//         for (char ch : str.toCharArray()) {
//             if ("aeiou".indexOf(ch) != -1)
//                 vowels++;
//             else
//                 consonants++;
//         }

//         System.out.println("Vowels: " + vowels);
//         System.out.println("Consonants: " + consonants);
//     }
// }







// public class Stringhandling {
//     public static void main(String[] args) {
//         String str = "Java";
//         String reversed = "";

//         for (int i = str.length() - 1; i >= 0; i--)
//             reversed += str.charAt(i);

//         System.out.println("Reversed: " + reversed);
//     }
// }







// public class Stringhandling{
//     public static void main(String[] args) {
//         String str = "madam";
//         String reversed = "";

//         for (int i = str.length() - 1; i >= 0; i--)
//             reversed += str.charAt(i);

//         if (str.equals(reversed))
//             System.out.println("Palindrome hai!");
//         else
//             System.out.println("Palindrome nahi hai.");
//     }
// }





// public class stringhandling {
//     public static void main(String[] args) {
//         String str = "programming";
//         String result = "";

//         for (char ch : str.toCharArray()) {
//             if (result.indexOf(ch) == -1)
//                 result += ch;
//         }

//         System.out.println("Modified String: " + result);
//     }
// }



// public class Stringhandling{
//     public static void main(String[] args) {
//         String sentence = "Java is a powerful language";
//         String[] words = sentence.split(" ");
//         String longest = "";

//         for (String word : words) {
//             if (word.length() > longest.length())
//                 longest = word;
//         }

//         System.out.println("Longest Word: " + longest);
//     }
// }




// public class Stringhandling{
//     public static void main(String[] args) {
//         String str = "ababab";
//         String sub = "ab";
//         int count = 0;

//         for (int i = 0; i <= str.length() - sub.length(); i++) {
//             if (str.substring(i, i + sub.length()).equals(sub))
//                 count++;
//         }

//         System.out.println("Occurrences: " + count);
//     }
// }





// public class Stringhandling{
//     public static void main(String[] args) {
//         String str = "HeLLo";
//         String result = "";

//         for (char ch : str.toCharArray()) {
//             if (Character.isUpperCase(ch))
//                 result += Character.toLowerCase(ch);
//             else
//                 result += Character.toUpperCase(ch);
//         }

//         System.out.println("Toggled: " + result);
//     }
// }






// public class Stringhandling{
//     public static void main(String[] args) {
//         String s1 = "apple", s2 = "banana";
//         int minLen = Math.min(s1.length(), s2.length());

//         for (int i = 0; i < minLen; i++) {
//             if (s1.charAt(i) != s2.charAt(i)) {
//                 if (s1.charAt(i) < s2.charAt(i))
//                     System.out.println(s1 + " comes before " + s2);
//                 else
//                     System.out.println(s2 + " comes before " + s1);
//                 return;
//             }
//         }

//         if (s1.length() == s2.length())
//             System.out.println("Strings are equal");
//         else if (s1.length() < s2.length())
//             System.out.println(s1 + " comes before " + s2);
//         else
//             System.out.println(s2 + " comes before " + s1);
//     }
// }




// public class Stringhandling{
//     public static void main(String[] args) {
//         String str = "success";
//         int[] freq = new int[256];
//         for (char ch : str.toCharArray())
//             freq[ch]++;

//         int max = 0;
//         char result = ' ';
//         for (char ch : str.toCharArray()) {
//             if (freq[ch] > max) {
//                 max = freq[ch];
//                 result = ch;
//             }
//         }

//         System.out.println("Most Frequent Character: '" + result + "'");
//     }
// }




// public class Stringhandling {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         char remove = 'l';
//         String result = "";

//         for (char ch : str.toCharArray()) {
//             if (ch != remove)
//                 result += ch;
//         }

//         System.out.println("Modified String: " + result);
//     }
// }





// public class Stringhandling {
//     public static void main(String[] args) {
//         String s1 = "listen", s2 = "silent";

//         char[] a1 = s1.toCharArray();
//         char[] a2 = s2.toCharArray();

//         Arrays.sort(a1);
//         Arrays.sort(a2);

//         if (Arrays.equals(a1, a2))
//             System.out.println("Anagrams hai!");
//         else
//             System.out.println("Anagrams nahi hai.");
//     }
// }




// public class Stringhandling {
//     public static void main(String[] args) {
//         String sentence = "Java is fun";
//         String oldWord = "fun";
//         String newWord = "powerful";

//         String result = "";
//         String[] words = sentence.split(" ");

//         for (String word : words) {
//             if (word.equals(oldWord))
//                 result += newWord + " ";
//             else
//                 result += word + " ";
//         }

//         System.out.println("Modified Sentence: " + result.trim());
//     }
// }