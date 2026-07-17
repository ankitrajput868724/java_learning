import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] a = {8,9,0,6,45,3,1,2,3,4,5};



        for(int i=0 ; i<a.length ; i++){
            int val = i;


            for(int j=i+1 ; j<a.length ; j++){

                if(a[j]<a[val])val=j;

            }
            int temp = a[i];
            a[i]=a[val];
            a[val]=temp;
        }

        System.out.println(Arrays.toString(a));
    }
    
}
