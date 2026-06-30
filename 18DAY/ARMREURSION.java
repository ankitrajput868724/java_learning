import java.util.Scanner;
public class ARMREURSION {


                //FIRST --- METHOD        (SECONDARY METHOD)//
public static int count(int num){
    if(num ==0)return 0;

    return 1+count(num/10);
}

                //SECOND ----- METHOD    (SECONDARY METHOD) //
public static int Armstrong(int num , int count){

    if(num ==0)return 0;
int digit = num%10;
    int product =(int)Math.pow(digit , count);

    return product + Armstrong(num/10 , count);


}


// MAIN ------ METHOD
public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // System.out.println(m1(3,153));
            // System.out.println(count(10));

            System.out.println("Enter a number :)  ");
            int num = sc.nextInt();
            int x = count(num);
            System.out.println(Armstrong(num , x));
        }
// public static int m1(int a , int n){
//   if(n<1) return 0;
//     int pro = 1;
//     int d = n%10;


//     pro = d*a;

//     return pro + m1(a , n/10);
// }


}


