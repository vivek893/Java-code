class overloading{
    public int multiply(int a,int b){
        int result=1;
        result=a*b;
        return result;
    }
    public int multiply(int a, int b, int c){
        int result=1;
        result=a*b*c;
        return result;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        overloading obj=new overloading();
        int result=obj.multiply(5, 10);
        int res=obj.multiply(5, 10, 20);
        System.out.println(result);
        System.err.println(res);
        
    }
    
}
