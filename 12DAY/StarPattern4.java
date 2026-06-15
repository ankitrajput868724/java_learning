import java.util.Scanner;
public class StarPattern4 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sequence  :--- ");
    int a = sc.nextInt();

    for(int i=a ; i>0 ; i--){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }

    System.out.println();
}

}
}