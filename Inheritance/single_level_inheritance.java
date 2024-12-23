class Animal{
    void sleep(){
        System.out.println("Animal need sleep");
    }
}
class Tiger extends Animal{

}
public class single_level_inheritance {
    public static void main(String[] args) {
        Tiger a=new Tiger();
        a.sleep();
    }
    
}
