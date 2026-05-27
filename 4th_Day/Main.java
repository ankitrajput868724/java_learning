abstract class Bird{

abstract void fly();

abstract void eat();

}
class Sparrow extends Bird{

    @Override
    void fly() {
System.out.println("Bird flying");    }

    @Override
    void eat() {
System.out.println("Bird eating");    }


}






public class Main{
public static void main(String[] args) {
    

    Bird b = new Sparrow();
    b.eat();
    b.fly();
}
}