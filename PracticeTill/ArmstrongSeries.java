import java.util.Scanner;
public class ArmstrongSeries{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the Start and ending");
    int start = sc.nextInt();
    int end = sc.nextInt();
    int smaller = start<end?start:end;
    int bigger = start>end?start:end;
    if(smaller<1){System.out.println("Error ! VALUE SHOULD BE BIGGER THAN 0 :( ");}else{
    System.out.println("The Starting no is :) "+smaller+" The ending no is :) "+bigger);
    for(int i=smaller ; i<=bigger ; i++){
        int count=0;
        int num = i;
        int temp = num;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp = num;
        // System.out.println("temp issss "+temp);
        int sum = 0;
        while(temp>0){
        int digit =  temp%10;
            int prod=1;
                            for(int j=1;j<=count ; j++){
                                prod*=digit;
                            }sum+=prod; 
        temp/=10;
        } 
        if(sum==num){
            System.out.println("Armstrong number"+sum);
        }
    }
}
}
}