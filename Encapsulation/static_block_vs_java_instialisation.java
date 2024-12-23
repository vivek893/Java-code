public class static_block_vs_java_instialisation {
    static int age;
    static{
        System.out.println("static block");
        age=10;
    }
    static void display(){
        System.out.println("display static method");
    }
    public static void main(String[] args){
        System.out.println("main method");
        display();

    }
    
}

// first call static initialisation then call main method then call static method. 
