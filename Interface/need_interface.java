// abstract class computer{  // abstract class is know as interface if, only abstract method present in that class only.
//     public abstract void compilecode();
// }
// class laptop extends computer{
//     public void compilecode(){
//         System.out.println("you got 5 error");
//     }
// }
// class desktop extends computer{
//     public void compilecode(){
//         System.out.println("you got 5 error,faster");
//     }
// }
interface computer{
    void compilecode();
}
class laptop implements computer{
    public void compilecode(){
        System.out.println("you got 5 error");
    }
}
class desktop implements computer{
    public void compilecode(){
        System.out.println("you got 5 error,faster");
    }
}
class Developer{
    // now create laptop object outside method
    //laptop obj=new laptop(); // second time me call it
    public void buildApp(computer obj){
        System.out.println("building App");
        // first creating obj of laptop
        //laptop obj=new laptop(); // frist point where object create
        obj.compilecode();
    }
}
public class need_interface {
    public static void main(String[] args){
        //laptop obj=new laptop(); // third time we creat laptop object
        //desktop obj=new desktop();
        computer obj=new desktop();
        Developer dev=new Developer();
        dev.buildApp(obj);
        

    }
    
}

// step1: writing code. first create developer class only write upto s.o.p("building app") don't call laptop class method
//step2: create laptop class because for writing code laptop is important. and when write code then it give compileerror.so create compilecode method
//step3: call compilecode method .in building app because when we develop app that time phasing error. so calling compilecode method . this is method of laptop class so we can access using laptop object
//step4: create object of laptop class in main method.  and pass in buildapp method in both class developer as well as main method clasa
//step5: now we need to computer not laptop so, we create a class of desktop and class computer class object same as laptop and inplace of laptop in buildapp method write desktop because you pass desktop class object
// step6: create a parent class that is computer. computer means desktop and laptop both
//step7: inherit the property in laptop and desktop of computer class and create object of parent class means computer class and pass computer class in buildapp(computer.obj)
//step8: in computer class compilercode() is only function not written anything in-between body. so we used abstract and for class we used abstract class
// step9: if class is abstract and function is abstract function then we use interface. because condition for interface is same. 
//step10: after using interface we use implements function and implement the interface .