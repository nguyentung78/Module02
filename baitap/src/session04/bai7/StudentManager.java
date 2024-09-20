package session04.bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Student student : students) {
                student.displayData();
            }
        }
    }

    public void addStudent() {
        Student student = new Student();
        student.inputData();
        students.add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void updateStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        String studentId = sc.nextLine(); // Changed to String

        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("Nhập thông tin mới cho sinh viên:");
                student.inputData();
                System.out.println("Cập nhật thông tin thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã này.");
    }

    public void deleteStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String studentId = sc.nextLine();

        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                students.remove(student);
                System.out.println("Xóa sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã này.");
    }


    // Menu quản lý sinh viên
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("---- QUẢN LÝ SINH VIÊN ----");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã");
            System.out.println("4. Xóa sinh viên theo mã");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.displayStudents();
                    break;
                case 2:
                    manager.addStudent();
                    break;
                case 3:
                    manager.updateStudentById();
                    break;
                case 4:
                    manager.deleteStudentById();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 5);
    }
}

