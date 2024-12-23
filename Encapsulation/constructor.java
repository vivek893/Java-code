class Student{
    private int age;
    private String name;

    //constructor
    // by-default constructor
    public Student(){
        System.out.println("zero parameterised constructor");
    }
     // parameterised constructor
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name+" "+ age);
    }
    

}
public class constructor {
    public static void main(String[] args) {
        Student obj=new Student(); // by-default constructor call
        obj.setAge(18);
        obj.setName("vivek");
        int student_age=obj.getAge();
        String student_name=obj.getName();
        System.out.println(student_age+ " "+ student_name);
        Student obj1=new Student(30,"rahul"); // parameterised constructor
        int student1_age=obj1.getAge();
        String student1_name=obj1.getName();
        System.out.println(student1_age+" "+ student1_name);

        
    }
    
}
