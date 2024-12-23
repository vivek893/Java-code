class calculator{
    public int add(int a,int b){
        int result=a+b;
        return result;
    }
    public int add(int a, int b, int c){
        int result=a+b+c;
        return result;
    }
    public double add(double a, double b){
        double result=a+b;
        return result;
    }
}
public class demo {
    public static void main(String[] args) {
        calculator obj1=new calculator();
        int result=obj1.add(2, 3);
        int res1=obj1.add(2, 3, 4);
        double res2=obj1.add(2.5, 3.5);
        System.out.println(result+" "+res1+" "+res2 );
        System.out.println(res1);
        System.out.println(res2);
        
    }
    
}
