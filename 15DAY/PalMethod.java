import java.util.Scanner;
public class PalMethod {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the start and end :) ");
int x=sc.nextInt();
int y=sc.nextInt();
for(int a =x ; a<=y ; a++){
    int reverse = isPal(a);                   //METHOD CALLING + PASSING VALUES \\
    if(reverse == a){System.out.println(a);}
}} 
    //METHOD IS HERE \\
    public static int isPal(int a)
    {
        int rev=0;
        while(a>0){
        int dig =  a%10;
        rev = rev*10+dig;
        a/=10;
        }
        return rev;
    }
}
