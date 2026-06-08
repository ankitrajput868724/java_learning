public class Array2ndlargestval {
    public static void main(String[] args) {
        
        int a[] = {10,30,75,70};
        int max = a[0];
        int min = a[1];
        if(a[0]>a[1]){
            max=a[0];
            min=a[1];
        }else{
            max = a[1];
            min = a[0];
        }
        for(int i=2 ; i<a.length ; i++){
            if(a[i]>max){
                min=max;
                max=a[i];
                
            }else if(a[i]>min){
                min=a[i];
            }
        }
        System.out.println(min);

    }
    
}
