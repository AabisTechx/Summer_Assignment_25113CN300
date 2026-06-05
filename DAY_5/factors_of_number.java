import java.util.Scanner;

public class factors_of_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        System.out.println("Divisors of given number are: ");
        if(num>0){
        for(int n=1;n<=num;n++){
            if(num%n==0){
                System.out.println(n);}
        }
    }
        else if(num==0){
    System.out.println("0 has no divisor");}
else{
    System.out.println("Invalid number entered!!");
}
}}

