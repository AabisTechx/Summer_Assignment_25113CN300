import java.util.Scanner;

public class check_armstrong_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=in.nextInt();//inputting number to be checked
        System.out.print("No. of digits in the given number: ");
        int n=in.nextInt();
        int original =num;
        int rev=0;//for calculating sum of power of individual digits raised to the no of digits.
        if(num>0){
        while(num!=0){
            int a=num%10;
            int b=Math.powExact(a, n);//storing power(raised to no of digit) of individual digit of num. 
            rev=rev+b;
            num=num/10;

        }
        if (rev==original){
            System.out.println(original+" is an armstrong number");
        }
        else{
            System.out.println(original+" is not an armstrong number");
        }
    }
}}
