
public class Fib {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=10;
        int Sum=0;

        System.out.println(a+" "+b);
        for(int i=1; i<10;i++){
            Sum=a+b;
            System.out.println(Sum);
            a=b;
            b=Sum;
        }



    }
    
}
