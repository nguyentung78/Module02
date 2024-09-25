package raOOP2.entity;

import java.util.Scanner;

public class Product {
    private String productId;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;

    public Product() {
    }

    public Product(String productId, String productName, float importPrice, float exportPrice, int quantity, String descriptions, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.descriptions = descriptions;
        this.status = status;
        this.profit = exportPrice - importPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData(Scanner scanner, Product[] arrProduct, int currentIndex) {
        this.productId = inputProductId(scanner, arrProduct, currentIndex);
        this.productName = inputProductName(scanner);
        this.importPrice = inputImportPrice(scanner);
        this.exportPrice = inputExportPrice(scanner, this.importPrice);
        this.quantity = inputQuantity(scanner);
        System.out.print("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();
        this.status = inputStatus(scanner);
        this.profit = this.exportPrice - this.importPrice;
    }

    private String inputProductId(Scanner scanner, Product[] arrProduct, int currentIndex) {
        System.out.println("Nhập mã sản phẩm (4 ký tự):");
        do {
            String productId = scanner.nextLine();
            boolean isExist = false;
            for (int i = 0; i < currentIndex; i++) {
                if (arrProduct[i].getProductId().equals(productId)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist && productId.matches("[\\w]{4}")) {
                return productId;
            } else {
                System.err.println("Mã sản phẩm không hợp lệ hoặc đã tồn tại, vui lòng nhập lại.");
            }
        } while (true);
    }

    private String inputProductName(Scanner scanner) {
        System.out.println("Nhập tên sản phẩm (6-50 ký tự):");
        do {
            String productName = scanner.nextLine();
            if (productName.length() >= 6 && productName.length() <= 50) {
                return productName;
            } else {
                System.err.println("Tên sản phẩm phải có từ 6-50 ký tự, vui lòng nhập lại.");
            }
        } while (true);
    }

    private float inputImportPrice(Scanner scanner) {
        System.out.println("Nhập giá nhập sản phẩm:");
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
        System.out.println("Nhập giá xuất sản phẩm (phải lớn hơn ít nhất 20% so với giá nhập):");
        do {
            float price = Float.parseFloat(scanner.nextLine());
            if (price > importPrice * 1.2) {
                return price;
            } else {
                System.err.println("Giá xuất phải lớn hơn ít nhất 20% so với giá nhập, vui lòng nhập lại.");
            }
        } while (true);
    }

    private int inputQuantity(Scanner scanner) {
        System.out.println("Nhập số lượng sản phẩm:");
        do {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (quantity > 0) {
                return quantity;
            } else {
                System.err.println("Số lượng sản phẩm phải lớn hơn 0, vui lòng nhập lại.");
            }
        } while (true);
    }

    private boolean inputStatus(Scanner scanner) {
        System.out.println("Nhập trạng thái sản phẩm (true: Đang bán, false: Không bán):");
        do {
            String statusInput = scanner.nextLine();
            if (statusInput.equalsIgnoreCase("true") || statusInput.equalsIgnoreCase("false")) {
                return Boolean.parseBoolean(statusInput);
            } else {
                System.err.println("Vui lòng nhập đúng kiểu dữ liệu (true/false).");
            }
        } while (true);
    }

    public void displayData() {
        System.out.printf("Mã sản phẩm: %s - Tên sản phẩm: %s - Giá nhập: %.2f - Giá xuất: %.2f\n", this.productId, this.productName, this.importPrice, this.exportPrice);
        System.out.printf("Số lượng: %d - Mô tả: %s - Trạng thái: %s\n", this.quantity, this.descriptions, this.status ? "Đang bán" : "Không bán");
        System.out.printf("Lợi nhuận: %.2f\n", this.profit);
    }

    public void calProfit() {
        this.profit = this.exportPrice - this.importPrice;
    }
}
