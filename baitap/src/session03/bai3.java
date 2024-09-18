package session03;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng giá trị cho mảng 1: ");
        int m1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[m1];
        for (int i = 0; i < m1; i++) {
            System.out.println("nhập giá trị cho mảng 1:");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("nhập số lượng giá trị của mảng 2: ");
        int m2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[m2];
        for (int i = 0; i < m2; i++) {
            System.out.println("nhập giá trị cho mảng 2:");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        int[] arrGop=arr(arr1, arr2);
        System.out.println("mảng sau khi gộp là: "+ Arrays.toString(arrGop));
        }
    public static int[] arr(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[arr1.length+i] = arr2[i];
        }
        return arr;
    }
}
