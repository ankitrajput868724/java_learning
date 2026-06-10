import java.util.Scanner;
public class whileloopAddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int count=0;

        while(a>0){
            sum+= a%10;
            count++;
            a/=10;
            
        }
        System.out.println(sum);
        System.out.println(count);



    }
}
