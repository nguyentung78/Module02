package raCOLLECTIONS.businessImp;

import raCOLLECTIONS.IShop;

import java.io.Serializable;
import java.util.Scanner;

public class Categories implements IShop {

    private int Id;
    private String Name;
    private String Description;
    private boolean Status;

    // Constructor không tham số
    public Categories() {
    }

    // Constructor có tham số
    public Categories(int id, String name, String description, boolean status) {
        Id = id;
        Name = name;
        Description = description;
        Status = status;
    }

    // Getter và Setter
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Nhập ID danh mục: ");
        this.Id = scanner.nextInt();
        scanner.nextLine(); // Nhận vào dòng trống
        System.out.print("Nhập tên danh mục: ");
        this.Name = scanner.nextLine();
        System.out.print("Nhập mô tả danh mục: ");
        this.Description = scanner.nextLine();
        System.out.print("Trạng thái (true/false): ");
        this.Status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        // Hiển thị thông tin danh mục
        System.out.println("ID: " + Id);
        System.out.println("Tên: " + Name);
        System.out.println("Mô tả: " + Description);
        System.out.println("Trạng thái: " + (Status ? "Hoạt động" : "Không hoạt động"));
    }
}
