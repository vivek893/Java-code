public class mutable_immutable {
    public static void main(String[] args) {
        // immutable string
        String name="vivek";
        String name1="vivek"; // memory allocate in Scp(string constant pool) but new object not create because duplicate are not allowed
        String s1=new String("vivek kumar"); //memory allocate in heap area and new object create and reference variable poin s1;
        String s2=new String("vivek kumar"); // memory allocate in heap area and new object create and reference variable poin s2;
        System.out.println(name==name1); // true because both are referning same object
        System.out.println("name without trying to change "+name);
        System.out.println("new object no create in SCp "+name1);
        System.out.println("create string using new keyword "+s1);
        System.out.println("create in heap area "+ s2);
        System.out.println(s1==s2); // false becuase both are refering different object.
        name.concat("pal"); // trying to change the string. for immutable string we used concat function means concatination
        System.out.println("name after trying to change "+name);
        // mutable string 
        StringBuilder str=new StringBuilder("vivek");
        System.out.println("name without trying to change "+str);
        str.append("pal"); // trying to change the string value. for mutable string we used append function not used concat function
        System.out.println("name after changing "+str);
    }
    
}
