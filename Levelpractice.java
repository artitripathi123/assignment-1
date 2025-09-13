//  import java.util.*;
//  public class Levelpractice {
//     public static void main(String[] args) {
        
//         int birthYear = 2000;
//         int currentYear = 2024;

        
//         int age = currentYear - birthYear;

        
//         System.out.println("Harry's age in " + currentYear + " is " + age);
//     }
// }

// import java.util.*;


// import java.util.*;
// public class Levelpractice {
//     public static void main(String[] args) {
        
//         int maths = 94;
//         int physics = 95;
//         int chemistry = 96;

        
//         int totalMarks = maths + physics + chemistry;
//         double average = totalMarks / 3.0;

        
//         System.out.println("Sam’s average mark in PCM is " + average);
//     }
// }





// import java.util.*;
// public class Levelpractice{
//     public static void main(String[] args) {
        
//         double kilometers = 10.8;

        
//         double conversionFactor = 1.6;

        
//         double miles = kilometers * conversionFactor;

        
//         System.out.println("The distance " + kilometers + " km in miles is " + miles);
//     }
// }



// import java.util.*;
// public class Levelpractice {
//     public static void main(String[] args) {
        
//         double costPrice = 129;
//         double sellingPrice = 191;

       
//         double profit = sellingPrice - costPrice;
//         double profitPercentage = (profit / costPrice) * 100;

        
//         System.out.println(
//             "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
//             "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
//         );
//     }
// }


// import java.util.*;
// public class Levelpractice {
//     public static void main(String[] args) {
        
//         int totalPens = 14;
//         int students = 3;

        
//         int pensPerStudent = totalPens / students;
//         int remainingPens = totalPens % students;

        
//         System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);


// import java.util.*;
// public class Levelpractice{
//     public static void main(String[] args) {
        
//         double fee = 125000;
//         double discountPercent = 10;

        
//         double discount = (fee * discountPercent) / 100;

        
//         double finalFee = fee - discount;

        
//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
//     }
// }


// import java.util.*;
// public class Levelpractice {
//     public static void main(String[] args) {
        
//         double radiusKm = 6378;

        
//         double kmToMiles = 0.621371;

        
//         double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        
//         double radiusMiles = radiusKm * kmToMiles;

        
//                 double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

     
//         System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
//     }
// }


// import java.util.Scanner;

// public class Levelpractice {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         double km;

        
//         System.out.print("Enter the distance in kilometers: ");
//         km = input.nextInt();

        
//         double miles = km / 1.6;

        
//         System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
//         input.close(); 
//     }
// }



// import java.util.*;

// public class Levelpractice {
//     public static void main(String[] args) {
       
//         Scanner input = new Scanner(System.in);

        
//         double fee, discountPercent;

        
//         System.out.print("Enter the course fee (INR): ");
//         fee = input.nextDouble();

        
//         System.out.print("Enter the discount percentage (%): ");
//         discountPercent = input.nextDouble();

        
//         double discount = (fee * discountPercent) / 100;

        
//         double finalFee = fee - discount;

        
//         System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + finalFee);

        
//         input.close();
//     }
// }




// import java.util.*;

// public class Levepractice{
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter your height in centimeters: ");
//         double heightCm = input.nextDouble();

        
//         double cmPerInch = 2.54;
//         int inchesPerFoot = 12;

        
//         double totalInches = heightCm / cmPerInch;

        
//         int feet = (int) (totalInches / inchesPerFoot);
//         double inches = totalInches % inchesPerFoot;

        
//         System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet +   " and inches is " + String.format("%.2f", inches));

        
//         input.close();
//     }
// }


// import java.util.*;

// public class Levelpractice {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

       
//         System.out.print("Enter the first number: ");
//         double number1 = input.nextDouble();

//         System.out.print("Enter the second number: ");
//         double number2 = input.nextDouble();

       
//         double addition = number1 + number2;
//         double subtraction = number1 - number2;
//         double multiplication = number1 * number2;
//         double division = 0;

     
//         if (number2 != 0) {
//             division = number1 / number2;
//         } else {
//             System.out.println("Division by zero is not allowed.");
//         }

        
//         System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " 
//                            + addition + ", " + subtraction + ", " + multiplication + ", and "  + (number2 != 0 ? division : "undefined"));

        
//         input.close();
//     }
// }


// import java.util.*;

// public class Levelpractice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the base of the triangle (in inches): ");
//         double baseInches = input.nextDouble();

//         System.out.print("Enter the height of the triangle (in inches): ");
//         double heightInches = input.nextDouble();

       
//         double areaInSqInches = 0.5 * baseInches * heightInches;

        
//         double inchToCm = 2.54;

        
//         double areaInSqCm = areaInSqInches * inchToCm * inchToCm;

        
//         System.out.println("The area of the triangle is " + areaInSqInches + " square inches and " + areaInSqCm + " square centimeters.");

//         input.close();
//     }
// }


// import java.util.*;

// public class Levelpractice {
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

// public class Levelpractice {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the distance in feet: ");
//         double distanceInFeet = input.nextDouble();

        
//         double distanceInYards = distanceInFeet / 3;

        
//         double distanceInMiles = distanceInYards / 1760;

        
//         System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

//         input.close();
//     }
// }


// import java.util.*;

// public class Levelpractice {
//     public static void main(String[] args) {
        
//         Scanner input = new Scanner(System.in);

        
//         System.out.print("Enter the unit price of the item (INR): ");
//         double unitPrice = input.nextDouble();

        
//         System.out.print("Enter the quantity to be bought: ");
//         int quantity = input.nextInt();

       
//         double totalPrice = unitPrice * quantity;

        
//         System.out.println("The total purchase price is INR " + totalPrice +
//                            " if the quantity " + quantity +
//                            " and unit price is INR " + unitPrice);

//         input.close();
//     }
// }


