import java.util.Scanner;
class oooo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int sp = n-1;
        int st = 1;




        for(int i=1 ; i<=n ; i++){
            for(int j = 1 ; j<=sp ; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=st ; j++){
                System.out.print("* ");
            }
            sp--;
            st+=2;
            System.out.println();
        }
        for(int i=n-1 ; i>=1 ; i--){
            for(int j=1 ; j<=n-i ; j++){System.out.print("  ");}
        
            for(int j=1 ; j<=2*i-1 ; j++){System.out.print("* ");}
        System.out.println();
        }
    }
}