public class Array2DBasics {


    public static void main(String[] args) {
   //     int arr[][];                            //array declaration
    //    arr = new int[3][4];           //arrasay initialization
    //    arr[][] = {{1,2,3,4,5}};
  //  }


  int[][] arr = {
                {1,2,3,4},
                {4,3,2,1},
                {5,6,7,8}

                };
 //     System.out.println(arr[0][0]);           //array elements accessing
 

 for(int i = 0;i<=arr.length-1;i++){
    for(int j =0 ; j<=arr[i].length-1;j++){
        System.out.print(arr[i][j]+" ");  
    }
    System.out.println();
       
 }

            }
}