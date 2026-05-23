public class one {

    int id;
    int age;
    int Rollno;
    String name;
    String gf;

    one(int id , int age , int Rollno ,String name , String gf)
    {
        System.out.println("This Is Parameterized Constructor");

        this.id=id;
        this.age=age;
        this.Rollno=Rollno;
        this.name=name;
        this.gf=gf;
        


    }
    public void bunk()
    {
        System.out.println(name+" Had Bunk class Yesterday");


    }
    public void Sleep()
    {
        System.out.println(name+" Is sleeping in class Since morning");
    }
    private void chatting(){
        System.out.println(gf+" Is Having Some Connection :) ");
    }
}
