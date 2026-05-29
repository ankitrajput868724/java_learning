import java.util.*;

public class ArraySearxh{





    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows and coloumn :)");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][]arr = new int[row][col];
        for(int i=0; i<=row-1 ; i++)
        {
            for(int j = 0 ; j<=col-1 ; j++){
                System.out.println("enter the row :-- "+i+" coloumn "+j);
    
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<=row-1;i++){
            for(int j=0;j<=col-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    

        System.out.println("Enter the element you want to search :--");
        int Target = sc.nextInt();


      for(int i = 0 ; i<row ; i++ ){
        for(int j = 0 ; j<col ; j++){
            if(arr[i][j] == Target){
                System.out.println("Target found at row "+i+" col "+j );
            }
         


        }
      }



    }

}