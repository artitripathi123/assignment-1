//  import java.util.*;

// public class Controlflowlevel1{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a number: ");
//         int number = input.nextInt();

        
//         boolean isDivisible = (number % 5 == 0);

       
//         System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

//         input.close();
//     }
// }




// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the first number: ");
//         int number1 = input.nextInt();

//         System.out.print("Enter the second number: ");
//         int number2 = input.nextInt();

//         System.out.print("Enter the third number: ");
//         int number3 = input.nextInt();

       
//         boolean isSmallest = (number1 < number2) && (number1 < number3);

        
//         System.out.println("Is the first number the smallest? " + isSmallest);

//         input.close();
//     }
// }



// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the first number: ");
//         int number1 = input.nextInt();

//         System.out.print("Enter the second number: ");
//         int number2 = input.nextInt();

//         System.out.print("Enter the third number: ");
//         int number3 = input.nextInt();

        
//         int largest = number1;
//         if (number2 > largest) {
//             largest = number2;
//         }
//         if (number3 > largest) {
//             largest = number3;
//         }

       
//         boolean firstIsLargest = (number1 == largest);
//         boolean secondIsLargest = (number2 == largest);
//         boolean thirdIsLargest = (number3 == largest);

       
//         System.out.println("Is the first number the largest? " + firstIsLargest);
//         System.out.println("Is the second number the largest? " + secondIsLargest);
//         System.out.println("Is the third number the largest? " + thirdIsLargest);

//         input.close();
//     }
// }




// import java.util.*;

// public class Controlflowlevel1{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a number: ");
//         int number = input.nextInt();

        
//         if (number >= 1) {
//             int sum = number * (number + 1) / 2;
//             System.out.println("The sum of " + number + " natural numbers is " + sum);
//         } else {
//             System.out.println("The number " + number + " is not a natural number");
//         }

//         input.close();
//     }
// }


// import java.util.*;

// public class Controlflowlevel1{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter the person's age: ");
//         int age = input.nextInt();

        
//         if (age >= 18) {
//             System.out.println("The person's age is " + age + " and can vote.");
//         } else {
//             System.out.println("The person's age is " + age + " and cannot vote.");
//         }

//         input.close();
//     }
// }



// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter a number: ");
//         int number = input.nextInt();

        
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

//         input.close();
//     }
// }


// import java.util.*;
// public class Controlflowlevel1{
//     public static void main(String[] args) {
//         if (args.length < 2) {
//             System.out.println("Please provide month and day as command line arguments.");
//             return;
//         }

        
//         int month = Integer.parseInt(args[0]);
//         int day = Integer.parseInt(args[1]);

//         boolean isSpring = false;

        
//         if (month == 3 && day >= 20 && day <= 31) {
//             isSpring = true;
//         } else if (month > 3 && month < 6) {
//             isSpring = true;
//         } else if (month == 6 && day >= 1 && day <= 20) {
//             isSpring = true;
//         }

       
//         if (isSpring) {
//             System.out.println("Its a Spring Season");
//         } else {
//             System.out.println("Not a Spring Season");
//         }
//     }
// }



// import java.util.*;

// public class Controlfllowlevel1{
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter the starting countdown number: ");
//         int counter = scanner.nextInt();

       
//         while (counter >= 1) {
//             System.out.println(counter);
//             counter--; 
//         }

       
//         System.out.println("Liftoff! 🚀");

       
//         scanner.close();
//     }
// }




// import java.util.*;

// public class Conntrolflowlevel1 {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
        
//         double total = 0.0;
       
//         double number;
        
//         System.out.print("Enter a number (0 to stop): ");
//         number = scanner.nextDouble();
       
//         while (number != 0) {
           
//             total += number;
           
//             System.out.print("Enter another number (0 to stop): ");
//             number = scanner.nextDouble();
//         }
       
//         System.out.println("The total sum is: " + total);

//         scanner.close();
//     }
// }



// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
       
//         Scanner scanner = new Scanner(System.in);

//         double total = 0.0;

//         while (true) {
            
//             System.out.print("Enter a number (0 or negative to stop): ");
//             double number = scanner.nextDouble()
            
//             if (number <= 0) {
//                 break; 
           
//             total += number;
//         }
       
//         System.out.println("The total sum is: " + total);
        
//         scanner.close();
//     }
// }
// }




// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a natural number (n >= 1): ");
//         int n = scanner.nextInt();

        
//         if (n < 1) {
//             System.out.println("Invalid input. Please enter a natural number (n >= 1).");
//         } else {
           
//             int formulaSum = n * (n + 1) / 2;

//             int loopSum = 0;
//             int i = 1;

//             while (i <= n) {
//                 loopSum += i;
//                 i++;
//             }

//             System.out.println("Sum using formula    : " + formulaSum);
//             System.out.println("Sum using while loop   : " + loopSum);

           
//             if (formulaSum == loopSum) {
//                 System.out.println("Both results are equal. Computation is correct.");
//             } else {
//                 System.out.println(" Results are different. There is an error in computation.");
//             }
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Controlflowlevel1 {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number < 0) {
//             System.out.println("Invalid input. Please enter a non-negative integer.");
//         } else {
           
//             long factorial = 1;

//             int i = 1;
//             while (i <= number) {
//                 factorial *= i;
//                 i++;
//             }

//             System.out.println("Factorial of " + number + " is: " + factorial);
//         }
//         scanner.close();
//     }
// }




// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a natural number (n >= 1): ");
//         int number = scanner.nextInt();

//         if (number < 1) {
//             System.out.println("Invalid input. Please enter a natural number (n >= 1).");
//         } else {
            
//             for (int i = 1; i <= number; i++) {
//                 if (i % 2 == 0) {
//                     System.out.println(i + " is an even number.");
//                 } else {
//                     System.out.println(i + " is an odd number.");
//                 }
//             }
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Controlflowlevel1 {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter employee salary: ");
//         double salary = scanner.nextDouble();

       
//         System.out.print("Enter years of service: ");
//         int yearsOfService = scanner.nextInt();

        
//         if (yearsOfService > 5) {
           
//             double bonus = salary * 0.05;
//             System.out.println("Bonus amount is: " + bonus);
//         } else {
//             System.out.println("No bonus. Service must be more than 5 years.");
//         }

        
//         scanner.close();
//     }
// }





// import java.util.*;

// public class Controlflowlevel1 {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number to generate its multiplication table: ");
//         int number = scanner.nextInt();

//         System.out.println("Multiplication table of " + number + " from 6 to 9:");
//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }

//         scanner.close();
//     }
// }
