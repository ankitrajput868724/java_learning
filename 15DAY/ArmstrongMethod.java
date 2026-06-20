import java.util.Scanner;
public class ArmstrongMethod {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        System.out.println("Count of Values is :-)   "+cou(a));

        int numm = isarm(a);
        
        if(numm == a){
            System.out.println("it is a armstrong number :) ");

        }else System.out.println("Not a armstron nooo :( ");
    }




    public static int cou(int a){
        int count=0;

        while(a>0){
            count++;
            a/=10;
        }
        return count;
    }

    public static int isarm(int a){
int sum=0;
        while(a>0){
        int digit =a%10;
        int pro = 1;
    for(int i=1 ; i<=cou(a) ; i++){
        pro*=digit;
    }
    
    sum+=pro;
    a/=10;


        } 
        return sum;
    }
    
}