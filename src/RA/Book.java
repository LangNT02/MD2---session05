package RA;

import java.util.Scanner;

public class Book {
    /*
     * Xây dựng lớp Book trong package ra.entity gồm:
     * - Các thuộc tính:
     *   + Mã sách: int
     *   + tên sách: String
     *   + tác giả: String
     *   + giá sách: float
     *   + tiêu đề: String
     *   + Số trang: int
     *   + Nhà xuất bản: String
     *   + Trạng thái sách: boolean (true - còn sách, false - Hết sách)
     * - Có 2 constructor: default và khởi tạo tất cả thông tin sách
     * - Có các phương thức getter/setter
     * - Có phương thức inputData(Scanner scanner): nhập thông tin sách
     * - Có phương thức displayData(): hiển thị thông tin sách
     * Xây dựng lớp BookManagement trong package ra.run thực hiện:
     * - Khởi tạo đối tượng Book mà không khởi tạo bất cứ thông tin gì
     * - Hiển thị menu và thực hiện các chức năng theo menu:
     * *********************MENU*********************
     * 1. Nhập thông tin đối tượng sách
     * 2. Hiển thị thông tin sách
     * 3. Hiển thị giá sách
     * 4. Hiển thị tên tác giả
     * 5. Cập nhật số trang sách
     * 6. Cập nhật nhà xuất bản
     * 7. Thoát
     *
     * */
     private int bookId;
     private String bookName;
     private  String authorName;
     private float price;
     private String title;
     private int pageCount;
     private String publisher;
     private boolean bookStatus;

     public Book() {}

    public Book(int bookId, String bookName, String authorName, float price, String title, int pageCount, String publisher, boolean bookStatus) {
         this.bookId = bookId;
         this.bookName = bookName;
         this.authorName = authorName;
         this.price = price;
         this.title = title;
         this.pageCount = pageCount;
         this.publisher = publisher;
         this.bookStatus = bookStatus;
    }
    public int getBookId() {
         return bookId;
    }
    public void setBookId(int bookId) {
         this.bookId = bookId;
    }
    public String getBookName() {
         return bookName;
    }
    public void setBookName(String bookName) {
         this.bookName = bookName;
    }
    public String getAuthorName() {
         return authorName;
    }
    public void setAuthorName(String authorName) {
         this.authorName = authorName;
    }
    public float getPrice() {
         return price;
    }
    public void setPrice(float price) {
         this.price = price;
    }
    public String getTitle() {
         return title;
    }
    public void setTitle(String title) {
         this.title = title;
    }
    public int getPageCount() {
         return pageCount;
    }
    public void setPageCount(int pageCount) {
         this.pageCount = pageCount;
    }
    public String getPublisher() {
         return publisher;
    }
    public void setPublisher(String publisher) {
         this.publisher = publisher;
    }
    public boolean isBookStatus() {
         return bookStatus;
    }
    public void setBookStatus(boolean bookStatus) {
         this.bookStatus = bookStatus;
    }

    public void inputData(Scanner scanner) {
         System.out.print("Book ID: ");
         this.bookId = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Book Name: ");
         this.bookName = scanner.nextLine();

         System.out.print("Author Name: ");
         this.authorName = scanner.nextLine();

         System.out.print("Price: ");
         this.price = scanner.nextFloat();
         scanner.nextLine();

         System.out.print("Title: ");
         this.title = scanner.nextLine();

         System.out.print("Page Count: ");
         this.pageCount = scanner.nextInt();
         scanner.nextLine();

         System.out.print("Publisher: ");
         this.publisher = scanner.nextLine();

        System.out.println("book status (true for available, false for not available): ");
        this.bookStatus = scanner.nextBoolean();
     }
    public void displayData() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Author: " + this.authorName);
        System.out.println("Price: " + this.price);
        System.out.println("Title: " + this.title);
        System.out.println("Page Count: " + this.pageCount);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Book Status: " + (this.bookStatus ? "Available" : "Not Available"));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        while (true) {
            System.out.println("*********************MENU*********************");
            System.out.println("1. Nhập thông tin đối tượng sách");
            System.out.println("2. Hiển thị thông tin sách");
            System.out.println("3. Hiển thị giá sách");
            System.out.println("4. Hiển thị tên tác giả");
            System.out.println("5. Cập nhật số trang sách");
            System.out.println("6. Cập nhật nhà xuất bản");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin đối tượng sách: ");
                    book.inputData(scanner);
                    System.out.println("Đã nhập thông tin sách thành công.");
                    break;
                case 2:
                    System.out.println("Hiển thị thông tin sách: ");
                    book.displayData();
                    break;
                case 3:
                    System.out.println("Book Price: " + book.getPrice());
                    break;
                case 4:
                    System.out.println("Author: " + book.getAuthorName());
                    break;
                case 5:
                    System.out.println("Cập nhật số trang sách: ");
                    int newpageCount = scanner.nextInt();
                    book.setPageCount (newpageCount);
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Cập nhật nhà xuất bản: ");
                    String newPublisher = scanner.nextLine();
                    book.setPublisher(newPublisher);
                    break;
                case 7:
                    System.out.println("Thoát");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
