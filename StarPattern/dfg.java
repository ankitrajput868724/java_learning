public class dfg {

    static int a=10;


    void m1(){
        System.out.println(a);
    }
    public static void main(String[] args) {



        dfg ob = new dfg();
        ob.m1();
        ob.a=60;
        dfg ob2 = new dfg();
        ob2.m1();
    }
}