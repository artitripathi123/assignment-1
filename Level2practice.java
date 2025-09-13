//  import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the first number: ");
//         double number1 = input.nextDouble();

//         System.out.print("Enter the second number: ");
//         double number2 = input.nextDouble();

       
//         double addition = number1 + number2;
//         double subtraction = number1 - number2;
//         double multiplication = number1 * number2;
//         String division;

        
//         if (number2 != 0) {
//             division = String.valueOf(number1 / number2);
//         } else {
//             division = "undefined (division by zero)";
//         }

        
//         System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
//                 number1 + " and " + number2 + " is " +
//                 addition + ", " + subtraction + ", " + multiplication + ", and " + division);

//         input.close();
//     }
// }





// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the base of the triangle in cm: ");
//         double base = input.nextDouble();

//         System.out.print("Enter the height of the triangle in cm: ");
//         double height = input.nextDouble();

        
//         double areaSqCm = 0.5 * base * height;

       
//         double areaSqIn = areaSqCm / 6.4516;

        
//         System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

//         input.close();
//     }
// }



// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the perimeter of the square: ");
//         double perimeter = input.nextDouble();

        
//         double side = perimeter / 4;

        
//         System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

//         input.close();
//     }
// }



// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the distance in feet: ");
//         double distanceInFeet = input.nextDouble();

        
//         double distanceInYards = distanceInFeet / 3;

        
//         double distanceInMiles = distanceInYards / 1760;

        
//         System.out.println("The distance in yards is " + distanceInYards +   " while the distance in miles is " + distanceInMiles);

//         input.close();
//     }
// }



// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the unit price of the item (INR): ");
//         double unitPrice = input.nextDouble();

       
//         System.out.print("Enter the quantity to be bought: ");
//         int quantity = input.nextInt();

        
//         double totalPrice = unitPrice * quantity;

        
//         System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity +" and unit price is INR " + unitPrice);

//         input.close();
//     }
// }




// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter the first number: ");
//         int number1 = input.nextInt();

//         System.out.print("Enter the second number: ");
//         int number2 = input.nextInt();

        
//         if (number2 == 0) {
//             System.out.println("Division by zero is not allowed.");
//         } else {
           
//             int quotient = number1 / number2;
//             int remainder = number1 % number2;

           
//             System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +   " of two number " + number1 + " and " + number2);
//         }

//         input.close();
//     }
// }



// import java.util.*;

// public class Level2practice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

       
//         int a, b, c;

        
//         System.out.print("Enter value for a: ");
//         a = input.nextInt();

//         System.out.print("Enter value for b: ");
//         b = input.nextInt();

//         System.out.print("Enter value for c: ");
//         c = input.nextInt();

        
//         int result1 = a + b * c;      
//         int result2 = a * b + c;      
//         int result3 = c + a / b;      
//         int result4 = a % b + c;      

        
//         System.out.println("The results of Int Operations are:");
//         System.out.println("a + b * c = " + result1);
//         System.out.println("a * b + c = " + result2);
//         System.out.println("c + a / b = " + result3);
//         System.out.println("a % b + c = " + result4);

//         input.close();
//     }
// }


