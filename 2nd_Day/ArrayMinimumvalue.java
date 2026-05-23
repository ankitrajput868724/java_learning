
import java.util.Scanner;
public class ArrayMinimumvalue {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n = sc.nextInt();
int arr[] = new int[n]; 

for(int i = 0;i<=n-1;i++){
    System.out.print("Enter the Index Value at " + i + " :- ");
    arr[i] = sc.nextInt();
    }
int min = arr[0];
for(int j = 0;j<=n-1;j++){
    if(arr[j]<min){
        min = arr[j];   
    }
}
System.out.println("The minimum element in the array is: " + min);

    }



}