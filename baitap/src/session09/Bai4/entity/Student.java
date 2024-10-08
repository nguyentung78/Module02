package session09.Bai4.entity;

public class Student {
    private int studentId;
    private String studentName;
    private Double averageScore;
    public Student(){

    }

    public Student(int studentId, String studentName, Double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Double averageScore) {
        this.averageScore = averageScore;
    }

    public String toString(){
        return "Mã sinh viên: "+studentId+", Tên sinh viên: "+studentName+", Điểm trung bình: "+averageScore;
    }
}
