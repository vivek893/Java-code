public class mutable_string2 {
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer();
        // System.out.println(sb.capacity());
        // sb.append("abcdefghijklmnop");
        // System.out.println(sb.capacity());
        // sb.append("s");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // StringBuffer sb2=new StringBuffer("sachin");
        // System.out.println(sb2);
        // System.out.println(sb2.capacity());
        // System.out.println(sb2.charAt(1));
        // sb2.setCharAt(1,'A');
        // System.out.println(sb2);

        // StringBuffer sb =new StringBuffer(150);// it means capacity size is 150 not 16
        // System.out.println(sb.capacity());
        // sb.append("java"); // length of java string is 4 only. means only 4 units of memory needed. 
        // sb.trimToSize(); // it basically remove wastge space from total space. like only 4 is required so 150-4=146 memory space remove and now capcity is 4
        // System.out.println(sb.capacity());

        StringBuffer sb=new StringBuffer("pw java");  // other object is not create. in same object it change. because it is mutable string
        System.out.println(sb);
        System.out.println(sb.reverse());
        String sv=new String("vivek"); // here other object is not create because it a immutable.in same object not change. so reverse() method not work here
        System.out.println(sv);
        //System.out.println(sv.reverse());

    }
    
}
