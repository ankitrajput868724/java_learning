public class FactRecursion {
    public static void main(String[]args){
System.out.println(m1(50));
    }

    public static int m1(int i){
        if(i<=1) return 1;

        return i+m1(i-1);

    }
}
