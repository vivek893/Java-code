abstract class Aeroplane1{
    abstract public void takeoff(); // abstract method
    abstract public void fly();
    public void landing(){
        System.out.println("Aeroplane land");
    }
}
class cargoplane1 extends Aeroplane1{
    public void takeoff(){
        System.out.println("cargoplane require small runway");
    }
    public void fly(){
        System.out.println("cargoplan flies at lower height");
    }
    public void alert(){
        System.out.println("alert..");
    }
}
class passengerplane1 extends Aeroplane1{
    public void takeoff(){
        System.out.println("passengerplane require medium size runway");
    }
    public void fly(){
        System.out.println("passengerpaln flies at medium height");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Aeroplane1 cp=new cargoplane1();
        cp.takeoff(); // override method
        cp.fly(); // override method
        cp.landing(); // inherit method
       // cp.alert(); // it gives error because in parent call alert function is not present. it is specialised function
       // for solving these problem we do down-casting
       ((cargoplane1)cp).alert();  // downcasting accepted 
        Aeroplane1 pp=new passengerplane1();
        pp.takeoff();
        pp.fly();
        pp.landing(); // inherit method
        
    }
    
}
