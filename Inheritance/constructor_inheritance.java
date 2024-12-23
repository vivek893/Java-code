class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parent class constructore call");
    }
    public Demo1(int x,int y){
        System.out.println("parameterised parent class constructor call");
        a=x;
        b=y;

    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
       // this(30,40);
        // in-built super() method called and parent class non-parameterised constructor call
        //super(30,40); // parameterised parent class constructor called
        
        System.out.println("child class constructor call");
    }
    public Demo2(int x,int y){
        // in-built super() method called and parent class non-parameterised constructore call
        //super(30,40); // parameterised parent class constructor call
        //this(30,40);// it gives error recursive construction not call. here we call same constructor
        this(); //it is correct because we call other constructore not same constructore
        System.out.println("parameterised child class constructor call");
        m=x;
        n=y;
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
    //    Demo2 a=new Demo2();
    //    System.out.println(a.a);
    //    System.out.println(a.b);
    //    System.out.println(a.m);
    //    System.out.println(a.n);
       Demo2 x=new Demo2(10,5);
       System.out.println(x.a);
       System.out.println(x.b);
       System.out.println(x.m);
       System.out.println(x.n);
        
    }
    
}
