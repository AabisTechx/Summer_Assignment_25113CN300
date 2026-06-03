import java.util.Scanner;

public class product_of_digits {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int original =num;
        int product=1;
        while(num!=0){
            int digit =num%10;
            product=product*digit;
             num=num/10;

        }
        System.out.println(product+" is the product of digits of number "+original);
    }
    
}
