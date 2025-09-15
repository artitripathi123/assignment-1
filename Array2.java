//  import java.util.*;
// public class Array2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         final int EMPLOYEES = 10;
//         double[] salaries = new double[EMPLOYEES];
//         double[] yearsOfService = new double[EMPLOYEES];
//         double[] bonuses = new double[EMPLOYEES];
//         double[] newSalaries = new double[EMPLOYEES];

//         double totalBonus = 0.0;
//         double totalOldSalary = 0.0;
//         double totalNewSalary = 0.0;

//         for (int i = 0; i < EMPLOYEES; i++) {
//             System.out.println("Enter details for employee " + (i + 1) + ":");

//             System.out.print("Salary: ");
//             double salary = scanner.nextDouble();

//             System.out.print("Years of Service: ");
//             double years = scanner.nextDouble();

//             if (salary <= 0) {
//                 System.out.println("Invalid salary! Please enter a positive number.");
//                 i--;
//                 continue;
//             }

//             if (years < 0) {
//                 System.out.println("Invalid years of service! Must be zero or positive.");
//                 i--;
//                 continue;
//             }

//             salaries[i] = salary;
//             yearsOfService[i] = years;
//         }

//         for (int i = 0; i < EMPLOYEES; i++) {
//             double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
//             bonuses[i] = salaries[i] * bonusPercent;
//             newSalaries[i] = salaries[i] + bonuses[i];

//             totalBonus += bonuses[i];
//             totalOldSalary += salaries[i];
//             totalNewSalary += newSalaries[i];
//         }

//         System.out.println("\nEmployee Bonus Details:");
//         for (int i = 0; i < EMPLOYEES; i++) {
//             System.out.printf("Employee %d -> Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
//                     i + 1, salaries[i], bonuses[i], newSalaries[i]);
//         }

//         System.out.printf("\nTotal Bonus Payout by Zara: %.2f%n", totalBonus);
//         System.out.printf("Total Old Salary of all employees: %.2f%n", totalOldSalary);
//         System.out.printf("Total New Salary of all employees: %.2f%n", totalNewSalary);

//         scanner.close();
//     }
// }





// import java.util.*;
// public class Array2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String[] friends = {"Amar", "Akbar", "Anthony"};
//         int[] ages = new int[3];
//         double[] heights = new double[3];

//         for (int i = 0; i < 3; i++) {
//             System.out.print("Enter age of " + friends[i] + ": ");
//             ages[i] = scanner.nextInt();

//             System.out.print("Enter height (in cm) of " + friends[i] + ": ");
//             heights[i] = scanner.nextDouble();
//         }

//         int youngestIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (ages[i] < ages[youngestIndex]) {
//                 youngestIndex = i;
//             }
//         }

//         int tallestIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (heights[i] > heights[tallestIndex]) {
//                 tallestIndex = i;
//             }
//         }

//         System.out.println("\nYoungest friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
//         System.out.println("Tallest friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Array2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         final int maxDigit = 10;
//         int[] digits = new int[maxDigit];
//         int index = 0;

//         while (number != 0) {
//             int digit = number % 10; 
//             digits[index] = digit;   
//             index++;
//             number /= 10;           

//             if (index == maxDigit) {
//                 System.out.println("Only first 10 digits are considered.");
//                 break;
//             }
//         }
//         int largest = -1;
//         int secondLargest = -1;

//         for (int i = 0; i < index; i++) {
//             int current = digits[i];

//             if (current > largest) {
//                 secondLargest = largest;
//                 largest = current;
//             } else if (current > secondLargest && current != largest) {
//                 secondLargest = current;
//             }
//         }
//         System.out.print("\nDigits stored in array: ");
//         for (int i = 0; i < index; i++) {
//             System.out.print(digits[i] + " ");
//         }

//         System.out.println("\n\nLargest digit: " + largest);
//         if (secondLargest != -1) {
//             System.out.println("Second largest digit: " + secondLargest);
//         } else {
//             System.out.println("Second largest digit not found (all digits may be the same).");
//         }
//         scanner.close();
//     }
// }


// import java.util.*;
// public class Array2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int maxDigit = 10;
//         int[] digits = new int[maxDigit];
//         int index = 0;

//         while (number != 0) {
//             if (index == maxDigit) {
//                 maxDigit += 10;
//                 int[] temp = new int[maxDigit];
//                 for (int i = 0; i < digits.length; i++) {
//                     temp[i] = digits[i];
//                 }
//                 digits = temp;
//             }

//             int digit = number % 10;
//             digits[index] = digit;
//             index++;

//             number /= 10;
//         }

//         int largest = -1;
//         int secondLargest = -1;

//         for (int i = 0; i < index; i++) {
//             int current = digits[i];

//             if (current > largest) {
//                 secondLargest = largest;
//                 largest = current;
//             } else if (current > secondLargest && current != largest) {
//                 secondLargest = current;
//             }
//         }
//         System.out.print("\nDigits stored in array: ");
//         for (int i = 0; i < index; i++) {
//             System.out.print(digits[i] + " ");
//         }

//         System.out.println("\n\nLargest digit: " + largest);
//         if (secondLargest != -1) {
//             System.out.println("Second largest digit: " + secondLargest);
//         } else {
//             System.out.println("Second largest digit not found (all digits may be the same).");
//         }

//         scanner.close();
//     }
// }



// import java.util.*;
// public class Array2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int temp = number;
//         int count = 0;
//         while (temp != 0) {
//             count++;
//             temp /= 10;
//         }
//         int[] digits = new int[count];
//         temp = number;
//         for (int i = 0; i < count; i++) {
//             digits[i] = temp % 10;
//             temp /= 10;
//         }
//         int[] reversed = new int[count];
//         for (int i = 0; i < count; i++) {
//             reversed[i] = digits[count - 1 - i];
//         }
//         System.out.print("Reversed number: ");
//         for (int i = 0; i < count; i++) {
//             System.out.print(digits[i]);  
//         }

//         System.out.println();
//         scanner.close();
//     }
// }



