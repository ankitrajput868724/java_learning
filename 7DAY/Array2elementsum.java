public class Array2elementsum {
    
    public static void main(String[] args) {

        int[] arr={1,2,3};
int sum=0;
int target = 3;

        for(int i=0;i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
sum = arr[i]+arr[j];
    if(sum==target){
        System.out.println("Target found at index :-- "+i+" "+j);
    }

    
            }
            }
    



    }
    
}


