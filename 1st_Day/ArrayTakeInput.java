import java.util.Scanner;

public class ArrayTakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<=n-1 ; i++){
            System.out.print("Enter the value of " + i + " index :- ");
            arr[i] = sc.nextInt();
        }
        for(int j=0 ; j<=n-1;j++){
            System.out.println(arr[j]);
        }
    }
}
