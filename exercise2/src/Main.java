import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
//        Book book1 = new Book("Thao túng tâm lý", "Anh Tuấn", 350000);
//        book1.printInfo();

        System.out.print("Nhập số lượng sách cần điền: ");
        int amount = SCANNER.nextInt();
        SCANNER.nextLine();

        Book[] books = new Book[amount];

        // nhập thông tin
        for (int i = 0; i < amount; i++){
            System.out.println("\nNhập sách thứ " + (i + 1));
            System.out.print("Nhập tiêu đề: ");
            String title = SCANNER.nextLine();
            System.out.print("Nhập tác giả: ");
            String author = SCANNER.nextLine();
            System.out.print("Nhập giá: ");
            double price = SCANNER.nextDouble();
            SCANNER.nextLine();

            books[i] = new Book(title, author, price);
        }

        System.out.println("\n----- LIST OF BOOK -----");
        for (int i = 0; i < amount; i++){
            books[i].printInfo();
            System.out.println();
        }

        System.out.println(books[1].getPrice());
        System.out.println(books[2].getAuthor());

        SCANNER.close();
    }
}
