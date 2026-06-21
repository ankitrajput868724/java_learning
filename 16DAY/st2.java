import java.util.Scanner;
public class st2 {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);


    int a = sc.nextInt();


                        //Upper HALF
for(int i=1 ; i<=a ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print("* \t");
        }
        System.out.println();

}           //LOWER HALF

for(int i=a-1 ; i>=1 ; i--){
        for(int j=1 ; j<=i ; j++){
            System.out.print("* \t");
        }System.out.println();
}
    
}
}