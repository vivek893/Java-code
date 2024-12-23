class Human{
    private String name; // private member not paritcipate in inheritance
    int age;
    Human(){
        // it call because bydefault constructor of child class excute and in child class constructor super() present and super() call parent class constructor
        System.out.println("constructor of human"); // constructor not participate in inheritance
    }
    void sleep(){
        age=18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }
}
class Student extends Human{
    void display(){
        System.out.println("age of student is"+age);
        //System.out.println("name of student"+name); // it gives error because private member not inherit
    }

}
public class Inheritance1 {
    public static void main(String[] args) {
        
    
    Student st=new Student();
    st.sleep();
    st.display();
    }
    
}
