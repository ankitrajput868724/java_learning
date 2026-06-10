import java.util.Scanner;

public class PerfectNo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :) ");
        int a = sc.nextInt();

        System.out.println("the divisior is/are :) ");

        
            int sum = 0;
            for(int i=1;i<=a/2 ; i++){
            
                if(a%i == 0){
                sum+=i;
            
            System.out.println(i);
                }
                
            
            }
            System.out.println("the sum of divisior is "+sum);
            
        

    }
    
}
