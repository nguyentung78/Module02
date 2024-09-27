package ra.business;

import java.util.Scanner;

public class Employee implements IEmployee {
    String id;
    String name;
    int years;
    float rate;
    float commission;
    float salary;
    boolean status;

    public Employee() {
    }

    public Employee(String id, String name, int years, float rate, float commission, float salary, boolean status) {
        this.id = id;
        this.name = name;
        this.years = years;
        this.rate = rate;
        this.commission = commission;
        this.salary = salary;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã nhân viên: ");
        this.id = scanner.nextLine();

        do{
            System.out.println("Nhập vào tên nhân viên (từ 6-50 kí tự): ");
            this.name = scanner.nextLine();
        }while (name.length()<6||name.length()>50);

        do {
            System.out.println("Nhập vào năm sinh nhân viên (trước 2000): ");
            this.years = Integer.parseInt(scanner.nextLine());
        } while (years>2000);

        do {
            System.out.println("nhập vào hệ số lương (phải lớn hơn 0): ");
            this.rate = Float.parseFloat(scanner.nextLine());
        } while (rate<0f);

        System.out.println("nhập vào hoa hồng của nhân viên: ");
        this.commission = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập vào trạng thái nhân viên (true – đang làm việc + false – Nghỉ việc): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Mã nhân viên: "+ this.id);
        System.out.println("Tên nhân viên: "+ this.name);
        System.out.println("Năm sinh nhân viên: "+ this.years);
        System.out.println("Hệ số lương của nhân viên: "+ this.rate);
        System.out.println("Hoa hồng của nhân viên: "+ this.commission);
        System.out.println("Lương nhân viên: "+ this.salary);
        System.out.println("Trạng thái nhân viên: "+ (this.status?"Đang làm việc" : "Nghỉ việc"));

    }
    public void calSalary(){
        this.salary = this.rate*this.BASIC_SALARY+this.commission;
        return;
    }

}
