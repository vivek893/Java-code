class Animal{ // extend object class (object class is in-built class in java)
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal{

}
class monkey extends Animal{

}
class Deer extends Animal{

}
public class Hierarichal_inheritance {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.sleep();
        monkey m=new monkey();
        m.sleep();
    }
    
}
// one parent have multiple child class 
