import java.util.Scanner;

public class fibonacci_series{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series is:-");
        for(int n=1;n<=num;n++){
            System.out.println(a);
           int c=a+b;
            a=b;
            b=c;

        }
        
}}