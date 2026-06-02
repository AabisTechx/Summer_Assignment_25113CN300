import java.util.Scanner;

public class Sum_of_n_natural_numbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int sum =0;
        for(int n=1;n<=num;n++){
            sum+=n;
        }
        System.out.println("The sum of first3 "+num+" numbers is "+sum);
    }

    
}