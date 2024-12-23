class Demo1{
    void disp(){
        System.out.println("Disp written in demo1 class");
    }
}
class Demo2 extends Demo1{
    void show_Demo2(){
        System.out.println("it inherit the property and behaviour of demo1 class");
        System.out.println("Demo1 is parent class and Demo2 is subclass");
    }
}
class Demo3 extends Demo2{
    void show(){
        System.out.println("show written in class Demo3");
    }
    }

public class multi_level_inheritance {
    public static void main(String[] args) {
        Demo3 a=new Demo3();
        a.disp();
        a.show();
        a.show_Demo2();
    
    }
    
}
