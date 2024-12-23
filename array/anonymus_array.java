class cal{
    public int add(int nums[]){
        int result=0;
        for(int b:nums){
            result+=b;
        }
        return result;

    }
    }

public class anonymus_array {
    public static void main(String[] args) {
        cal obj=new cal();
        int result=obj.add(new int[]{1,2,3,4,5,6}); // anonymus array
        System.out.println(result);
        
    }
    
}
