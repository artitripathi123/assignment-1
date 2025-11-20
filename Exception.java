 // class InsufficientFundsException extends Exception {
//     public InsufficientFundsException(String message) {
//         super(message);
//     }
// }
// class ATM {
//     private int balance;

//     public ATM(int initialBalance) {
//         this.balance = initialBalance;
//     }

//     public void withdraw(int amount) throws InsufficientFundsException {
//         if (amount > balance) {
//             throw new InsufficientFundsException("Withdrawal failed: Insufficient funds. Available balance: ₹" + balance);
//         } else {
//             balance -= amount;
//             System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
//         }
//     }
// }
// public class main {
//     public static void main(String[] args) {
//         ATM myATM = new ATM(10000); // Initial balance ₹10,000

//         try {
//             myATM.withdraw(12000); // Attempt to withdraw ₹12,000
//         } catch (InsufficientFundsException e) {
//             System.out.println(e.getMessage());
//         }

//         try {
//             myATM.withdraw(5000); // Attempt to withdraw ₹5,000
//         } catch (InsufficientFundsException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }




//Student Grade Parser 
// import java.util.*;

// public class StudentGradeParser {
//     public static void main(String[] args) {
//         List<String> grades = Arrays.asList("90", "A+", "85", "B", "100");

//         for (String grade : grades) {
//             try {
//                 int numericGrade = Integer.parseInt(grade);
//                 System.out.println("Parsed grade: " + numericGrade);
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid grade input: " + grade);
//             }
//         }
//     }
// }






//Login system with custom exception
// import java.util.Scanner;

// public class LoginSystem {
//     private static final String VALID_USERNAME = "admin";
//     private static final String VALID_PASSWORD = "password123";

//     public static void validate(String user, String pass) throws InvalidCredentialsException {
//         if (!user.equals(VALID_USERNAME) || !pass.equals(VALID_PASSWORD)) {
//             throw new InvalidCredentialsException("Invalid username or password.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean loggedIn = false;

//         while (!loggedIn) {
//             System.out.print("Enter username: ");
//             String username = scanner.nextLine();

//             System.out.print("Enter password: ");
//             String password = scanner.nextLine();

//             try {
//                 validate(username, password);
//                 System.out.println("Login successful!");
//                 loggedIn = true;
//             } catch (InvalidCredentialsException e) {
//                 System.out.println(e.getMessage());
//                 System.out.println("Please try again.\n");
//             }
//         }

//         scanner.close();
//     }
// }





//E-commerce Order Processing
// import java.util.Random;

// class OrderProcessor {
//     public void placeOrder() throws OutOfStockException, PaymentFailedException {
//         Random rand = new Random();
//         int outcome = rand.nextInt(3); // 0, 1, or 2

//         switch (outcome) {
//             case 0:
//                 throw new OutOfStockException("Product is out of stock.");
//             case 1:
//                 throw new PaymentFailedException("Payment processing failed.");
//             default:
//                 System.out.println("Order placed successfully!");
//         }
//     }
// }public class Main {
//     public static void main(String[] args) {
//         OrderProcessor processor = new OrderProcessor();

//         try {
//             processor.placeOrder();
//         } catch (OutOfStockException e) {
//             System.out.println("Order Error: " + e.getMessage());
//         } catch (PaymentFailedException e) {
//             System.out.println("Order Error: " + e.getMessage());
//         }
//     }
// }




//Banking Transaction System
// import java.util.Random;

// class Transaction {
//     private int balance;

//     public Transaction(int balance) {
//         this.balance = balance;
//     }

//     public void processTransaction(int amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
//         Random rand = new Random();
//         int outcome = rand.nextInt(4); // 0 to 3

//         if (amount < 0) {
//             throw new NegativeAmountException("Transaction failed: Amount cannot be negative.");
//         } else if (amount > balance) {
//             throw new InsufficientFundsException("Transaction failed: Insufficient balance.");
//         } else if (outcome == 0) {
//             throw new NetworkFailureException("Transaction failed: Network error occurred.");
//         } else {
//             balance -= amount;
//             System.out.println("Transaction successful! Remaining balance: ₹" + balance);
//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Transaction txn = new Transaction(5000); // Initial balance

//         try {
//             txn.processTransaction(3000); // Try with a valid amount
//         } catch (NegativeAmountException e) {
//             System.out.println(e.getMessage());
//         } catch (InsufficientFundsException e) {
//             System.out.println(e.getMessage());
//         } catch (NetworkFailureException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

