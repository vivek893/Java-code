import java.util.Scanner;
public class first {
    public static void main(String[] args){
        int sum=0;
        Scanner Scanner = new Scanner(System.in);
        String name=Scanner.nextLine();
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Character.getNumericValue(ch);
            }
           /*  if(ch=='0'){
                sum+=0;
            }
            else if(ch=='1'){
                sum+=1;
            }
            else if(ch=='2'){
                sum+=2;
            }
            else if(ch=='3'){
                sum+=3;
            }
            else if(ch=='4'){
                sum+=4;
            }
            else if(ch=='5'){
                sum+=5;
            }
            else if(ch=='6'){
                sum+=6;
            }
            else if(ch=='7'){
                sum+=7;
            }
            else if(ch=='8'){
                sum+=8;
            }
            else if(ch=='9'){
                sum+=9;
            }*/
        }
        if(sum<=15){
            System.out.println(sum);
        }
        else{
            System.out.println("No digit");
        }

    }
    
}
