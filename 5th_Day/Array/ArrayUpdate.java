
import java.util.Arrays;
public class ArrayUpdate {


    public static void main (String[] args){


        int[] arr = {14,12,13,15,16,80};
      Arrays.sort(arr);

        for(int ans:arr){
            System.out.println(ans+" ");
        }

    arr[5] = 5;

    for(int ans : arr){
        System.out.print(" "+ans);
    }
    }

}
