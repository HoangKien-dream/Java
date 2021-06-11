package demo;

import demo.entity.HelperClass;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        // Bai 1:
        HelperClass tinhLuongThang13 = new HelperClass();
        double total = tinhLuongThang13.tinhLuongThang13(3, 6);
        System.out.printf("Tong luong cua thang thu 13 la cua mot nhan vien la: %f", total);
        // Bai 1.2:
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.printf("\nNhập a: ");
        a = sc.nextInt();
        System.out.printf("\nNhập b: ");
        b = sc.nextInt();
        System.out.printf("\nNhập c: ");
        c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.printf("\nĐộ dài của một tam giác không thể nhỏ hơn hoặc bằng 0");
        } else if (a + b <= c || a + c <= b || c + b <= a) {
            System.out.printf("\nTổng hai cạnh của một tam giác luôn phải lớn hơn cạnh còn lại (Theo bất đẳng thức tam giác)");
        }else {
            HelperClass tinhNuaChuViTamGiac = new HelperClass();
            double d = tinhNuaChuViTamGiac.tinhNuaChuViTamGiac(a,b,c);
            System.out.printf("\nNua chu vi cua tam giac la: %f", d);
        }
        // Bai 1.3:
        int  number[] = {6,1,29,10,35};
        int max = number[0];
        int min = number[0];
        for (int i = 0;i < number.length;i++){
            if (max < number[i]){
                max = number[i];
            }
            if (min > number[i]){
                min = number[i];
            }
        }
        System.out.printf("\nSố lớn nhất là: %d ", max);
        System.out.printf("\nSố bé nhất là: %d ", min);
    }
}