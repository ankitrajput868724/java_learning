public class dfg1 {
    int a ;

    void m1(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        
dfg1 oo = new dfg1();
oo.a=6756;
oo.m1();

dfg1 oo2 = new dfg1();

oo2.a = 20;
oo2.m1();


oo.m1();
oo2.m1();
}
}
