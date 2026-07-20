import java.util.Arrays;

public class MergeSort{



    public static void main(String[] args){
        int[] a = {4,4,5,5,6,6,1,1};

    Sort(a);
    System.out.println(Arrays.toString(a));
    }


    public static void Sort(int[]a){
        if(a.length == 1)return;

        int[] left = new int[a.length/2];
        int[] right = new int[a.length-left.length];

        for(int i=0 ; i<left.length ; i++) left[i] = a[i];

        for(int j=0 ; j<right.length ; j++) right[j]=a[j+left.length];
        Sort(left);
        Sort(right);
merge(left , right , a);
    }

public static void merge(int []left , int[] right , int[] a){
int x=0;
int y=0;
int z=0;
    while(x<left.length && y<right.length){
        if(left[x]<right[y]){
            a[z++] = left[x++];
        }
        else{a[z++] = right[y++];}



    }while(y<right.length){a[z++] =right[y++];}
    while(x<left.length){a[z++] = left[x++];}
}
}