import java.util.Scanner;
class demo{
    public int add(int nums[]){
        int result=0;
        for(int b:nums){
            result+=b;
        }
        return result;
    }
}
public class sum_of_array {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner Scanner=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=Scanner.nextInt();
        }
        demo obj=new demo();
        int result=obj.add(arr);
        System.out.println(result);

    }
    
}
