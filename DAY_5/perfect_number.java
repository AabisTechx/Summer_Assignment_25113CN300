import java.util.Scanner;

public class perfect_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int sum =0;
        if(num>0){
        for(int n=1;n<num;n++){
            if(num%n==0){
                sum+=n;
            }
            
        }
        if(sum==num){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }
    }
    else{
        System.out.println("Invalid number entered");
    }
}}
