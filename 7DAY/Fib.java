import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        
        int Sum=0;
System.out.println("Enter no. till print fabinacci series");
int c=sc.nextInt();

        System.out.print(a+" "+b+" ");
        for(int i=1; i<c;i++){
            Sum=a+b;
            System.out.print(Sum+" ");
            a=b;
            b=Sum;
        }



    }
    
}
