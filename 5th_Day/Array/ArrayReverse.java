public class ArrayReverse {

public static void main(String[] args) {
    int a[] = {2,4,7,11,15,18,21};
    int target = 26;

    for(int i=0 ; i<a.length ; i++){
        for(int j=i+1 ; j<a.length ; j++){

            if(a[i]+a[j] ==target){
System.out.println(i+" "+j);
            }
        }
    }
}

}
