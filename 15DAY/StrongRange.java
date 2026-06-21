import java.util.Scanner;
public class StrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end limit :) ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
for(int i=a ; i<=b ; i++){
    int c = StrongMethod.isStrong(i);

    if(i == c){
        System.out.print(i+" ");
    }

}

    }
    
}
