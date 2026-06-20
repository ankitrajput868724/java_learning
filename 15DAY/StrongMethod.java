import java.util.Scanner;
public class StrongMethod {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a  number");
int a = sc.nextInt();

int result =isStrong(a);
System.out.println("The result is :)  "+result);
            if(result == a){
                System.out.println(a + "  is a Strong number :) ");
            }else{
                System.out.println(a+" is NOT STRONG NUMBER");
            }
            sc.close();
    }
    static int isStrong(int a ){
        int sum = 0;
        while(a>0){
            int digit = a%10;

            int fact = 1;
        for(int i=1 ; i<=digit ; i++){
            fact*=i;
        }    sum+=fact;
        a/=10;
        }

        
        return sum;
    }


    
}
