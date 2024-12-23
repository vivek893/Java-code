import java.util.Scanner;
class farmer{
    int pi;
    float time;
    static float ri;
    float si;
    static{
        ri=11.5f;
    }
    
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the amount required");
        pi=scan.nextInt();
        System.out.println("please enter required time");
        time=scan.nextFloat();

    }
    void compute(){
        si=(pi*ri*time)/100f;
    }
    void display(){
        System.out.println("your total amount after intrest is"+si);
    }

}
public class simple_intrest {
    public static void main(String[] args) {
        farmer a=new farmer();
        farmer b=new farmer();
        a.input();
        a.compute();
        a.display();
        b.input();
        b.compute();
        b.display();
    }
    
}
