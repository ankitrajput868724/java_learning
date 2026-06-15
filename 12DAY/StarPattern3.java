import java.util.Scanner;
public class StarPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
System.out.println("Enter the sequence : -  ");
        int a = sc.nextInt();

                for(int i=0 ; i<a ; i++){
                    for(int j=0 ; j<a ; j++){
                        if(i==2 || j==2 ){
                            System.out.print("*");
                        }  else{  System.out.println();  }
                    }
                }
    }
    
}
