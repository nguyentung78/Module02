package session04;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentGender;
    private String address;
    private double phone;

    public Bai5() {
    }

    public Bai5(String studentId, String studentName, int studentAge, String studentGender, String address, double phone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        studentId = sc.nextLine();
        System.out.print("Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Student Age: ");
        studentAge = Integer.parseInt(sc.nextLine());
        System.out.print("Student Gender: ");
        studentGender = sc.nextLine();
        System.out.print("Student Address: ");
        address = sc.nextLine();
        System.out.print("Student Phone: ");
        phone = Double.parseDouble(sc.nextLine());
    }

    public void displayData() {
        System.out.println("Student ID: " + studentId + "\nStudent Name: " + studentName + "\nStudent Age: " + studentAge + "\nStudent Gender: " + studentGender + "\nStudent Address: " + address + "\nPhone Number: " + phone);
    }
}
    class studentManager {
        private ArrayList<Bai5> students = new ArrayList<>();
        public void displayStudent(){
            if (students.isEmpty()) {
                System.out.println("No students found");
            } else {
                for (Bai5 student : students) {
                    student.displayData();
                }
            }
        }
        public void addStudent(){
            Bai5 student = new Bai5();
            student.inputData();
            students.add(student);
            System.out.println("Student Added");
        }
        public void editStudent(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Student ID need edit: ");
            String studentId = sc.nextLine();
            for (Bai5 student : students) {
                if (student.getStudentId().equals(studentId)) {
                    System.out.println("Enter new student name");
                    student.setStudentName(sc.nextLine());
                    System.out.println("Enter new student age");
                    student.setStudentAge(Integer.parseInt(sc.nextLine()));
                    System.out.println("Enter new student gender");
                    student.setStudentGender(sc.nextLine());
                    System.out.println("Enter new student address");
                    student.setAddress(sc.nextLine());
                    System.out.println("Enter new student phone");
                    student.setPhone(Double.parseDouble(sc.nextLine()));
                    System.out.println("Edit successful");
                    return;
                }
            }
            System.out.println("StudentID not found");
        }
        public void deleteStudent(){
            Scanner sc = new Scanner(System.in);
            System.out.println("student ID need delete: ");
            String studentId = sc.nextLine();
            for (Bai5 student : students) {
                if (student.getStudentId().equals(studentId)) {
                    students.remove(student);
                    System.out.println("Student Deleted");
                    return;
                }
            }
            System.out.println("StudentID not found");
        }

        public static void main(String[] args) {
            studentManager manager = new studentManager();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("---- QUẢN LÝ HỌC SINH ----");
                System.out.println("1. Hiển thị danh sách học sinh");
                System.out.println("2. Thêm mới học sinh");
                System.out.println("3. Sửa thông tin học sinh");
                System.out.println("4. Xóa học sinh");
                System.out.println("5. Thoát");
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        manager.displayStudent();
                        break;
                    case 2:
                        manager.addStudent();
                        break;
                    case 3:
                        manager.editStudent();
                        break;
                    case 4:
                        manager.deleteStudent();
                        break;
                    case 5:
                        System.out.println("Exit Program");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
            while (choice != 5) ;
        }
    }
