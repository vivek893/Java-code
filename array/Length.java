public class Length {

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(nums.length);
        int num[][]={{1,2,3,4},{5,6,7},{2,3,5,6}}; // array is primitive data type so, we used property of data type
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);
        System.out.println(num.length);
        String name="vivek";  // string is class so we used method in class. 
        System.out.println(name.length());
    }
}
