package session02;

public class bai5 {
    public static boolean soNguyenTo(int number){
        if (number < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 2; i <= 100 ; i++) {
            if (soNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }
}
