  // public abstract class Encapsulation {
//     private int employeeId;
//     private String name;
//     private double baseSalary;

//     public polymorphism(int employeeId, String name, double baseSalary) {
//         this.employeeId = employeeId;
//         this.name = name;
//         this.baseSalary = baseSalary;
//     }

//     // Encapsulation: Getters and Setters
//     public int getEmployeeId() { return employeeId; }
//     public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }

//     public double getBaseSalary() { return baseSalary; }
//     public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

//     // Abstract method
//     public abstract double calculateSalary();

//     // Concrete method
//     public void displayDetails() {
//         System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
//     }
// }




// public abstract class Encapsulation {
//     private int productId;
//     private String name;
//     private double price;

//     public polymorphism(int productId, String name, double price) {
//         this.productId = productId;
//         this.name = name;
//         this.price = price;
//     }

//     // Encapsulation: Getters and Setters
//     public int getProductId() { return productId; }
//     public void setProductId(int productId) { this.productId = productId; }

//     public String getName() { return name; }
//     public void setName(String name) { this.name = name; }

//     public double getPrice() { return price; }
//     public void setPrice(double price) { this.price = price; }

//     // Abstract method
//     public abstract double calculateDiscount();
// }




// public abstract class Encapsulation {
//     private String vehicleNumber;
//     private String type;
//     private double rentalRate;

//     public polymorphism(String vehicleNumber, String type, double rentalRate) {
//         this.vehicleNumber = vehicleNumber;
//         this.type = type;
//         this.rentalRate = rentalRate;
//     }

//     public String getVehicleNumber() { return vehicleNumber; }
//     public String getType() { return type; }
//     public double getRentalRate() { return rentalRate; }

//     public abstract double calculateRentalCost(int days);
// }

// interface Insurable {
//     double calculateInsurance();
//     String getInsuranceDetails();
// }


// public abstract class Encapsulation{
//     private String accountNumber;
//     private String holderName;
//     private double balance;

//     public polymorphism(String accountNumber, String holderName, double balance) {
//         this.accountNumber = accountNumber;
//         this.holderName = holderName;
//         this.balance = balance;
//     }

//     // Encapsulation: Getters and Setters
//     public String getAccountNumber() { return accountNumber; }
//     public String getHolderName() { return holderName; }
//     public double getBalance() { return balance; }

//     public void deposit(double amount) {
//         if (amount > 0) balance += amount;
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) balance -= amount;
//     }

//     public abstract double calculateInterest();
// }




// public abstract class Encapsulation {
//     private String itemId;
//     private String title;
//     private String author;

//     public polymorphism(String itemId, String title, String author) {
//         this.itemId = itemId;
//         this.title = title;
//         this.author = author;
//     }

//     // Encapsulation: Getters
//     public String getItemId() { return itemId; }
//     public String getTitle() { return title; }
//     public String getAuthor() { return author; }

//     // Concrete method
//     public void getItemDetails() {
//         System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
//     }

//     // Abstract method
//     public abstract int getLoanDuration();
// }




// public abstract class Encapsulation {
//     private String itemName;
//     private double price;
//     private int quantity;

//     public polymorphism(String itemName, double price, int quantity) {
//         this.itemName = itemName;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     // Encapsulation: Getters only
//     public String getItemName() { return itemName; }
//     public double getPrice() { return price; }
//     public int getQuantity() { return quantity; }

//     // Concrete method
//     public void getItemDetails() {
//         System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Quantity: " + quantity);
//     }

//     // Abstract method
//     public abstract double calculateTotalPrice();
// }


// public abstract class Encapsulation {
//     private String patientId;
//     private String name;
//     private int age;

//     public polymorphism(String patientId, String name, int age) {
//         this.patientId = patientId;
//         this.name = name;
//         this.age = age;
//     }

//     // Encapsulation: Getters
//     public String getPatientId() { return patientId; }
//     public String getName() { return name; }
//     public int getAge() { return age; }

//     // Concrete method
//     public void getPatientDetails() {
//         System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
//     }

//     // Abstract method
//     public abstract double calculateBill();
// }