import java.util.Scanner;

public class Array2DPrint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows and coloumns :) ");

        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

for(int i = 0;i<=row-1;i++){
            
            for(int j = 0; j<=col-1; j++){
                System.out.println("Enter the elements of "+i+ "row and"+j+"coloumn :)");
                arr[i][j] = sc.nextInt();
            }
        }
System.out.println("The 2D array is :)");
for(int i = 0;i<=row-1;i++){
            
            for(int j = 0; j<=col-1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


}



}
