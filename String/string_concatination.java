import java.lang.*;
public class string_concatination {

    public static void main(String[] args) {
        String s1=new String("vivek");
        //s1.concat("kumar");  it will return only vivek don't concatinate store in any object
        s1=s1.concat("kumar");
        System.out.println(s1);
        String s2="pw"; // memory allocate in string constant pool
        String s3=s2.concat("skills"); // memory store in heap area due to reference and in-built function
        String s4=new String("PWjava"); //memory store in heap area due to new keyword
        s4=s4.concat("skills"); // memore store in heap area due to reference and in-built funciton.
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        

        // now we use + operator
        String x1="PW";
        String x2="PW"+"Java";
        String x3="PW"+"java"+"Bangalore";
        String x4=x1+x2;
        String x5=x1+100+99;
       // String x6=x1.concat(100); // it gives error. int cannot be converted to string.
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        //System.out.println(x6);
    }
}