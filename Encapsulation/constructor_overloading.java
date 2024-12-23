class Student{
    private int age;
    private String name;

    // default constructor
    public Student(){
        this(18,"ajay");
        System.err.println("zero parameterised constructor");
        age=18;
        name="vivek";

    }
    // only take string value
    public Student(String name){
        this();
        this.name=name;
        age=20;

    }
    // parameterised constructor
    public Student(int age,String name){
        System.out.println("this is parameterised constructor");
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(age+ " "+ name);
    }
}
public class constructor_overloading {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.display();
        Student obj1=new Student("vivek");
        obj1.display();
        Student obj2=new Student(19,"rahul");
        obj2.display();
    }
    
}
