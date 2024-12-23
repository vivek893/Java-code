public class Enhanced_loop {
    public static void main(String[] args) {
        /*int nums[]={2,3,4,5,6};
        for(int n:nums){
            System.out.print(n+" ");
        }*/
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int a[]:nums){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    
}
