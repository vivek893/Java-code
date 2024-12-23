/**
 * InnerDemo
 */
interface A{
   int num=6;
    void show();
}
interface X{
    void abc();

}
class B implements A,X{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("abc function in interface x");
    }
}
public class Demo {
    public static void main(String[] args) {
        // A obj=new B();
        // obj.show();
        // obj.abc(); // it gives error because abc() method present in x interface not in interface A and here object create for interface A
        B obj=new B();
        obj.show();
        obj.abc(); // that is correct because both function present in class B
        // A obj=new A(); //object not create in interface
        System.out.println(A.num); // interface variable call using interface name
        System.out.println(obj.num);
         //A.num=9; // not change because num is final keyword variable
       
    
        
    }
    
}
