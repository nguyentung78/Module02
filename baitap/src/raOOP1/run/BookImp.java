package raOOP1.run;

import raOOP1.entity.Book;

import java.util.Arrays;
import java.util.Scanner;

public class BookImp {
    Book[] arrBooks = new Book[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookImp bookImp = new BookImp();
        do {
            System.out.println("*********************MENU******************");
            System.out.println("1. Nhập thông tin n sách (n nhập từ bàn phím)");
            System.out.println("2. Tính lợi nhuận các sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá bán tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách (tên sách nhập từ bàn phím)");
            System.out.println("7. Thống kê số lượng sách theo năm xuất bản");
            System.out.println("8. Thống kê số lượng sách theo tác giả");
            System.out.println("9. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookImp.inputBooks(scanner);
                    break;
                case 2:
                    bookImp.calculateProfit();
                    break;
                case 3:
                    bookImp.displayBooks();
                    break;
                case 4:
                    bookImp.sortBooksByExportPrice();
                    break;
                case 5:
                    bookImp.sortBooksByInterest();
                    break;
                case 6:
                    bookImp.searchBookByName(scanner);
                    break;
                case 7:
                    bookImp.statisticsByYear();
                    break;
                case 8:
                    bookImp.statisticsByAuthor();
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-9");
            }
        } while (true);
    }

    public void inputBooks(Scanner scanner) {
        System.out.print("Nhập số lượng sách cần thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrBooks[currentIndex] = new Book();
            arrBooks[currentIndex].inputData(scanner, arrBooks, currentIndex);
            currentIndex++;
        }
    }

    public void calculateProfit() {
        for (int i = 0; i < currentIndex; i++) {
            arrBooks[i].setInterest(arrBooks[i].getExportPrice() - arrBooks[i].getImportPrice());
        }
        System.out.println("Lợi nhuận đã được tính.");
    }

    public void displayBooks() {
        for (int i = 0; i < currentIndex; i++) {
            arrBooks[i].displayData();
        }
    }

    public void sortBooksByExportPrice() {
        Arrays.sort(arrBooks, 0, currentIndex, (b1, b2) -> Float.compare(b1.getExportPrice(), b2.getExportPrice()));
        System.out.println("Đã sắp xếp sách theo giá bán tăng dần.");
    }

    public void sortBooksByInterest() {
        Arrays.sort(arrBooks, 0, currentIndex, (b1, b2) -> Float.compare(b2.getInterest(), b1.getInterest()));
        System.out.println("Đã sắp xếp sách theo lợi nhuận giảm dần.");
    }

    public void searchBookByName(Scanner scanner) {
        System.out.print("Nhập tên sách cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (arrBooks[i].getBookName().equalsIgnoreCase(name)) {
                arrBooks[i].displayData();
                found = true;
            }
        }
        if (!found) {
            System.err.println("Không tìm thấy sách với tên: " + name);
        }
    }

    public void statisticsByYear() {
        System.out.println("Thống kê số lượng sách theo năm xuất bản:");
        int[] years = Arrays.stream(arrBooks)
                .filter(book -> book != null)
                .mapToInt(Book::getYear)
                .distinct()
                .toArray();
        for (int year : years) {
            long count = Arrays.stream(arrBooks)
                    .filter(book -> book != null && book.getYear() == year)
                    .count();
            System.out.printf("Năm %d: %d sách\n", year, count);
        }
    }

    public void statisticsByAuthor() {
        System.out.println("Thống kê số lượng sách theo tác giả:");
        String[] authors = Arrays.stream(arrBooks)
                .filter(book -> book != null)
                .map(Book::getAuthor)
                .distinct()
                .toArray(String[]::new);
        for (String author : authors) {
            long count = Arrays.stream(arrBooks)
                    .filter(book -> book != null && book.getAuthor().equals(author))
                    .count();
            System.out.printf("Tác giả %s: %d sách\n", author, count);
        }
    }
}
