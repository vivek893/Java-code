class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){  // overridden method
        System.out.println("Aeroplane is flying");
    }
}
class cargoplane extends Aeroplane{
    public void fly(){ //overriding method
        System.out.println("cargoplane flies at lower height");
    }
    public void carryfood(){ // specialized method
        System.out.println("cargoplan carries goods");
    }

}
class passengerplane extends Aeroplane{
    public void fly(){ //overriding method
        System.out.println("passengerplan flies at medium height");
    }
    public void carrypassenger(){ // specialized method
        System.out.println("passengerplan carries passenger");
    }

}
public class Method_in_inheritance {
    public static void main(String[] args) {
        cargoplane cp=new cargoplane();
        cp.takeoff(); // inherit method call
        cp.fly();    // overriding method call
        cp.carryfood(); // specialized method call
        

        passengerplane pp=new passengerplane();
        pp.takeoff(); // inherit method call
        pp.fly();  // overriding method call
        pp.carrypassenger(); // specialized method call
        
    }
    
}
