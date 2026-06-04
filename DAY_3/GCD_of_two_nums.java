import java.util.Scanner;

public class GCD_of_two_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int n1=in.nextInt();
        System.out.print("Enter number two: ");
        int n2=in.nextInt();
        if(n1>0&&n2>0){
            if (n1>n2){
                int gcd1=1;
                for (int n=1;n<=n2;n++){
                    if(n1%n==0&&n2%n==0){
                         gcd1=n;
                    }
                }
                System.out.println(gcd1+" is the greatest common divisor of given numbers");
            }
            else if(n1==n2){
                System.out.println(n1+" is the greatest common divisor");
            }
            else{
                int gcd2=1;
                for(int n=1;n<=n1;n++){
                    if(n1%n==0&&n2%n==0){
                        gcd2=n;
                    }
                }
                System.out.println(gcd2+" is the greatest common divisor");
            }

                }
    else{
        System.out.println("Invalid numbers entered!!");
    }
        
    
    }
    
}
