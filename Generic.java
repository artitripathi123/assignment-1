 //Ques1.
 // Generic Box class
// class Box<T> {
//     private T value;

//     public void set(T value) {
//         this.value = value;
//     }

//     public T get() {
//         return value;
//     }
// }

// // Test class
// public class BoxTest {
//     public static void main(String[] args) {
//
//         Box<Integer> intBox = new Box<>();
//         intBox.set(42);
//         System.out.println("Integer value: " + intBox.get());

//         
//         Box<String> strBox = new Box<>();
//         strBox.set("Hello, Generics!");
//         System.out.println("String value: " + strBox.get());

//         
//         Box<Double> dblBox = new Box<>();
//         dblBox.set(3.14159);
//         System.out.println("Double value: " + dblBox.get());
//     }
// }


//Ques2.
// Generic Pair class
// class Pair<T, U> {
//     private T first;
//     private U second;

//     public Pair(T first, U second) {
//         this.first = first;
//         this.second = second;
//     }

//     public T getFirst() {
//         return first;
//     }

//     public U getSecond() {
//         return second;
//     }
// }

// 
// public class PairTest {
//     public static void main(String[] args) {

//         Pair<String, Integer> student = new Pair<>("Amol", 20);
//         System.out.println("Name: " + student.getFirst());
//         System.out.println("Age: " + student.getSecond());


//         Pair<Double, Boolean> sensor = new Pair<>(98.6, true);
//         System.out.println("Temperature: " + sensor.getFirst());
//         System.out.println("Status: " + sensor.getSecond());
//     }
// }



//ques3.
// public class GenericUtils {
//     public static <T> boolean isEqual(T a, T b) {
//         if (a == null) {
//             return b == null; // both null means equal
//         }
//         return a.equals(b);
//     }


//     public static void main(String[] args) {
//         System.out.println(isEqual(10, 10));               // true
//         System.out.println(isEqual("hello", "hello"));     // true
//         System.out.println(isEqual(3.14, 2.71));           // false
//         System.out.println(isEqual(null, null));           // true
//         System.out.println(isEqual("test", null));         // false
//     }
// }


// public class GenericMax {
//     public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
//         T max = x; // assume x is the largest
//         if (y.compareTo(max) > 0) {
//             max = y;
//         }
//         if (z.compareTo(max) > 0) {
//             max = z;
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         System.out.println("Max of 3, 7, 5: " + maximum(3, 7, 5));               // Integer
//         System.out.println("Max of apple, banana, cherry: " + maximum("apple", "banana", "cherry")); // String
//         System.out.println("Max of 2.5, 3.7, 1.8: " + maximum(2.5, 3.7, 1.8));   // Double
//     }
// }




//Ques4.
// Base class
// class Fruit {
//     public String toString() {
//         return "Generic Fruit";
//     }
// }

// class Apple extends Fruit {
//     public String toString() {
//         return "Apple";
//     }
// }


// class Mango extends Fruit {
//     public String toString() {
//         return "Mango";
//     }
// }


// class Car {
//     public String toString() {
//         return "Car";
//     }
// }

//Ques5.
// import java.util.*;

// public class NumberUtils {
    // Generic method to sum numbers
    // public static double sumNumbers(List<? extends Number> list) {
    //     double sum = 0.0;
    //     for (Number num : list) {
    //         sum += num.doubleValue(); // ensures compatibility across Number types
    //     }
    //     return sum;
    // }

    // Test the method
//     public static void main(String[] args) {
//         List<Integer> intList = Arrays.asList(10, 20, 30);
//         List<Double> dblList = Arrays.asList(2.5, 3.5, 4.0);

//         System.out.println("Sum of Integers: " + sumNumbers(intList)); // Output: 60.0
//         System.out.println("Sum of Doubles: " + sumNumbers(dblList));  // Output: 10.0
//     }
// }


//Ques6.
// import java.util.*;

// public class ListCopier {
//     // Generic method to copy numbers from src to dest
//     public static void copyList(List<? super Number> dest, List<? extends Number> src) {
//         for (Number num : src) {
//             dest.add(num);
//         }
//     }

//     // Test the method
//     public static void main(String[] args) {
//         List<Integer> intList = Arrays.asList(1, 2, 3);
//         List<Number> numberList = new ArrayList<>();

//         copyList(numberList, intList); // Copying Integer list into Number list
//         System.out.println("After copying Integers: " + numberList);

//         List<Double> dblList = Arrays.asList(4.5, 5.5);
//         copyList(numberList, dblList); // Copying Double list into Number list
//         System.out.println("After copying Doubles: " + numberList);
//     }
// }



//Ques7.
// import java.util.*;


// class Animal {
//     public String toString() {
//         return "Generic Animal";
//     }
// }


// class Dog extends Animal {
//     public String toString() {
//         return "Dog";
//     }
// }


// class Cat extends Animal {
//     public String toString() {
//         return "Cat";
//     }
// }

// public class AnimalPrinter {

//     public static void printAnimals(List<? extends Animal> animals) {
//         for (Animal animal : animals) {
//             System.out.println(animal);
//         }
//     }

//     public static void main(String[] args) {
//         List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
//         List<Cat> cats = Arrays.asList(new Cat(), new Cat());

//         System.out.println("Printing Dogs:");
//         printAnimals(dogs); // Works with List<Dog>

//         System.out.println("Printing Cats:");
//         printAnimals(cats); // Works with List<Cat>
//     }
// }