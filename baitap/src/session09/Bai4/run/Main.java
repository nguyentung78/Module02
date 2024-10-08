package session09.Bai4.run;
import session09.Bai4.entity.Student;
import session09.Bai4.entity.StudentManagement;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StudentManagement studentManagement = new StudentManagement();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showAllStudents();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    findStudent();
                    break;
                case 5:
                    calculateAverageScore();
                    break;
                case 6:
                    sortStudentsByScore();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Tùy chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n1. Thêm sinh viên");
        System.out.println("2. Hiển thị tất cả sinh viên");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Tìm sinh viên theo mã số");
        System.out.println("5. Tính điểm trung bình của tất cả sinh viên");
        System.out.println("6. Sắp xếp sinh viên theo điểm trung bình");
        System.out.println("7. Thoát");
        System.out.print("Chọn một tùy chọn: ");
    }

    private static void addStudent() {
        System.out.print("Nhập mã số sinh viên: ");
        int id = sc.nextInt();
        sc.nextLine(); // Đọc dòng mới
        System.out.print("Nhập họ và tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double score = sc.nextDouble();
        studentManagement.addStudent(new Student(id, name, score));
    }

    private static void showAllStudents() {
        studentManagement.show();
    }

    private static void removeStudent() {
        System.out.print("Nhập mã số sinh viên để xóa: ");
        int removeId = sc.nextInt();
        studentManagement.removeStudent(removeId);
    }

    private static void findStudent() {
        System.out.print("Nhập mã số sinh viên để tìm: ");
        int findId = sc.nextInt();
        studentManagement.findStudentById(findId);
    }

    private static void calculateAverageScore() {
        double averageScore = studentManagement.getAverageScore();
        System.out.println("Điểm trung bình của tất cả sinh viên: " + averageScore);
    }

    private static void sortStudentsByScore() {
        studentManagement.sortByScore();
        studentManagement.show(); // Hiển thị danh sách đã sắp xếp
    }
}
