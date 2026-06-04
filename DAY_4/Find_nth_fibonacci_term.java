import java.util.Scanner;

public class Find_nth_fibonacci_term {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int a=0;
        int b=1;
        int nth_term=0;
        System.out.println("Fibonacci series is:-");
        for(int n=1;n<=num;n++){
           nth_term=a;
           int c=a+b;
            a=b;
            b=c;

        }
        System.out.println("The nth term fibonacci series is: "+nth_term);
        
}
        
    }
    
