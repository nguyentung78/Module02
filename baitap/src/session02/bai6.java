package session02;

public class bai6 {
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
        System.out.println("20 số nguyên tố đầu tiên là: ");
        int cout =0;
        int number=2;
        while (cout<20){
            if (soNguyenTo(number)){
                System.out.println(number);
                cout++;
            }
            number++;
        }
    }
}
