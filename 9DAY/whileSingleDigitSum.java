import java.util.Scanner;

public class whileSingleDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
int sum=0;
        while(a>9){
            while(a>0){
                sum+= a%10;
                a/=10;
            }
            a=sum;
            sum=0;
            
        }
    System.out.println(a);


    }
    
}