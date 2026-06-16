import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        
    int a = sc.nextInt();
    int num = a;
    int count=0;
    while(a>0){
    count++;
        a/=10; 
    
    
    }
    int sum=0;
    a = num;
    while(a>0){
        int d =a%10;
        int product = 1;
        
            for(int i=1; i<=count ;i++)
                {
                    product *=d;
                }
                sum+=product;
                a/=10;
    }
    if(sum == num){
        System.out.println("Armstrong number :--  ");
    } else{
        System.out.println("Not Armstrong ");
    }


    
}
    
}