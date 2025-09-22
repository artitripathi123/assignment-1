


// class Functionproblem {
//     private String title;
//     private String author;
//     public Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }
//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }
//     public void displayBook() {
//         System.out.println("Title: " + title + ", Author: " + author);
//     }
// }





// class Functionproblem {
//     private String name;
//     private ArrayList<Book> books;  
//     public Library(String name) {
//         this.name = name;
//         this.books = new ArrayList<>();
//     }

//     public void addBook(Book book) {
//         books.add(book);
//     }
//     public void displayLibraryBooks() {
//         System.out.println("\nLibrary: " + name);
//         for (Book b : books) {
//             b.displayBook();
//         }
//     }
// }






// public class Funtionproblem {
//     public static void main(String[] args) {
        
//         Book book1 = new Book("The Alchemist", "Paulo Coelho");
//         Book book2 = new Book("1984", "George Orwell");
//         Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");
//         Library library1 = new Library("City Library");
//         Library library2 = new Library("University Library");

//         library1.addBook(book1);
//         library1.addBook(book2);

//         library2.addBook(book2);  
//         library2.addBook(book3);

//         library1.displayLibraryBooks();
//         library2.displayLibraryBooks();
//     }
// }






// import java.util.ArrayList;

// class Functionproblem {
//     private int accountNumber;
//     private double balance;

//     public Account(int accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }

//     public int getAccountNumber() {
//         return accountNumber;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         balance += amount;
//         System.out.println("Deposited: " + amount + " | New Balance: " + balance);
//     }

//     public void withdraw(double amount) {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
//         } else {
//             System.out.println("Insufficient balance!");
//         }
//     }
// }





// class Functionproblem {
//     private String name;
//     private ArrayList<Account> accounts;

//     public Customer(String name) {
//         this.name = name;
//         this.accounts = new ArrayList<>();
//     }

//     public String getName() {
//         return name;
//     }

//     public void addAccount(Account account) {
//         accounts.add(account);
//     }

//     public void viewBalance() {
//         System.out.println("\nCustomer: " + name);
//         for (Account acc : accounts) {
//             System.out.println("Account No: " + acc.getAccountNumber() + " | Balance: " + acc.getBalance());
//         }
//     }
// }





// class Functionproblem {
//     private String bankName;
//     private ArrayList<Customer> customers;

//     public Bank(String bankName) {
//         this.bankName = bankName;
//         this.customers = new ArrayList<>();
//     }
//     public void addCu





// import java.util.ArrayList;
// class Functionproblem {
//     private String name;

//     public Employee(String name) {
//         this.name = name;
//     }

//     public void showEmployee() {
//         System.out.println("   Employee: " + name);
//     }
// }





// class Functionproblem {
//     private String deptName;
//     private ArrayList<Employee> employees;

//     public Department(String deptName) {
//         this.deptName = deptName;
//         this.employees = new ArrayList<>();
//     }

//     public void addEmployee(String empName) {
//         employees.add(new Employee(empName));
//     }

//     public void showDepartment() {
//         System.out.println(" Department: " + deptName);
//         for (Employee e : employees) {
//             e.showEmployee();
//         }
//     }
// }





// class Functionprpoblem {
//     private String companyName;
//     private ArrayList<Department> departments;

//     public Company(String companyName) {
//         this.companyName = companyName;
//         this.departments = new ArrayList<>();
//     }

//     public void addDepartment(Department dept) {
//         departments.add(dept);
//     }

//     public void showCompany() {
//         System.out.println("Company: " + companyName);
//         for (Department d : departments) {
//             d.showDepartment();
//         }
//     }

//     public void closeCompany() {
//         System.out.println("\nClosing company: " + companyName);
//         departments.clear(); 
//     }
// }


// public class CompositionExample {
//     public static void main(String[] args) {
        
//         Company company = new Company("TechSoft Pvt Ltd");

        
//         Department hr = new Department("Human Resources");
//         Department it = new Department("IT");
//         hr.addEmployee("Alice");
//         hr.addEmployee("Bob");

//         it.addEmployee("Charlie");
//         it.addEmployee("David");

        
//         company.addDepartment(hr);
//         company.addDepartment(it);

        

