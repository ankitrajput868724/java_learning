public class Array2DAddValues {
    
    public static void main(String[] args) {

        int Sum = 0;
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i <=arr.length -1; i++){
            for(int j = 0; j <= arr[i].length -1; j++){
                Sum+= arr[i][j];
               
            }
        }
        System.out.println("The sum of all elements in the 2D array is: " + Sum);
    }
}
