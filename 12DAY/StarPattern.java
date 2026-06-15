import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
System.out.println("Enter sequence till print :-- ");
        int a = sc.nextInt();
        

        for(int i=1 ; i<=a ; i++){
            for(int j=1 ; j<a ; j++){
        
                if(i==1 || j==1 || i==a/2+1 || i==a){
                System.out.print("* ");}
                else{System.out.print(" ");}
            }


            
            
            System.out.println();
        }
    }
    
}
