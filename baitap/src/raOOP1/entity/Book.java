package raOOP1.entity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest; // Lợi nhuận sách
    private int year;

    public Book() {
    }

    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.year = year;
        this.interest = exportPrice - importPrice;  // Tính lợi nhuận
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputData(Scanner scanner, Book[] arrBooks, int currentIndex) {
        this.bookId = inputBookId(scanner, arrBooks, currentIndex);
        this.bookName = inputBookName(scanner);
        this.importPrice = inputImportPrice(scanner);
        this.exportPrice = inputExportPrice(scanner, this.importPrice);
        this.author = inputAuthor(scanner);
        this.year = inputYear(scanner);
        this.interest = this.exportPrice - this.importPrice;
    }

    private String inputBookId(Scanner scanner, Book[] arrBooks, int currentIndex) {
        System.out.println("Nhập mã sách:");
        do {
            String bookId = scanner.nextLine();
            boolean isExist = false;
            for (int i = 0; i < currentIndex; i++) {
                if (arrBooks[i].getBookId().equals(bookId)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist && bookId.matches("B[\\w]{3}")) {
                return bookId;
            } else {
                System.err.println("Mã sách không hợp lệ hoặc đã tồn tại, vui lòng nhập lại.");
            }
        } while (true);
    }

    private String inputBookName(Scanner scanner) {
        System.out.println("Nhập tên sách (bắt đầu bằng B, 4 ký tự):");
        do {
            String bookName = scanner.nextLine();
            if (bookName.matches("B.{3}")) {
                return bookName;
            } else {
                System.err.println("Tên sách không đúng định dạng, vui lòng nhập lại.");
            }
        } while (true);
    }

    private float inputImportPrice(Scanner scanner) {
        System.out.println("Nhập giá nhập sách:");
        do {
            float price = Float.parseFloat(scanner.nextLine());
            if (price > 0) {
                return price;
            } else {
                System.err.println("Giá nhập phải lớn hơn 0, vui lòng nhập lại.");
            }
        } while (true);
    }

    private float inputExportPrice(Scanner scanner, float importPrice) {
        System.out.println("Nhập giá xuất sách:");
        do {
            float price = Float.parseFloat(scanner.nextLine());
            if (price > importPrice * 1.3) {
                return price;
            } else {
                System.err.println("Giá xuất phải lớn hơn ít nhất 30% so với giá nhập, vui lòng nhập lại.");
            }
        } while (true);
    }

    private String inputAuthor(Scanner scanner) {
        System.out.println("Nhập tên tác giả (6-50 ký tự):");
        do {
            String author = scanner.nextLine();
            if (author.length() >= 6 && author.length() <= 50) {
                return author;
            } else {
                System.err.println("Tên tác giả phải có từ 6-50 ký tự, vui lòng nhập lại.");
            }
        } while (true);
    }

    private int inputYear(Scanner scanner) {
        System.out.println("Nhập năm xuất bản (sau năm 2000):");
        do {
            int year = Integer.parseInt(scanner.nextLine());
            if (year > 2000) {
                return year;
            } else {
                System.err.println("Năm xuất bản phải sau năm 2000, vui lòng nhập lại.");
            }
        } while (true);
    }
    public void displayData() {
        System.out.printf("Mã sách: %s - Tên sách: %s - Giá nhập: %.2f - Giá xuất: %.2f\n", this.bookId, this.bookName, this.importPrice, this.exportPrice);
        System.out.printf("Tác giả: %s - Năm xuất bản: %d - Lợi nhuận: %.2f\n", this.author, this.year, this.interest);
    }
}
