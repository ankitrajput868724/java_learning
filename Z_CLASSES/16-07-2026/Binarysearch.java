public class Binarysearch {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int st=0;
        int end=a.length-1;
int target=6;

        while(st<end){
            int mid = (st+end)/2;

            if(a[mid] == target)System.out.println(mid);

            if(a[mid]<target){
                st=mid+1;

            }else{end=mid-1;}
    }
    }
}