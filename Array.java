//  import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         int[] ages = new int[10]; 
//         Scanner scanner = new Scanner(System.in);

//         for (int i = 0; i < ages.length; i++) {
//             System.out.print("Enter age of student " + (i + 1) + ": ");
//             ages[i] = scanner.nextInt();
//         }

//         System.out.println("\nVoting Eligibility Results:");

//         for (int i = 0; i < ages.length; i++) {
//             int age = ages[i];

//             if (age < 0) {
//                 System.out.println("Invalid age entered for student " + (i + 1) + ".");
//             } else if (age >= 18) {
//                 System.out.println("The student with the age " + age + " can vote.");
//             } else {
//                 System.out.println("The student with the age " + age + " cannot vote.");
//             }
//         }

//         scanner.close();
//     }
// }





// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         int[] numbers = new int[5]; 
//         Scanner scanner = new Scanner(System.in);

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print("Enter number " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt();
//         }

//         System.out.println("\nNumber Analysis:");
       
//         for (int i = 0; i < numbers.length; i++) {
//             int num = numbers[i];

//             if (num > 0) {
//                 if (num % 2 == 0) {
//                     System.out.println("Number " + num + " is positive and even.");
//                 } else {
//                     System.out.println("Number " + num + " is positive and odd.");
//                 }
//             } else if (num < 0) {
//                 System.out.println("Number " + num + " is negative.");
//             } else {
//                 System.out.println("Number " + num + " is zero.");
//             }
//         }

//         int first = numbers[0];
//         int last = numbers[numbers.length - 1];

//         System.out.println("\nComparison of first and last elements:");
//         if (first == last) {
//             System.out.println("First and last elements are equal.");
//         } else if (first > last) {
//             System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
//         } else {
//             System.out.println("First element (" + first + ") is less than last element (" + last + ").");
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number to print its multiplication table: ");
//         int number = scanner.nextInt();

//         int[] table = new int[10]; 
        
//         for (int i = 1; i <= 10; i++) {
//             table[i - 1] = number * i;
//         }

//         System.out.println("\nMultiplication Table of " + number + ":");
//         for (int i = 0; i < table.length; i++) {
//             System.out.println(number + " * " + (i + 1) + " = " + table[i]);
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         double[] numbers = new double[10]; 
//         double total = 0.0;                
//         int index = 0;                     
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.print("Enter a number (0 or negative to stop): ");
//             double input = scanner.nextDouble();

//             if (input <= 0) {
//                 break;
//             }

//             if (index == 10) {
//                 System.out.println("Maximum of 10 numbers reached.");
//                 break;
//             }

//             numbers[index] = input;
//             index++;
//         }

//         System.out.println("\nNumbers entered:");
//         for (int i = 0; i < index; i++) {
//             System.out.println(numbers[i]);
//             total += numbers[i];
//         }

//         System.out.println("\nTotal sum of numbers: " + total);

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
//         int number = scanner.nextInt();

//         int[] multiplicationResult = new int[4];

//         for (int i = 6; i <= 9; i++) {
//             multiplicationResult[i - 6] = number * i;
//         }

//         System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
//         for (int i = 0; i < multiplicationResult.length; i++) {
//             int multiplier = i + 6;
//             System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         double[] heights = new double[11]; 
//         double sum = 0.0;

//         for (int i = 0; i < heights.length; i++) {
//             System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
//             heights[i] = scanner.nextDouble();
//             sum += heights[i]; 
//         }

//         double mean = sum / heights.length;

//         System.out.printf("\nMean height of the football team: %.2f cm\n", mean);

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a natural number: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Error: Please enter a natural number (positive integer).");
//             return; 
//         }

//         int size = number / 2 + 1;

//         int[] oddNumbers = new int[size];
//         int[] evenNumbers = new int[size];
//         int oddIndex = 0;
//         int evenIndex = 0;

//         for (int i = 1; i <= number; i++) {
//             if (i % 2 == 0) {
//                 evenNumbers[evenIndex] = i;
//                 evenIndex++;
//             } else {
//                 oddNumbers[oddIndex] = i;
//                 oddIndex++;
//             }
//         }

//         System.out.print("\nOdd Numbers: ");
//         for (int i = 0; i < oddIndex; i++) {
//             System.out.print(oddNumbers[i] + " ");
//         }

//         System.out.print("\nEven Numbers: ");
//         for (int i = 0; i < evenIndex; i++) {
//             System.out.print(evenNumbers[i] + " ");
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class FactorFinder {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a positive integer to find its factors: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Invalid input. Please enter a positive integer.");
//             return;
//         }

//         int maxFactor = 10;
//         int[] factors = new int[maxFactor];
//         int index = 0;

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
                
//                 if (index == maxFactor) {
//                     maxFactor *= 2;
//                     int[] temp = new int[maxFactor];
//                     for (int j = 0; j < factors.length; j++) {
//                         temp[j] = factors[j];
//                     }
//                     factors = temp;
//                 }

//                 // Store the factor
//                 factors[index] = i;
//                 index++;
//             }
//         }

//         // Display the factors
//         System.out.println("\nFactors of " + number + " are:");
//         for (int i = 0; i < index; i++) {
//             System.out.print(factors[i] + " ");
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int rows = scanner.nextInt();

//         System.out.print("Enter number of columns: ");
//         int columns = scanner.nextInt();

//         int[][] matrix = new int[rows][columns];

//         System.out.println("\nEnter elements of the matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print("Element at [" + i + "][" + j + "]: ");
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         int[] array = new int[rows * columns];
//         int index = 0;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 array[index] = matrix[i][j];
//                 index++;
//             }
//         }

//         System.out.println("\n2D Array (Matrix):");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 System.out.print(matrix[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         System.out.println("\nCopied 1D Array:");
//         for (int i = 0; i < array.length; i++) {
//             System.out.print(array[i] + " ");
//         }

//         scanner.close();
//     }
// }





// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Invalid input. Please enter a positive integer.");
//             return;
//         }

//         String[] results = new String[number];

//         for (int i = 1; i <= number; i++) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 results[i - 1] = "FizzBuzz";
//             } else if (i % 3 == 0) {
//                 results[i - 1] = "Fizz";
//             } else if (i % 5 == 0) {
//                 results[i - 1] = "Buzz";
//             } else {
//                 results[i - 1] = Integer.toString(i);
//             }
//         }

//         System.out.println("\nFizzBuzz Results:");
//         for (int i = 0; i < results.length; i++) {
//             System.out.println("Position " + (i + 1) + " = " + results[i]);
//         }

//         scanner.close();
//     }
// }




