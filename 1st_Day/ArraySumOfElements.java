import java.util.Scanner;

public class ArraySumOfElements {
    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
     
        for(int i = 0;i<=n-1;i++){
            System.out.print("Enter the Index Value at " + i + " :- ");
            arr[i] = sc.nextInt();

        }

    System.out.println("Elements of Array Are :) ");
    for(int j = 0;j<=n-1;j++){
        System.out.println(arr[j]);
    }

        int product = 1;

        for(int k = 0;k<=n-1;k++){
            int val = arr[k];
            product = val * product;
        }
        System.out.println("Product of all the elements in the array is :- "+product);
      }
}
