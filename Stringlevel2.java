// import java.util.*;
// public class stringlevel2{
    
    
//     public static int getLengthWithoutUsingLength(String str) {
//         int count = 0;
//         try {
//             while (true) {
//                 str.charAt(count); 
//                 count++;
//             }
//         } catch (StringIndexOutOfBoundsException e) {
        
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter a string: ");
//         String input = scanner.next();

        
//         int customLength = getLengthWithoutUsingLength(input);

        
//         int builtInLength = input.length();

        
//         System.out.println("Length using custom method: " + customLength);
//         System.out.println("Length using built-in method: " + builtInLength);

//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class Stringlevel2 {

    
//     public static int getLength(String text) {
//         int count = 0;
//         try {
//             while (true) {
//                 text.charAt(count);
//                 count++;
//             }
//         } catch (IndexOutOfBoundsException e) {
            
//         }
//         return count;
//     }
//     public static String[] manualSplit(String text) {
//         int len = getLength(text);
//         int wordCount = 1;
//          for (int i = 0; i < len; i++) {
//             if (text.charAt(i) == ' ') {
//                 wordCount++;
//             }
//         }

//         String[] words = new String[wordCount];
//         int start = 0, wordIndex = 0;

//         for (int i = 0; i <= len; i++) {
//             if (i == len || text.charAt(i) == ' ') {
//                 String word = "";
//                 for (int j = start; j < i; j++) {
//                     word += text.charAt(j);
//                 }
//                 words[wordIndex++] = word;
//                 start = i + 1;
//             }
//         }

//         return words;
//     }
//     public static boolean compareArrays(String[] arr1, String[] arr2) {
//         if (arr1.length != arr2.length) return false;

//         for (int i = 0; i < arr1.length; i++) {
//             if (!arr1[i].equals(arr2[i])) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter a sentence: ");
//         String text = input.nextLine();
//         String[] builtInSplit = text.split(" ");
//         String[] manualSplit = manualSplit(text);
//         boolean isSame = compareArrays(builtInSplit, manualSplit);
//         System.out.println("\nBuilt-in split result:");
//         for (String word : builtInSplit) {
//             System.out.println(word);
//         }

//         System.out.println("\nManual split result:");
//         for (String word : manualSplit) {
//             System.out.println(word);
//         }

//         System.out.println("\nAre both split methods equal? " + isSame);

//         input.close();
//     }
// }











// import java.util.Scanner;

// public class Stringlevel2 {

    
//     public static int getLength(String str) {
//         int count = 0;
//         try {
//             while (true) {
//                 str.charAt(count);
//                 count++;
//             }
//         } catch (IndexOutOfBoundsException e) {
//             // End of string reached
//         }
//         return count;
//     }

   
//     public static String[] manualSplit(String text) {
//         int len = getLength(text);
//         int wordCount = 1;

        
//         for (int i = 0; i < len; i++) {
//             if (text.charAt(i) == ' ') {
//                 wordCount++;
//             }
//         }

//         String[] words = new String[wordCount];
//         int start = 0, wordIndex = 0;

//         for (int i = 0; i <= len; i++) {
//             if (i == len || text.charAt(i) == ' ') {
//                 String word = "";
//                 for (int j = start; j < i; j++) {
//                     word += text.charAt(j);
//                 }
//                 words[wordIndex++] = word;
//                 start = i + 1;
//             }
//         }

//         return words;
//     }

    
//     public static String[][] getWordLengthTable(String[] words) {
//         String[][] table = new String[words.length][2];

//         for (int i = 0; i < words.length; i++) {
//             table[i][0] = words[i]; // Word
//             table[i][1] = String.valueOf(getLength(words[i])); // Length as String
//         }

//         return table;
//     }

   
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter a sentence: ");
//         String text = input.nextLine();

      
//         String[] words = manualSplit(text);

        
//         String[][] wordTable = getWordLengthTable(words);

        
//         System.out.println("\nWord\tLength");
//         System.out.println("---------------");
//         for (int i = 0; i < wordTable.length; i++) {
//             String word = wordTable[i][0];
//             int length = Integer.parseInt(wordTable[i][1]); 
//             System.out.printf("%s\t%d%n", word, length);
//         }

//         input.close();
//     }
// }



// import java.util.Scanner;

// public class Stringlevel2{

   
//     public static int getLength(String str) {
//         int count = 0;
//         try {
//             while (true) {
//                 str.charAt(count);
//                 count++;
//             }
//         } catch (IndexOutOfBoundsException e) {
           
//         }
//         return count;
//     }

    
//     public static String[] manualSplit(String text) {
//         int len = getLength(text);
//         int wordCount = 1;

       
//         for (int i = 0; i < len; i++) {
//             if (text.charAt(i) == ' ') {
//                 wordCount++;
//             }
//         }

