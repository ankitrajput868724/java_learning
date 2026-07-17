import java.util.Arrays;

public class SumofunequalArrays {
    public static void main(String[] args) {
        int[] b= {1,2,3,4,5,6};
        int[] a={1,2,3,4};
int c = a.length<b.length?a.length:b.length;


for(int i=0 ; i<c ; i++){
    if(a.length>b.length){
        a[i]+=b[i];
    }else{b[i]+=a[i];}
}
b =a.length>b.length ? a:b;
System.out.println(Arrays.toString(b));
    }
    
}