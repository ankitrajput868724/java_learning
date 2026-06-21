import java.util.Scanner;
public class Demmmmo {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int sp = n-1;
int st = 1;
for(int i=1  ; i<=n ; i++){
    for(int j=1 ; j<=sp ; j++){
        System.out.print("  ");
    }
    for(int j=1 ; j<=st ; j++){
        System.out.print("* ");
    }

}
System.out.println();
sp--;
st+=2;





// int n = sc.nextInt();
// int st = n*2-1; int sp=0;
// for(int i=1 ; i<=n; i++){
//     for(int j=1 ; j<=sp; j++){
//         System.out.print("  ");

        // System.out.print("* ");
        // if(i==j || j==1 || i==n){
            // System.out.print("* ");
        // }   else{System.out.print("  ");}
    }
// for(int j = st; j>=1 ; j--){
//     // System.out.print("* ");
//     if(j==1 || i==1 || j==st){System.out.print("* ");}
//     else{System.out.print("  ");}
//     // System.out.print("* ");

}


    // sp++;
    // st-=2;
    // System.out.println();
    //         }  
    //     }
    // }
