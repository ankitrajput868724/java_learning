// THIS CODE IS TO MULTIPLY 10 IN EVERY ELEMENT OF ARRAY 

import java.util.*;
public class MulArray{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    

System.out.println("Enter the no. of Rows and Coloumns in Array :) ");
int row = sc.nextInt();
int col = sc.nextInt();

int[][]arr = new int[row][col];


for(int i = 0 ; i<=row-1 ; i++){

    for(int j = 0 ; j<=col-1 ; j++){
System.out.println("Enter the elements of Row :- "+i+" and coloumn :- "+j);
arr[i][j] = sc.nextInt();

    }

    }


System.out.println("The elements are :- ");
for(int i=0; i<=row-1;i++){
    for(int j=0; j<=col-1;j++){
        System.out.print(arr[i][j]+ " ");

    }
    System.out.println();
}

System.out.println("After multiply by 10 :-- ");
    for(int i = 0; i<=row-1 ; i++) {
        for(int j = 0 ; j<=col-1 ; j++){

            arr[i][j]*=10;
            System.out.print(arr[i][j] + " ");
        }
        System.out.println("");
    }

}




}
