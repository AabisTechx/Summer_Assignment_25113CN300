import java.util.Scanner;

public class count_digits_in_a_number {
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.print("Enter digit : ");
    int num =in.nextInt();
    System.out.print("Enter number whose occurence is to be counted :");
    int n =in.nextInt();
    int count1=0;
    int count2=0;
    while(num!=0){
        int rem =num%10;
        if(rem==n){
            count1++;

        }
        if(rem!=0){
            count2++;
        }
        num =num/10;
    }
    System.out.println("the no of digits in the entered digit are "+ count2);
    System.out.println("the no of "+n+"'s in the particular digit are "+ count1);

    


}
    
}