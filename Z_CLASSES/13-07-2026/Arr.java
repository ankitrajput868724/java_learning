

public class Arr {
    public static void main(String[] args) {
        
    

int[] a = {1,2,3,4,5,6,7,8,8,9};
int sum=0;
int even = 0;
int odd=0;
for(int i=0 ; i<a.length ; i++){
// sum+=a[i];
if(a[i]%2==0){
    even+=a[i];
}
if(a[i]%2!=0) {odd+=a[i];}
}

System.out.println(even);
System.out.println(odd);
}}