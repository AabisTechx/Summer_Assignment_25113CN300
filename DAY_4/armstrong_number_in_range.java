import java.util.Scanner;

public class armstrong_number_in_range {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter beginning number: ");
        int n1 = in.nextInt();

        System.out.print("Enter ending number: ");
        int n2 = in.nextInt();

        if (n1 > 0 && n2 > 0 && n1 <= n2) {

            System.out.println("Armstrong numbers are:");

            for (int n = n1; n <= n2; n++) {

                int actual = n;
                int temp = n;
                int count = 0;
                int sum = 0;

                // Count digits
                while (temp != 0) {
                    count++;
                    temp /= 10;
                }

                temp = n;

                // Calculate sum of digits raised to count
                while (temp != 0) {
                    int digit = temp % 10;
                    sum =sum+ Math.powExact(digit, count);
                    temp /= 10;
                }

                if (sum == actual) {
                    System.out.println(actual);
                }
            }

        } else {
            System.out.println("Invalid input.");
        }
    }
}