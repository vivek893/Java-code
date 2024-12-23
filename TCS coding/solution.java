import java.util.Scanner;

class Account{
    int id;
    double balance;
    double interestRate;
    // counstructor of class Account
    public Account(int id,double balance, double interestRate){
        this.id=id;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    //getter function
    public int getid(){
        return id;
    }
    public double getbalance(){
        return balance;
    }
    public double getinterestRate(){
        return interestRate;
    }
    // setter function
    public void setid(int id){
        this.id=id;

    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public void setinterestRate(double interestRate){
        this.interestRate=interestRate;
    }

}
public class solution {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int id=Scanner.nextInt();
        double balance=Scanner.nextDouble();
        double interestRate=Scanner.nextDouble();
        Account account=new Account(id,balance,interestRate);
        int noofyear=Scanner.nextInt();
        double interestamount=calculateinterest(account,noofyear);
        //interestamount = Math.round(interestamount * 1000.0) / 1000.0;

        // Displaying with three decimal places, even if trailing zeros are needed
        System.out.println(String.format("%.3f", interestamount));
        
        
    }
    public static double calculateinterest(Account account,int noofyear){
        double initialinterestRate=account.getinterestRate();
        double additionalinterestRate=initialinterestRate*(noofyear/100.0);
        double finalinterestRate=additionalinterestRate+initialinterestRate;
        System.out.println(finalinterestRate);
        double interestamount=(account.getbalance()*finalinterestRate)/100;
        
        return interestamount;
    }
    
}
