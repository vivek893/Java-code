public class two_dimensional_array {
    public static void main(String[] args) {
        //int arr[][]=new int[3][2];
        /*int arr[][]={{1,2,3,4},{5,6},{7,8,9}};// jagged array
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int arr[][]=new int[3][2];
        arr[0]=new int[4]; // total number of column in row first
        arr[1]=new int[2]; // total number of column in row second
        arr[2]=new int[3]; // total number of column in row third
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[0][3]=4;
        arr[1][0]=5;
        arr[1][1]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
