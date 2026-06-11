import java.util.*;
public class Lcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("ENTER TWO NUMBERS ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = a>b?a:b;
    int i = n;


while (true) { 
    if(n%a == n%b){
        System.out.println("LCM is "+n);
       break;
    }
    n++;



     
}    

    }
    
}