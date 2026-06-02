import java.util.Scanner;

public class multiplication_table_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num =in.nextInt();
        for(int n =1;n<=10;n++){
            int pro =num*n;
            System.out.println(num+" * "+n+" = "+pro);
        }


    }

    
}