public class one_d_array {
    public static void main(String[] args) {
       // int arr[]={4,6,19,20}; one way to create array in java
       int arr[]=new int[4];
       arr[0]=5;
       arr[1]=6;
       arr[2]=7;
       arr[3]=8;
       //String names[]={"puja","rani","vivek","Akshay"};
       String names[]=new String[4];
       names[0]="puja";
       names[1]="jiya";
       names[2]="vivek";
       names[3]="pal";

        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<4;i++){
            System.out.println(names[i]);
        }
    }
    
}
