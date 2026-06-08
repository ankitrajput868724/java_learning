import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=121;
        int rev=0;
        int temp=a;

        while(a>0){
            int lastnum = a%10;
            rev = rev*10 + lastnum;
        a = a/10;            
        }
        System.out.println("Origional number is :- "+temp);
        System.out.println("reversed no is "+rev);

        if(temp == rev){
            System.out.println("Palindrome");

        }else{
            System.out.println("not");
        }

        

    }
    
}
