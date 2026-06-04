import java.util.Scanner;

public class LCM_of_two_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1=in.nextInt();
        System.out.print("Enter number 2: ");
        int n2= in.nextInt();
        int a=n1;
        int b=n2;
        if (n1>0&&n2>0){
               while(n2!=0){
               int temp=n2;
                n2=n1%n2;
                n1=temp;
            
            }//Euclidean Theorem
            int gcd=n1;
            
            int lcm=(a*b)/(gcd);
            System.out.println(lcm+" is the L.C.M of given numbers");
        }
        else{
            System.out.println("Invalid numbers");
        }

    }
    
}
