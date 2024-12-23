class Aeroplane1{
    public void takeoff(){
        System.out.println("Aeroplane is takeoff");
    }
    public void fly(){
        System.out.println("aeroplane has been flies");
    }
}
class cargoplane1 extends Aeroplane1{
    public void takeoff(){
        System.out.println("cargoplane required lower size runway");

    }
    public void fly(){
        System.out.println("cargoplane flies at lower height");
    }
}
class passengerplane1 extends Aeroplane1{
    public void takeoff(){
        System.out.println("passengerplan requires medium size runway");
    }
    public void fly(){
        System.out.println("passengerplane files at medium height");
    }
}
public class introduction_polymorphism_method_overriding {
    public static void main(String[] args){
        cargoplane1 cp=new cargoplane1();
        passengerplane1 pp=new passengerplane1();
        Aeroplane1 ref;
        // pp=cp; it gives error because datatype of both object are same. 
        ref=cp; // it doesn't gives error because parent class have a capecity to hold the reference of child class
        ref.takeoff();
        ref.fly();
        System.out.println("-------------------------------------------------------");
        ref=pp;
        ref.takeoff();
        ref.fly();
        // in both case same function is called that is ref.takeoff() and ref.fly() but output is different in both the case.
        // so method has multiple form that is polymorphism and same method has different output is runtime polymorphism. 
    }
    
}
