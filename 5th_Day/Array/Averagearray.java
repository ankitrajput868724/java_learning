import java.util.*;

public class Averagearray{
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    int sum = 0;


    System.out.println("Enter the NO. of Rows and Coloumn :) ");
    int row =sc.nextInt();
    int coloumn = sc.nextInt();
    int arr[][] = new int[row][coloumn];

    int s = arr.length;


    for(int i=0 ; i<=row-1 ; i++){

        for(int j=0 ; j<=coloumn-1; j++){

System.out.println("Enter the element of ROW " +i+ " coloumn " +j);
arr[i][j] = sc.nextInt();


        }
    }


    System.out.println("The array is ");
for(int i = 0 ; i<=row-1 ; i++){
    for(int j=0 ; j<=coloumn-1; j++){

        System.out.print(arr[i][j] +" ");

        sum +=arr[i][j];
    }
System.out.println("");
}
int average = sum/s;


System.out.println("The Average of this array is :) "+average);

}


}