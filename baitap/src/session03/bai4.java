package session03;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số dòng của ma trận");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của ma trận");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matran= new int[row][col];
        System.out.println("nhập vào lần lượt các phần tử của ma trận:");
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.printf("numbers[%d][%d]=",i,j);
                matran[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("ma trận vừa nhập: ");
        for (int i = 0; i < matran.length; i++) {
            for (int j = 0; j < matran[i].length; j++) {
                System.out.printf("%5d", matran[i][j]);
            }
            System.out.printf("\n");
        }
        int max = matran[0][0];
        int maxRow=0;
        int maxCol=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matran[i][j]>max){
                    max=matran[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        System.out.println("giá trị lớn nhất của ma trận là: "+max);
        System.out.println("tọa độ của giá trị lớn nhất là: ["+maxRow+","+maxCol+"]");
    }
}
