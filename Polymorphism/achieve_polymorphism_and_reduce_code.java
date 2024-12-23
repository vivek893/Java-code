class Aeroplane2{
    public void takeoff(){
        System.out.println("aeroplane takeoff");
    }
    public void fly(){
        System.out.println("aeroplane fly");
    }
}
class cargoplane2 extends Aeroplane2{
    public void takeoff(){
        System.out.println("cargoplane requires small size runway");
    }
    public void fly(){
        System.out.println("cargoplane flies at lower heights");
    }
}
class passengerplane2 extends Aeroplane2{
    public void takeoff(){
        System.out.println("passengerplane requires medium size runway");
    }
    public void fly(){
        System.out.println("passengerpalne flies at medium heights");
    }
}
class fighterplane2 extends Aeroplane2{
    public void takeoff(){
        System.out.println("fighterpalne requires longer size runway");
    }
    public void fly(){
        System.out.println("fighterplane flies at largest height");
    }
}

class Airport{
    public void polymorphism(Aeroplane2 ref){  // pass parent class reference object. because parent class have a capacity to hold child class object as a reference
        ref.takeoff();
        ref.fly();
        System.out.println("-------------------------------");

    }
}
public class achieve_polymorphism_and_reduce_code {
    public static void main(String[] args) {
        Aeroplane2 cp=new cargoplane2();
        passengerplane2 pp=new passengerplane2();
        fighterplane2 fp=new fighterplane2();
        Airport aa=new Airport();
        aa.polymorphism(cp);
        aa.polymorphism(pp);
        aa.polymorphism(fp);
        // cp.takeoff();
        // cp.fly();
        // System.out.println("----------------------------");
        // pp.takeoff();
        // pp.fly();
        // System.out.println("------------------------------------");
        // fp.takeoff();
        // fp.fly();
    }
    
}
