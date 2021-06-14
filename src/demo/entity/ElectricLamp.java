package demo.entity;

public class ElectricLamp {
    private boolean status;
    public ElectricLamp(){
        status = true;
    }
    public void turnOff (){
        status = false;
            System.out.printf("Đèn tắt\n");
    }
    public void turnOn (){
        status = true;
            System.out.printf("Đèn bật\n");
    }
}
