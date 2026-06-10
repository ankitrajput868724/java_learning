import java.util.Scanner;
public class Automorphic {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
boolean b = true;
    int prod = a*a;

    while(a>0){
        if(a%10 != prod%10){
            b = false;
break;
        }
        a/=10;
        prod/=10;
    }
    if(b==true){ System.out.println("Automorphic :) "); }
    else{ System.out.println("not  :( "); }
}

}
