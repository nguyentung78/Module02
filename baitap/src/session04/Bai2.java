package session04;

import java.util.Scanner;

public class Bai2 {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean sex;
    private float rate;
    private float salary;

    public Bai2(){

    }
    public Bai2(String employeeId, String employeeName, boolean sex, int age, float rate, float salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.sex = sex;
        this.age = age;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void calSalary(){
        salary = rate * 1300000;
    }

    public void inputData(Scanner sc){
        System.out.println("Employee Id: ");
        this.employeeId = sc.nextLine();
        System.out.println("Employee Name: ");
        this.employeeName = sc.nextLine();
        System.out.println("Age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Sex: ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Rate: ");
        this.rate = Float.parseFloat(sc.nextLine());
    }

    public void displayData(){
        System.out.printf("mã NV: %s, tên Nv: %s, tuổi: %d, giới tính: %s, hệ số lương: %f, lương: %f", this.employeeId, this.employeeName, this.age, this.sex ? "nam" : "nữ", this.rate, this.salary);

    }

    public static void main(String[] args) {
        Bai2 emp = new Bai2();
        emp.inputData(new Scanner(System.in));
        emp.calSalary();
        emp.displayData();

    }

}
