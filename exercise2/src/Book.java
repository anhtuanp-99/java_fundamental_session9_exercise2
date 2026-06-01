import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private double price;

    Scanner scanner = new Scanner(System.in);
    // constructor
    public Book(){
        this.title = "Chưa đặt tên";
        this.author = "Chưa có tác giả";
        this.price = 0.0;
    }

    public Book(String title, String author, double price){
        this.price = price;
        this.title = title;
        this.author = author;
    }

    // geters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    // setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor() {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // printInfo
    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
