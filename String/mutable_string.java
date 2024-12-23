public class mutable_string {
    public static void main(String[] args) {
        //StringBuffer sb=new StringBuffer("vivek");
        //System.out.println(sb);
        // StringBuffer sb="vivek"; // this is invalid syntex
        //sb.append("kumar");
        //System.out.println(sb);

        StringBuilder sb=new StringBuilder("vivek");
        System.out.println(sb);
        // StringBuffer sb="vivek"; // this is invalid syntex
        sb.append("kumar");
        System.out.println(sb);

        // final vs immutable
        int a=10;
        a=20;
        System.out.println(a);
        // but
        final int b=10;
        //b=20; // final local variable b can't assign
        System.err.println(b);

        // immutable 
        StringBuffer sv=new StringBuffer("vivek"); // sv is reference variable that reference to vivek kumar object
        sv.append("kumar");
        System.out.println(sv);
        sv=new StringBuffer("sachine"); // now sv is reference to sachine object. it can hold other object address. because final keyword is not added here
        System.out.println(sv);

        final StringBuffer sm=new StringBuffer("vishal"); // sm is reference variable that reference to vishal pal object
        sm.append("pal");
        System.out.println(sm);
        //sm=new StringBuffer("other persone"); // now sm is not address other person object. because final keyword used. so final keyword impact of reference variable not on object
        System.out.println(sm);


    }
    
}
