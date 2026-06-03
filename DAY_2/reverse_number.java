import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int original =num;
        int rev =0;
        while(num!=0){
            int a =num%10;
            rev =rev*10+a;
            num=num/10;
        }
        System.out.println("The reverse of "+original+" is "+rev);
    }
    
}
