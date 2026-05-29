import java.util.Arrays;


public class ArraySort{
    public static void main(String[] args) {
        
    
    int[] arr = {15, 60,45,5,1};

Arrays.sort(arr);

for(int i=0 ; i<arr.length ; i++){
    int num = arr[i];
    System.out.print(" "+num);
}
    }

}