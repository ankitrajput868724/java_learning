import java.util.Scanner;
public class ddddeeemmoo {
public static void main(String[] args) {
    


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int sp = n-1;
int st = 1;


                                        //UPPER HALF
for(int i=1  ; i<=n ; i++){
    for(int j=1 ; j<=sp ; j++){
        System.out.print("  ");
    }
    for(int j=1 ; j<=st ; j++){
        System.out.print("* ");
    }
    // for(int j=n*2-3 ;j>=1 ; j-- ){System.out.print("* ");}
//  System.out.println();
// sp--;
// st+=2;


// int ssp = 1;
// int sst = n*2-3;


    sp--;  st+=2;
    System.out.println();

            
}
                            //LOWER HALF
for(int i=n-1 ; i>=1 ; i--){
    for(int j=1 ; j<=n-i ; j++){System.out.print("  ");}

    for(int j=1 ; j<=2*i-1 ; j++){System.out.print("* ");}

    System.out.println();
}


}
}