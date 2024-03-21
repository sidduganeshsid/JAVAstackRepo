import java.util.Scanner;

public class SumAnyNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to add (enter 0 to finish):");
            System.out.print("Enter a number: ");
        while (true) {
            System.out.print("+");
            int number = scanner.nextInt();

            if (number == 0 ) {
                break;  // Exit the loop if the user enters 0
            }

            sum += number;
        }

        System.out.println("Sum of entered numbers: " + sum);
        scanner.close();
    }
}