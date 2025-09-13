//  import java.util.*;

// public class Controlflowlevele2 {
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

// public class Controlfloelevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of employees: ");
//         int numEmployees = scanner.nextInt();

//         for (int i = 1; i <= numEmployees; i++) {
//             System.out.println("Employee #" + i + ":");

//             System.out.print("Enter salary: ");
//             double salary = scanner.nextDouble();

//             System.out.print("Enter years of service: ");
//             int yearsOfService = scanner.nextInt();

//             if (yearsOfService > 5) {
//                 double bonus = salary * 0.05;
//                 System.out.println("Bonus amount: " + bonus);
//             } else {
//                 System.out.println("No bonus (service less than or equal to 5 years).");
//             }

//             System.out.println(); 
//         }

//         scanner.close();
//     }
// }





// import java.util.*;

// public class Controlfloelevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }

//         scanner.close();
//     }
// }






// import java.util.*;

// public class Controlflowlevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Invalid input. Please enter a positive integer.");
//         } else {
            
//             for (int i = 1; i <= number; i++) {
                
//                 if (i % 3 == 0 && i % 5 == 0) {
//                     System.out.println("FizzBuzz");
//                 }
                
//                 else if (i % 3 == 0) {
//                     System.out.println("Fizz");
//                 }
                
//                 else if (i % 5 == 0) {
//                     System.out.println("Buzz");
//                 }
                
//                 else {
//                     System.out.println(i);
//                 }
//             }
//         }

//         scanner.close();
//     }
// }






// import java.util.*;

// public class Controlflowlevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter age of Amar: ");
//         int ageAmar = scanner.nextInt();
//         System.out.println("Enter height of Amar (in cm): ");
//         int heightAmar = scanner.nextInt();

//         System.out.println("Enter age of Akbar: ");
//         int ageAkbar = scanner.nextInt();
//         System.out.println("Enter height of Akbar (in cm): ");
//         int heightAkbar = scanner.nextInt();

//         System.out.println("Enter age of Anthony: ");
//         int ageAnthony = scanner.nextInt();
//         System.out.println("Enter height of Anthony (in cm): ");
//         int heightAnthony = scanner.nextInt();

//         String youngest;
//         int minAge = ageAmar;
//         youngest = "Amar";

//         if (ageAkbar < minAge) {
//             minAge = ageAkbar;
//             youngest = "Akbar";
//         }
//         if (ageAnthony < minAge) {
//             minAge = ageAnthony;
//             youngest = "Anthony";
//         }

       
//         String tallest;
//         int maxHeight = heightAmar;
//         tallest = "Amar";

//         if (heightAkbar > maxHeight) {
//             maxHeight = heightAkbar;
//             tallest = "Akbar";
//         }
//         if (heightAnthony > maxHeight) {
//             maxHeight = heightAnthony;
//             tallest = "Anthony";
//         }

        
//         System.out.println("\n--- Results ---");
//         System.out.println("The youngest friend is: " + youngest + " (Age: " + minAge + ")");
//         System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

//         scanner.close();
//     }
// }



// import java.util.*;
// public class Controllflowlevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Invalid input. Please enter a positive integer.");
//         } else {
//             System.out.println("Factors of " + number + " are:");

//             for (int i = 1; i <= number; i++) {
//                 if (number % i == 0) {
//                     System.out.println(i);
//                 }
//             }
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Controlflowlevel2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 0) {
//             System.out.println("Invalid input. Please enter a positive integer.");
//         } else {
//             System.out.println("Factors of " + number + " are:");

//             int counter = 1;

//             while (counter <= number) {
//                 if (number % counter == 0) {
//                     System.out.println(counter);
//                 }
//                 counter++;
//             }
//         }

//         scanner.close();
//     }
// }




// import java.util.*;
// public class Controlflowlevel2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 1) {
//             System.out.println("No proper factors exist for numbers less than or equal to 1.");
//         } else {
//             int greatestFactor = 1;

//             for (int i = number - 1; i >= 1; i--) {
//                 if (number % i == 0) {
//                     greatestFactor = i;
//                     break;
//                 }
//             }

//             System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
//         }

//         scanner.close();
//     }
// }





// import java.util.*;
// public class Controlflowlevel2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer: ");
//         int number = scanner.nextInt();

//         if (number <= 1) {
//             System.out.println("No proper factors exist for numbers less than or equal to 1.");
//         } else {
//             int greatestFactor = 1;
//             int counter = number - 1;

//             while (counter >= 1) {
//                 if (number % counter == 0) {
//                     greatestFactor = counter;
//                     break; 
//                 }
//                 counter--;
//             }

//             System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
//         }

//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class Controlflowlevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter a positive integer less than 100: ");
//         int number = scanner.nextInt();

        
//         if (number <= 0 || number >= 100) {
//             System.out.println("Invalid input. Please enter a positive integer less than 100.");
//         } else {
//             System.out.println("Multiples of " + number + " below 100 are:");

           
//             for (int i = 100; i >= 1; i--) {
//                 if (i % number == 0) {
//                     System.out.println(i);
//                 }
//             }
//         }

//         scanner.close();
//     }
// }



// import java.util.Scanner;

// public class Controlflowlevel2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

        
//         System.out.print("Enter the base number (positive integer): ");
//         int number = scanner.nextInt();

//         System.out.print("Enter the power (positive integer): ");
//         int power = scanner.nextInt();

        
//         if (number < 0 || power < 0) {
//             System.out.println("Invalid input. Please enter only positive integers.");
//         } else {
//             int result = 1;

            
//             for (int i = 1; i <= power; i++) {
//                 result *= number;
//             }

           
//             System.out.println(number + " raised to the power " + power + " is: " + result);
//         }

//         scanner.close();
//     }
// }




// import java.util.*;

// public class Controlflowlevel2 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a positive integer less than 100: ");
//         int number = scanner.nextInt();

//         if (number <= 0 || number >= 100) {
//             System.out.println("Invalid input. Please enter a positive integer less than 100.");
//         } else {
//             System.out.println("Multiples of " + number + " below 100 are:");

//             int counter = 100;

//             while (counter > 1) {
//                 if (counter % number == 0) {
//                     System.out.println(counter);
//                 }
//                 counter--;
//             }
//         }

//         scanner.close();
//     }
// }





