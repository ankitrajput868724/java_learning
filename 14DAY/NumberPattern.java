import java.util.*;
public class NumberPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    
    int n = sc.nextInt();
        int sp=n-1;
        int st = 1;
    for(int i=1 ; i<=n;i++){
    for(int j=1 ;j<=sp ; j++ ){System.out.print("  ");}
    for(int k=1; k<=st ; k++){System.out.print(k+" ");}
    
    sp--;
    st+=2;
    System.out.println();
    }
    
    }
    }