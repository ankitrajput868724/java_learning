public class Car extends SingleInheritance  {

    public int noofdoor;
    public int transmissionType ;
    Car(String Name , String Model , int NoOfTyres , int noofdoor , int transmissiontype )
    {
        super(NoOfTyres , Name , Model); 
        this.noofdoor = noofdoor;
        this.transmissionType = transmissiontype;
        super.StartEngine();                                  
        
    }
    public void StartAC(){
        System.out.println("AC Started of "+Name);
    }
}
