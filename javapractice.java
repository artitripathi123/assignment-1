//  *  Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
// Hint => 
// Simple Interest = Principal * Rate * Time / 100
// Take user input for principal, rate, time
// Write a method to calculate the simple interest given principle, rate and time as parameters
// Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___” 
// */
// import java.util.*;

// public class javapractice {
//     public static int calculateSimpleInterest(int P,int R,int T){
//         int SimpleInterest=(P*R*T)/100;
//         return SimpleInterest;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int P=sc.nextInt();
//         int R=sc.nextInt();
//         int T=sc.nextInt();

//         int SimpleInterest=calculateSimpleInterest(P, R, T);
//         System.out.println(SimpleInterest);
        
//     }
    
// }


/*Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/
// import java.util.*;
// public class javapractice {

//     public static int  calculateMaxNumber(int n){
//         int MaxNumber=(n*(n-1))/2;
//         return MaxNumber;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         int MaxNumber=calculateMaxNumber(n);
//         System.out.println(MaxNumber);
//     }
// }


/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
 */
// import java.util.*;
// public class javapractice {
//     public static int calculateRounds(int a,int b,int c){
//         int Rounds=(a+b+c);
//     return Rounds ;
//     }
    

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         int Rounds=calculateRounds(a, b, c);
//         System.out.println(Rounds);
//     }
// }


/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
 */
// import java.util.*;
// public class javapractice{
//     public static int checkNumber(int n){
//         if(n>0){
//             return 1;
//         }
//         else if(n<0){
//             return -1;
//         }
//         else{
//             return 0;
//         }
        
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
//             int result=checkNumber(n);
//             System.out.println(result);

        
//     }
// }


/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false */
// import java.util.*;
// public class javapractice {
//      public static boolean isSpringSeason(int day,int month){
//         switch (month){

//             case 3:
//             return (day >=20 && day<=31);
//         case 4:
//         case 5:
//         return (day >=1 && day <=31);
//         case 6:
//         return(day >=1 && day <=20);
//         default:
//         return false;
//         }
//        }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         int day=sc.nextInt();
//         if(isSpringSeason(day, month)){
//             System.out.println("it's a spring season");

//             }
//             else{
//                 System.out.println("not a spring season");
//             }
//         }
//     }


/*Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop  */
// import java.util.*;
// public class javapractice {
//     public static int sum(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum+=i;
//         }
//         return sum;
//     }


//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         if(n<=0){
//             System.out.println("please enter a positive number");
//         }
//         else{
//             int result=sum(n);
//             System.out.println("Sum of first "+n+"natural numbers is: "+result);
//         }


        
//     }
// }

/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers*/

// import java.util.*;
// public class javapractice{
//     public static int[] findSmallestAndLargest(int a,int b,int c){
//         int smallest=a;
//         int largest=b;
//         if(b<smallest)
//         smallest=b;
//         if(c<smallest)
//         smallest=c;
//         if(b>largest)
//         largest=b;
//         if(c>largest)
//         largest=c;
//         return new int[]{smallest,largest};
        
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             int c=sc.nextInt();
//             int[] result=findSmallestAndLargest(a, b, c);
//             System.out.println("Smallest=" + result[0]);
//             System.out.println("Largest="+ result[1]);
//         }
// }



/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number*/
// import java.util.*; 
// public class javapractice{

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        
//     }
// }