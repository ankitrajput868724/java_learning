import java.util.Scanner;
public class PheuuRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// a(0 , 1 , 10);

System.out.println("ENTER THE INDEX NO TO SEARCH ");
int a = sc.nextInt();

System.out.println(m1(a));

        
    }
    

    // public static int a( int first , int second , int z){

        // if(z==0) return 0;
        // System.out.println(first);

        // return a(second , first+second , z-1);
public static int m1(int a){

    if(a==0) return 0;
        if(a==1) return 1;

        return m1(a-1)+ m1(a-2);
}
        

    }

