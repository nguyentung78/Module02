package session02;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 3 và 5 trong khoảng 1-100 là: ");
        for (int i=0 ; i<=100 ; i++){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}