class Student {
    //int age; // it can be access from other class also because it is not private
    //String name; // it can be access from other class also because it is not a private 
    private int age;
    private String name;
    public void setData1(int age){
        // shadowing problem
        //age=age; // shadowing problem. here age is consider as local variable not instance variable and local variable= local variable bi default value assigned
        // for solving shadowing problem we used this keyword
        this.age=age;
    }
    public void setData2(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(name + " " + age);
    }
    
}
public class Demo {
    public static void main(String[] args) {
        // create object of student class
        Student obj =new Student();
        Student obj1=new Student();
        //obj.show(); // output is Null and 0 because bi-default value is null and 0
        // now change age and name using object
        // obj.age=18;
        // obj.name="vivek";
        // obj.show(); // output is vivek 18

       // obj.age=18; // it gives an error
        //obj.name="vivek"; // it gives an error
        obj.setData1(18); // this function call because this function create in student and call in main method. it is possible but direct variable access it not possible
        obj1.setData1(30);
        obj.setData2("vivek");
        obj1.setData2("Rahul");
        obj.show();
        obj1.show();
    }

    
}
