import java.util.*;
public class ArrayMaxFind {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int n = sc.nextInt();
int arr[] = new int[n];

int max = arr[0];
System.out.println("Enter the elements :) ");
for(int i = 0;i<=n-1;i++){
    System.out.print("Enter the Index Value at " + i + " :- ");
    arr[i] = sc.nextInt();
    if(arr[i]>max){
        max = arr[i];   }
}
System.out.println("The maximum element in the array is: " + max);
}

}