// final class Animal{  // final class not participate in inheritance
//     public void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }
class Animal{ 
    final int age=19;
    final public void sleep(){
       //  age=20; // final variable don't change.
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal{
    // public void sleep(){ // it is not possible because final method don't override. 

    // }

}
public class final_keyword {
    public static void main(String[] args) {
        Tiger T=new Tiger();
        T.sleep();
    }
}
