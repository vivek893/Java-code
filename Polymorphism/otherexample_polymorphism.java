class marutisuzuki{
    public void start(){
        System.out.println("car start");

    }
    public void stop(){
        System.out.println("car stop");
    }
}
class ciaz extends marutisuzuki{
    public void start(){
        System.out.println("ciaz car start automatically using remote");
    }
    public void stop(){
        System.out.println("stop ciaz car using remote");
    }
}
class swift_Dzire extends marutisuzuki{
    public void start(){
        System.out.println("swift dzire car only start using key");
    }
    public void stop(){
        System.out.println("swift dzire car stop using key only");
    }
}
class sedans extends marutisuzuki{
    public void start(){
        System.out.println("sedans car start in both way key as well as remote");
    }
    public void stop(){
        System.out.println("sedans car stop when velocity and speed will be zero");
    }
}
class marutisuzuki_service_center{
    public void polymorphism(marutisuzuki ref){
        ref.start();
        ref.stop();
        System.out.println("--------------------------------");
    }
}
public class otherexample_polymorphism {
    public static void main(String[] args) {
        ciaz c=new ciaz();
        swift_Dzire sd=new swift_Dzire();
        sedans s=new sedans();
        marutisuzuki_service_center sc=new marutisuzuki_service_center();
        sc.polymorphism(c);
        sc.polymorphism(sd);
        sc.polymorphism(s);
        
    }

    
}
