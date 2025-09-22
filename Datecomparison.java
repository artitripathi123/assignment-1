  // import java.time.ZoneId;
// import java.time.ZonedDateTime;
// import java.time.format.DateTimeFormatter;

// public class Datecomparison {
//     public static void main(String[] args) {
        
//         ZoneId gmtZone = ZoneId.of("GMT");
//         ZoneId istZone = ZoneId.of("Asia/Kolkata");
//         ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        
//         ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
//         ZonedDateTime istTime = ZonedDateTime.now(istZone);
//         ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

//         System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
//         System.out.println("Current Time in IST: " + istTime.format(formatter));
//         System.out.println("Current Time in PST: " + pstTime.format(formatter));
//     }
// }





// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class Datecomparison {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

//         System.out.print("Enter a date (yyyy-MM-dd): ");
//         String input = scanner.nextLine();

        
//         LocalDate date = LocalDate.parse(input, formatter);

//      }}





// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// public class Datecomparison {
//     public static void main(String[] args) {
        
//         LocalDate currentDate = LocalDate.now();
//         DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//         DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//         DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        
//         System.out.println("Current Date in dd/MM/yyyy format       : " + currentDate.format(format1));
//         System.out.println("Current Date in yyyy-MM-dd format       : " + currentDate.format(format2));
//         System.out.println("Current Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
//     }
// }





// import java.time.LocalDate;
// import java.util.Scanner;

// public class DateComparison {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter first date (yyyy-mm-dd): ");
//         String date1Input = sc.nextLine();
//         LocalDate date1 = LocalDate.parse(date1Input);

        
//         System.out.print("Enter second date (yyyy-mm-dd): ");
//         String date2Input = sc.nextLine();
//         LocalDate date2 = LocalDate.parse(date2Input);

        
//         if (date1.isBefore(date2)) {
//             System.out.println("First date is before the second date.");
//         } else if (date1.isAfter(date2)) {
//             System.out.println("First date is after the second date.");
//         } else if (date1.isEqual(date2)) {
//             System.out.println("Both dates are the same.");
//         }

//         sc.close();
//     }
// }
