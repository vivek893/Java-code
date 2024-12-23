import java.util.Scanner;
public class user_input {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        /*int size=Scanner.nextInt();
        int arr[]=new int[size];
        System.out.println(size);
        for(int i=0;i<size;i++){
            arr[i]=Scanner.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }*/

        // 2-D Array
        /*int row_size=Scanner.nextInt();
        int column_size=Scanner.nextInt();
        int arr[][]=new int[row_size][column_size];
        for(int i=0;i<row_size;i++){
            for(int j=0;j<column_size;j++){
                arr[i][j]=Scanner.nextInt();
            }
        }
        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }*/
        // taking input as string
        System.out.println("taking string value");
        String str_value=Scanner.nextLine() ;// for string we use nextLine()
        System.out.println(str_value);
        // taking input for character
        System.out.println("taking charactervalue");
        char charValue=Scanner.next().charAt(0);
        System.out.println(charValue);
        // taking integer as input
        System.out.println("taking integer value");
        int a=Scanner.nextInt();
        System.out.println(a);
        // taking float as input
        System.out.println("taking float value");
        float b=Scanner.nextFloat();
        System.out.println(b);
        // taking double as input
        System.out.println("taking double value");
        double c=Scanner.nextDouble();
        System.out.println(c);
        // boolean as input
        System.out.println("taking Boolean value ");
        boolean d=Scanner.nextBoolean();
        System.out.println(d);


        
    }
    
}
