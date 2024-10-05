package session08.Bai4.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    private List<Student> students;
    public StudentManagement() {
        students = new ArrayList<>();
    }
    public void show(){
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống");
        } else {
            System.out.println("Danh sách sinh viên");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Đã thêm sinh viên: "+ student.getStudentName());
    }
    public void removeStudent(int studentId) {
        Student studentRemove = findStudentById(studentId);
        if (studentRemove != null) {
            students.remove(studentRemove);
        }
        System.out.println("Đã xóa sinh viên có mã "+studentId);
    }
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        System.out.println("Ko tìm thấy mã sinh viên");
        return null;
    }
    public Double getAverageScore(){
        if (students.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (Student student : students) {
            sum +=student.getAverageScore();
        }
        return sum / students.size();
    }
    public void sortByScore(){
        List<Student> originalList = new ArrayList<>(students);
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
        show();
        students = originalList;
    }
}
