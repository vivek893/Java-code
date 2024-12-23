public class way_to_comapre_string {
    public static void main(String[] args) {
        String s2="vivek kumar";
        String s3="vivek kumar";
        String s4="VIVEK KUMAR";
        String s1=new String("vivek kumar");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2==s3);
        System.out.println(s3==s4);
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
    
}
