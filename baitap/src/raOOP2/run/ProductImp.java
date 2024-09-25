package raOOP2.run;

import raOOP2.entity.Product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductImp {
    Product[] arrProduct = new Product[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductImp productImp = new ProductImp();
        do {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productImp.inputProducts(scanner);
                    break;
                case 2:
                    productImp.displayProducts();
                    break;
                case 3:
                    productImp.calculateProfit();
                    break;
                case 4:
                    productImp.sortProductsByProfit();
                    break;
                case 5:
                    productImp.statisticsByPrice(scanner);
                    break;
                case 6:
                    productImp.searchProductByName(scanner);
                    break;
                case 7:
                    productImp.importProduct(scanner);
                    break;
                case 8:
                    productImp.sellProduct(scanner);
                    break;
                case 9:
                    productImp.updateProductStatus(scanner);
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-10");
            }
        } while (true);
    }

    public void inputProducts(Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm cần thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            arrProduct[currentIndex] = new Product();
            arrProduct[currentIndex].inputData(scanner, arrProduct, currentIndex);
            currentIndex++;
        }
    }

    public void displayProducts() {
        for (int i = 0; i < currentIndex; i++) {
            arrProduct[i].displayData();
        }
    }

    public void calculateProfit() {
        for (int i = 0; i < currentIndex; i++) {
            arrProduct[i].calProfit();
        }
        System.out.println("Lợi nhuận đã được tính.");
    }

    public void sortProductsByProfit() {
        Arrays.sort(arrProduct, 0, currentIndex, (p1, p2) -> Float.compare(p2.getProfit(), p1.getProfit()));
        System.out.println("Đã sắp xếp sản phẩm theo lợi nhuận giảm dần.");
    }

    public void statisticsByPrice(Scanner scanner) {
        System.out.print("Nhập khoảng giá từ: ");
        float fromPrice = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập khoảng giá đến: ");
        float toPrice = Float.parseFloat(scanner.nextLine());
        System.out.printf("Sản phẩm trong khoảng giá từ %.2f đến %.2f:\n", fromPrice, toPrice);
        for (int i = 0; i < currentIndex; i++) {
            if (arrProduct[i].getExportPrice() >= fromPrice && arrProduct[i].getExportPrice() <= toPrice) {
                arrProduct[i].displayData();
            }
        }
    }

    public void searchProductByName(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < currentIndex; i++) {
            if (arrProduct[i].getProductName().equalsIgnoreCase(name)) {
                arrProduct[i].displayData();
                found = true;
            }
        }
        if (!found) {
            System.err.println("Không tìm thấy sản phẩm với tên: " + name);
        }
    }

    public void importProduct(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần nhập: ");
        String productId = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm cần nhập: ");
        int amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (arrProduct[i].getProductId().equals(productId)) {
                arrProduct[i].setQuantity(arrProduct[i].getQuantity() + amount);
                System.out.println("Số lượng đã được cập nhật.");
                return;
            }
        }
        System.err.println("Mã sản phẩm không tồn tại.");
    }

    public void sellProduct(Scanner scanner) {
        System.out.print("Nhập tên sản phẩm cần bán: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm cần bán: ");
        int amount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (arrProduct[i].getProductName().equalsIgnoreCase(name)) {
                if (arrProduct[i].getQuantity() >= amount) {
                    arrProduct[i].setQuantity(arrProduct[i].getQuantity() - amount);
                    System.out.println("Số lượng sản phẩm đã được cập nhật.");
                } else {
                    System.err.println("Không đủ số lượng sản phẩm để bán.");
                }
                return;
            }
        }
        System.err.println("Tên sản phẩm không tồn tại.");
    }

    public void updateProductStatus(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm cần cập nhật trạng thái: ");
        String productId = scanner.nextLine();
        for (int i = 0; i < currentIndex; i++) {
            if (arrProduct[i].getProductId().equals(productId)) {
                arrProduct[i].setStatus(!arrProduct[i].isStatus());
                System.out.println("Trạng thái sản phẩm đã được cập nhật.");
                return;
            }
        }
        System.err.println("Mã sản phẩm không tồn tại.");
    }
}
