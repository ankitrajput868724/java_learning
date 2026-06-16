import java.util.Scanner;
public class StarPattern14 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();

    if(r%2==0){
         for(int i=1 ; i<=r ; i++){
        for(int j=1 ; j<=r ; j++){
            if(i==r ||i==1 ||j==r/2|| i+j==6 ||i==j){
                System.out.print("*");
            }else{System.out.print(" ");}
        }
        System.out.println();
    }
    }
    if(r%2!=0){
         for(int i=1 ; i<=r ; i++){
        for(int j=1 ; j<=r ; j++){
            if(i==r ||i==1 ||j==r/2+1|| i+j==6 ||i==j){
                System.out.print("* ");
            }else{System.out.print("  ");}
        }
        System.out.println();
    }

    }
}
    
}
