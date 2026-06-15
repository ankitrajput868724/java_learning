import java.util.Scanner;
public class StarPattern6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int st = 2*n-1;
int sp=0;

for(int i=1 ; i<=n ; i++){
    for(int j=1 ; j<=sp ; j++){System.out.print("  ");}
        for(int k=1 ; k<=st ; k++){
            System.out.print("* ");
    }
    System.out.println();
    st-=2;
    sp++;

}

    }
    
}
