import java.util.Scanner;

public class print_prime_nums_in_range {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int n1=in.nextInt();
        System.out.print("Enter ending number: ");
        int n2=in.nextInt();
        if(n1>0&&n2>0&&n1<n2){
            System.out.println("Prime numbers in given range are:-");
            for(int n=n1;n<=n2;n++){
                if(n<2){
                    continue;
                }
                 boolean is_prime=true;
                
                for(int num=2;num<n;num++){
                  
                    
                    if(n%num==0){
                        is_prime=false;
                        break;
                    }
                }
                    
                if(is_prime){
                        System.out.println(n);
                    }


                   


                }
            }
        else{
            System.out.println("Invalid range!!");
        }
        }}
    
    

