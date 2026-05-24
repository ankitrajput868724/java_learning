public class Motorcycle extends SingleInheritance {
    public String handlestyle;
    public String suspensiontype;


    Motorcycle(String Name , String Model , int NoOfTyres , String handlestyle , String suspensiontype){
        super(NoOfTyres , Name , Model);
        this.handlestyle = handlestyle;
        this.suspensiontype = suspensiontype;
    }
    public void wheelie(){
        System.out.println("Mototcycle doing wheelie "+Name);
    }
}
