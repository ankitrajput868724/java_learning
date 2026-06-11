import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int a = sc.nextInt();       
int num = a;
int sum=0;

while(a>0){
    int digit = a % 10;
    int product = 1;

for(int i=1 ; i<=digit ; i++){
product *=i;
}
sum += product ;

    a/=10;

}
//System.out.println(sum);

if(num == sum){ System.out.println("Strong number :- "); }else{
    System.out.println("not");
}

    }
    
}
