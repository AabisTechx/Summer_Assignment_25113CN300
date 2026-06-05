import java.util.Scanner;

public class LargestPrimeNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 =in.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 =in.nextInt();
        if(n1>0&&n2>0&&n1<=n2){
            int largest_num=0;
            for(int num=n1;num<=n2;num++){
               boolean is_prime=true;
               if(num<2){
                is_prime=false;}
               else {
                for(int n=2;n<num;n++){
                    if(num%n==0){
                        is_prime=false;
                        break;
                    }
                }



               }
               if(is_prime){
                System.out.println(num);
                    largest_num = num;
               }
            }
            if (largest_num != 0) {
                System.out.println("Largest prime number = " + largest_num);
            } else {
                System.out.println("No prime numbers found in the range.");
            }

        }
        else{
            System.out.println("Invalid range entered!!");
        }
    }
}