//         String[] words = new String[wordCount];
//         int start = 0, wordIndex = 0;

//         for (int i = 0; i <= len; i++) {
//             if (i == len || text.charAt(i) == ' ') {
//                 String word = "";
//                 for (int j = start; j < i; j++) {
//                     word += text.charAt(j);
//                 }
//                 words[wordIndex++] = word;
//                 start = i + 1;
//             }
//         }

//         return words;
//     }

    
//     public static String[][] getWordLengthTable(String[] words) {
//         String[][] table = new String[words.length][2];

//         for (int i = 0; i < words.length; i++) {
//             table[i][0] = words[i]; // Word
//             table[i][1] = String.valueOf(getLength(words[i])); 
//         }

//         return table;
//     }

   
//     public static int[] findShortestAndLongest(String[][] wordTable) {
//         int minIndex = 0, maxIndex = 0;
//         int minLength = Integer.parseInt(wordTable[0][1]);
//         int maxLength = Integer.parseInt(wordTable[0][1]);

//         for (int i = 1; i < wordTable.length; i++) {
//             int currentLength = Integer.parseInt(wordTable[i][1]);

//             if (currentLength < minLength) {
//                 minLength = currentLength;
//                 minIndex = i;
//             }

//             if (currentLength > maxLength) {
//                 maxLength = currentLength;
//                 maxIndex = i;
//             }
//         }

//         return new int[]{minIndex, maxIndex};
//     }

   
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a sentence: ");
//         String text = input.nextLine();

       
//         String[] words = manualSplit(text);

        
//         String[][] wordTable = getWordLengthTable(words);

        
//         int[] resultIndexes = findShortestAndLongest(wordTable);
//         String shortestWord = wordTable[resultIndexes[0]][0];
//         String longestWord = wordTable[resultIndexes[1]][0];
//         int shortestLength = Integer.parseInt(wordTable[resultIndexes[0]][1]);
//         int longestLength = Integer.parseInt(wordTable[resultIndexes[1]][1]);

        
//         System.out.println("\nWord\tLength");
//         System.out.println("---------------");
//         for (String[] row : wordTable) {
//             System.out.printf("%s\t%d%n", row[0], Integer.parseInt(row[1]));
//         }

//         System.out.println("\nShortest word: " + shortestWord + " (" + shortestLength + " characters)");
//         System.out.println("Longest word: " + longestWord + " (" + longestLength + " characters)");

//         input.close();
//     }
// }



// import java.util.Scanner;

// public class  Stringlevel2 {

//     
//     public static String checkCharType(char ch) {
        
//         if (ch >= 'A' && ch <= 'Z') {
//             ch = (char)(ch + 32); 
//         }

        
//         if (ch >= 'a' && ch <= 'z') {
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 return "Vowel";
//             } else {
//                 return "Consonant";
//             }
//         } else {
//             return "Not a Letter";
//         }
//     }

    
//     public static int[] countVowelsAndConsonants(String text) {
//         int vowelCount = 0;
//         int consonantCount = 0;

//         for (int i = 0; i < text.length(); i++) {
//             char ch = text.charAt(i);
//             String type = checkCharType(ch);

//             if (type.equals("Vowel")) {
//                 vowelCount++;
//             } else if (type.equals("Consonant")) {
//                 consonantCount++;
//             }
//         }

//         return new int[]{vowelCount, consonantCount};
//     }

//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a string: ");
//         String text = input.nextLine();

        
//         int[] result = countVowelsAndConsonants(text);

        
//         System.out.println("\nTotal Vowels: " + result[0]);
//         System.out.println("Total Consonants: " + result[1]);

//         input.close();
//     }
// }

 

// import java.util.Scanner;

// public class Stringlevel2 {

    
//     public static String getCharType(char ch) {
        
//         if (ch >= 'A' && ch <= 'Z') {
//             ch = (char)(ch + 32);
//         }

       
//         if (ch >= 'a' && ch <= 'z') {
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 return "Vowel";
//             } else {
//                 return "Consonant";
//             }
//         } else {
//             return "Not a Letter";
//         }
//     }

   
//     public static String[][] analyzeCharacters(String text) {
//         int len = text.length();
//         String[][] result = new String[len][2];

//         for (int i = 0; i < len; i++) {
//             char ch = text.charAt(i);
//             result[i][0] = String.valueOf(ch);
//             result[i][1] = getCharType(ch);
//         }

//         return result;
//     }

   
//     public static void displayTable(String[][] table) {
//         System.out.println("\nCharacter\tType");
//         System.out.println("-------------------------");
//         for (String[] row : table) {
//             System.out.printf("%s\t\t%s%n", row[0], row[1]);
//         }
//     }

   
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a string: ");
//         String text = input.nextLine();

        
//         String[][] resultTable = analyzeCharacters(text);

//         displayTable(resultTable);

//         input.close();
//     }
// }





    

