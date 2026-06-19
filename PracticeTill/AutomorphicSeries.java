import java.util.Scanner;
public class AutomorphicSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int sq = a*a;
        while(a>0){
            if(a%10 != sq%10){
                System.out.println("Not Automorphic ");

        }

    }
    
}}