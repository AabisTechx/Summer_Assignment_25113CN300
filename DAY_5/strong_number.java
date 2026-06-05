import java.util.Scanner;

public class strong_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num =in.nextInt();
        int original=num;
        int sum =0;
        if (num>0){
        while(num!=0){
            int fact=1;
            int a=num%10;
            for(int n=1;n<=a;n++){
                fact*=n;
            }
            sum+=fact;
            num=num/10;
           
    }
    if(original==sum){
        System.out.println(original+" is a strong number");}
    else{
        System.out.println(original+" is not a strong number");
    }}
    else{
        System.out.println("Invalid Input Entered");
    }
}
}