public class BinrySearchRecursion {


    public static int m1(int[]a , int target, int st , int end ){

        int mid=(st+end)/2;

        if(a[mid] == target){
            return mid;
        }
        else if(target<a[mid]){return m1(a , target, st , end-1 );}
        else  return m1(a , target, st+1 , end );
    }
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9,10};

    System.out.println( m1(a, 10, 0, a.length - 1));

    

    }
    
}
