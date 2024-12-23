class Student{
    private int age;
    private String name;
    //setter method
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    //getter method
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }



    public void show(){
        System.out.println(name + " " + age);
    }
}
public class setter_getter {
    public static void main(String[] args) {
        Student obj=new Student(); // by-default constructor call
        Student obj1=new Student(); // by-default constructor call
        obj.setAge(18);
        obj1.setAge(30);
        obj.setName("vivek");
        obj1.setName("rahul");
        int student_age=obj.getAge();
        String Student_name =obj.getName();
        System.out.println(student_age+" "+ Student_name);
        
    }
    
}
