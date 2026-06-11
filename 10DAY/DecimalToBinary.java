import java.util.Scanner;
public class DecimalToBinary 
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
// String s = "";                                   IF WE HAVE TO STORE VALUE IN STRING VARIABLE
int s = 0;
int i=1;
        while(a>0)
            {
                int digit = a%2;
                s = digit*i+ s;
                
                // s = digit + s;                   IF WE HAVE TO STORE VALUE IN STRING VARIABLE
                a/=2;
                i*=10;
            }
System.out.println(s);
sc.close();
    }
}