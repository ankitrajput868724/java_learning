
public class Student{
    public String name;
    public int id ;
    public int age;
    public int nos;
    

    //DEFAULT CONSTRUCTOR
//     public Student() {
// System.out.println("Constructor called");
//     }


    
//     public void Study(){
//    System.out.println(name+"Study");
//     }
//    public void Sleep(){
// System.out.println(name+"Sleeping");

//   }
//    public void Bunk(){
//     System.out.println(name+"Bunk");


public Student(int id , int age , int nos , String name){
    System.out.println("Calling Parameterized Constructure");
    this.id = id;
    this.nos = nos;
    this.name = name;
    this.age = age;

}

    

   }
