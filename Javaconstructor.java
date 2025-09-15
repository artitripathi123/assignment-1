 // public class Javaconstructor {
//     class Product {
//     private String productName;
//     private double price;
//     static int totalProducts = 0;

//     public Product(String productName, double price) {
//         this.productName = productName;
//         this.price = price;
//         totalProducts++; 
//     }


//     public void displayProductDetails() {
//         System.out.println("Product Name: " + productName);
//         System.out.println("Price: ₹" + price);
//     }


//     public static void displayTotalProducts() {
//         System.out.println("Total Products Created: " + totalProducts);
//     }
// }




// public class Javaconstructor {
//     public static void main(String[] args) {
//         Product p1 = new Product("Smartphone", 25000.0);
//         Product p2 = new Product("Bluetooth Speaker", 3500.0);

//         p1.displayProductDetails();
//         p2.displayProductDetails();
//         Product.displayTotalProducts();
//     }
// }
    
// }

//     private String courseName;
//     private int duration; 
//     private double fee;
//     static String instituteName = "SkillForge Academy";


//     public Course(String courseName, int duration, double fee) {
//         this.courseName = courseName;
//         this.duration = duration;
//         this.fee = fee;
//     }
//     public void displayCourseDetails() {
//         System.out.println("Institute: " + instituteName);
//         System.out.println("Course Name: " + courseName);
//         System.out.println("Duration: " + duration + " months");
//         System.out.println("Fee: ₹" + fee);
//     }


//     public static void updateInstituteName(String newName) {
//         instituteName = newName;
//         System.out.println("Institute name updated to: " + instituteName);
//     }
// }





// public class Javaconstructor {
//     public static void main(String[] args) {
//         Course c1 = new Course("Java Programming", 3, 12000.0);
//         Course c2 = new Course("Web Security", 2, 10000.0);


//         c1.displayCourseDetails();
//         c2.displayCourseDetails();


//         Course.updateInstituteName("CodeVerse Institute");
//         c1.displayCourseDetails();
//         c2.displayCourseDetails();
//     }
// }





//  public class Javaconstructor {

//     private String ownerName;
//     private String vehicleType;

//     static double registrationFee = 5000.0;
//     public Vehicle(String ownerName, String vehicleType) {
//         this.ownerName = ownerName;
//         this.vehicleType = vehicleType;
//     }

//     public void displayVehicleDetails() {
//         System.out.println("Owner Name: " + ownerName);
//         System.out.println("Vehicle Type: " + vehicleType);
//         System.out.println("Registration Fee: ₹" + registrationFee);
//     }

//     public static void updateRegistrationFee(double newFee) {
//         registrationFee = newFee;
//         System.out.println("Registration fee updated to ₹" + registrationFee);
//     }
// }



// public class Javaconstructor {
//     public static void main(String[] args) {
//         Vehicle v1 = new Vehicle("Ananya", "Car");
//         Vehicle v2 = new Vehicle("Ravi", "Bike");

//         v1.displayVehicleDetails();
//         v2.displayVehicleDetails();

//         Vehicle.updateRegistrationFee(6000.0);


//         v1.displayVehicleDetails();
//         v2.displayVehicleDetails();
//     }
// }




//  public class Javaconstructor {
//     public int rollNumber;         
//     protected String name;         
//     private double CGPA;          

//     public Student(int rollNumber, String name, double CGPA) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//         this.CGPA = CGPA;
//     }


//     public double getCGPA() {
//         return CGPA;
//     }

//     public void setCGPA(double newCGPA) {
//         if (newCGPA >= 0.0 && newCGPA <= 10.0) {
//             this.CGPA = newCGPA;
//         } else {
//             System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
//         }
//     }

//     // Method to display student details
//     public void displayDetails() {
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Name: " + name);
//         System.out.println("CGPA: " + CGPA);
//     }
// }



// public class Javaconstructor {
//     public String ISBN;        
//     protected String title;    
//     private String author;     

//     public Book(String ISBN, String title, String author) {
//         this.ISBN = ISBN;
//         this.title = title;
//         this.author = author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     // Public method to get author name
//     public String getAuthor() {
//         return author;
//     }

//     public void displayBookDetails() {
//         System.out.println("ISBN: " + ISBN);
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//     }
// }



//  public class Javaconstructor {
//     public int accountNumber;        
//     protected String accountHolder;  
//     private double balance;          

//     public BankAccount(int accountNumber, String accountHolder, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     public double getBalance() {
//         return balance;
//     }


//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("₹" + amount + " deposited. New balance: ₹" + balance);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("₹" + amount + " withdrawn. New balance: ₹" + balance);
//         } else {
//             System.out.println("Insufficient balance or invalid amount.");
//         }
//     }

//     public void displayAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolder);
//         System.out.println("Balance: ₹" + balance);
//     }
// }



