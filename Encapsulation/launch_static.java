
class Demo1{
    static int a;
    static int b;
    int m;
    int n;

    //static initialisation
    static{
        System.out.println("cursor in static block");
        a=10;
        b=20;
    }

    // non-static initialisation
    {
        System.out.println("cursor in non-static block");
        m=30;
        n=40;
    }
    // static method
    final 
    static void display(){
        System.out.println("value of a is"+a);
        System.out.println("value in b"+b);
    }
    // non-static method 
    void display2(){
        System.out.println("value of m"+m);
        System.out.println("value of n"+n);
    }
}
public class launch_static {

    public static void main(String[] args) {
        Demo1 a=new Demo1();
        Demo1.display(); // call static method
        a.display2(); // call non-static method
        a.display(); // we can call static method using object also. 
    }

    
}
