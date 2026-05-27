import java.util.*;

public class ArraySearxh{
public static void main(String[] args) {
    


    Scanner sc = new Scanner(System.in);

    System.out.println("enter no. of rows and coloumns :-- ");
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];


    for(int a = 0; a<=row-1 ; a++){
        for(int b=0;b<=col-1 ; b++){
            System.out.println("row :--"+a+ " coloumn :-- "+b);
            arr[a][b] = sc.nextInt();
        }
    }

    System.out.println("The array is :");
for(int a = 0 ; a<=row-1 ; a++){
    for(int b = 0 ; b<=col-1 ; b++){
        System.out.print(arr[a][b]+" ");

    }
    System.out.println();
}

Arrays.sort(arr);


System.out.println("The Sorted array is :)" +arr);

}


}