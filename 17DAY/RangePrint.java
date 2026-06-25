public class RangePrint {
    public static void main(String[] args) {
    
        // System.out.println(m1(1,6));
        m1(1,7);
    }
    


    public static int m1(int a , int b){
        if(a>b) return 1;
System.out.println(a);
        return m1(a+1 , b);




    }
}
