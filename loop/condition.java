public class condition{
    public static void main(String[] args){
       /*int age=55;
        if(age>=18 && age<=60){
            System.out.println("you are adult");
        }
        else if(age>60){
            System.out.println("You are senior citizen");
        }
        else{
            System.out.println("you are child");
        }*/
    // ternary operator
    int a=30;
    int b=20;
    int c=40;
    String result;
    int third;
    result=(a<b)?"a is less than" : "b is greater than a";
    System.out.println(result);
    third=(a<b)?(a<c? a:c):(b<c?b:c);
    System.out.println(third);
    }
}