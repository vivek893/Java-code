import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner Scanner =new Scanner(System.in);
        Book[] book=new Book[4];
        for(int i=0;i<4;i++){
            int id=Scanner.nextInt();
            Scanner.nextLine();
            String title=Scanner.nextLine();
            String author=Scanner.nextLine();
            double price=Scanner.nextDouble();
            book[i]=new Book(id,title,author,price);
        }
        Scanner.close();
        Book[] sortedbook=sortBooksByPrice(book);
        for(Book b:sortedbook){
            System.out.println(b);
            
        }
        
    }
    public static Book[] sortBooksByPrice(Book[] book){

        Arrays.sort(book,(d1,d2)-> Double.compare(d1.getprice(), d2.getprice()));
        return book;
        
    }
}
class Book{
    int id;
    String title;
    String author;
    double price;
    public Book(int id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public int getid(){
        return id;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public double getprice(){
        return price;
        
    }
}