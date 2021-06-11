package demo.entity;

public class HelperClass {
//    Bai 1 :
    public double tinhLuongThang13 (int a, int b){
           double luong;
           double thuong;
           if (a < 2){
                luong = 10000000;
           }else if (2 <= a && a <= 5){
                luong = 20000000;
           }else {
               luong = 30000000;
           }
           if (b < 1){
                thuong = 0.7;
           }
           else if (1 <= b && b < 2){
                thuong = 0.5;
           }
           else if (2 <=b && b < 5){
               thuong = 2;
           }
           else {
               thuong = 3;
           }
               return  (luong*thuong);
    }
//    Bai 1.2:
    public double tinhNuaChuViTamGiac (int a, int b, int c){
        return(double) (a+b+c)/2;
    }
}
