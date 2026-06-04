import java.util.Scanner;

public class check_prime_ornot{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number : ");
        int num =in.nextInt();
        int is_prime=0;
    if (num>1){
        for(int n=2;n<num;n++){
         if(num%n==0){
            is_prime=1;
            break;
         }
         else{
            is_prime=0;
         }

        }
        if(is_prime==0){
            System.out.println(num+" is a prime number");}

     else{
        System.out.println(num+" is not a prime number");
     }
        }
    else if(num==0||num==1){
        System.out.println("Neither prime nor composite number");
    }
    else{
        System.out.println("Invalid number entered!!");
    }}

        


        
    }
