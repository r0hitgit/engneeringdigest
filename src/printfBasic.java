public class printfBasic {
    public static void main(String[] args) {

        String name = "Rohit";
        int age = 21;
        double gpa = 8.7462;

        System.out.println("=== Java printf Basics ===");

        // 1. %s for String
        System.out.printf("Naam: %s%n", name);

        // 2. %d for Integer
        System.out.printf("Age: %d saal%n", age);

        // 3. %.2f -> Double/Float ko 2 decimal tak round-off karne ke liye
        System.out.printf("GPA: %.2f%n", gpa);

        // 4. Sabko ek sath ek hi line mein print karna
        System.out.printf("%s ki age %d saal hai aur GPA %.2f hai.%n", name, age, gpa);
    }
}
// %-15s -> String left-aligned with 15 spaces width
// %03d  -> Integer padded with leading zeros to make it 3 digits
// %n    -> New line character