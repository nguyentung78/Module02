package session07.Bai5;

public class Run {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("tung", 8);
        Employee partTime = new PartTimeEmployee("thanh", 20,4);
        System.out.println("nhân viên tên: "+fullTime.getName()+" có số lương là: "+fullTime.calculateSalary());
        System.out.println("nhân viên tên: "+partTime.getName()+ " có số lương là: "+partTime.calculateSalary());
    }
}
