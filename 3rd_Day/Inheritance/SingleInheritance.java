

public class SingleInheritance {
    
public int NoOfTyres;
public String Name;
public String Model;



SingleInheritance(){
 
    this.Name = " ";
    this.Model = " ";
    this.NoOfTyres = 2;
}

SingleInheritance(int NoOfTyres , String Name , String Model ){
    this.NoOfTyres = NoOfTyres;
    this.Name = Name;
    this.Model = Model;

}
void StartEngine() 
{
System.out.println("Engine Starting of "+Name+ " " +Model);
}
void StopEngine()
{
    System.out.println("Engine Stopped "+Name+ " " +Model);
 }
}
