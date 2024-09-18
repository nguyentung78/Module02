package session03;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai9 {
    public static boolean kiemTraEmail(String emailNguoiDung) {
        String mauEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern mauKiemTra = Pattern.compile(mauEmail);
        Matcher soKhop = mauKiemTra.matcher(emailNguoiDung);
        return soKhop.matches();
    }
    public static boolean kiemTraMatKhau(String matKhauNguoiDung) {
        String mauMatKhau = "^(?!.*\\s).{7,}$";
        Pattern mauKiemTra = Pattern.compile(mauMatKhau);
        Matcher soKhop = mauKiemTra.matcher(matKhauNguoiDung);
        return soKhop.matches();
    }
    public static void main(String[] args) {
        String email = "test@example.com";
        String matKhau = "matkhau123";
        if (kiemTraEmail(email)) {
            System.out.println("Email hợp lệ.");
        } else {
            System.out.println("Email không hợp lệ.");
        }
        if (kiemTraMatKhau(matKhau)) {
            System.out.println("Mật khẩu hợp lệ.");
        } else {
            System.out.println("Mật khẩu không hợp lệ. Mật khẩu phải lớn hơn 6 ký tự và không có khoảng trắng.");
        }
    }
}
