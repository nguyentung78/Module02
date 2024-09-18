package session03;

public class bai8 {
    public static String delTrang(String chuoi){
        return chuoi.trim();
    }
    public static void main(String[] args) {
        String chuoicokt="    hanoi    ";
        System.out.println("chuỗi trc khi xóa khoảng trắng: "+chuoicokt);
        String chuoiDaxuly = delTrang(chuoicokt);
        System.out.println("chuỗi sau khi xử lý: "+chuoiDaxuly);
    }
}
