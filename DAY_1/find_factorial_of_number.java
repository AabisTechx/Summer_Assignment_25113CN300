import java.util.Scanner;

public class find_factorial_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int fact=1;
        for (int n=1;n<=num;n++){
            fact=fact*n;

        }
        System.out.println("The factorial of "+num+" is "+fact);

    }
}
