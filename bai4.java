package bai4;

import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen duong : ");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Tong 2 so la : " + (a + b));
        System.out.println("Hieu 2 so la : " + (a - b));
        System.out.println("Tich 2 so la : " + (a * b));
        System.out.println("Thuong 2 so la " + (float) a / b);

    }
}
