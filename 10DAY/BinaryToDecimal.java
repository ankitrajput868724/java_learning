import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
System.out.println("Enter A Binary Number :-- ");
        int a =s.nextInt();
int sum = 0;
int product = 1;
int i=1;
        while(a>0){
            int digit = a%10;
            product = digit *i;
            sum+=product;
a/=10;
i*=2;
        }
System.out.println(sum);        
    }
    
}
