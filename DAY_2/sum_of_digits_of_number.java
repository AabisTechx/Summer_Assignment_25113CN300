import java.util.Scanner;

public class sum_of_digits_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int original = num;
        int sum=0;
        while(num!=0){
            int a =num%10;
            sum=sum+a;
            num=num/10;

        }
        System.out.println("The sum of digits of "+original+" is "+sum);
    }
    
}
