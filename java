import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {   // 👈 File must be named SumOfIntegers.java
    public static void main(String[] args) {   // 👈 Main method signature
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'stop' to finish):");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;  // exit loop when user types stop
            }

            try {
                // Parsing String to int using Integer.parseInt()
                int num = Integer.parseInt(input);

                // Autoboxing: int → Integer (automatically added to ArrayList)
                numbers.add(num);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or 'stop'.");
            }
        }

        // Calculate sum using unboxing
        int sum = 0;
        for (Integer n : numbers) {
            // Unboxing: Integer → int
            sum += n;
        }

        System.out.println("Numbers entered: " + numbers);
        System.out.println("Sum of integers = " + sum);

        sc.close();
    }
}
