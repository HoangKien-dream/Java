package demo.lab4.tryItYourSelf.exam2;

public class SportCar extends Car{
    @Override
    public void accelerate() {
        System.out.printf("Sport Car is so beautiful!\n");
        super.accelerate();
    }
    public static void main(String[] args) {
              SportCar sportCar =new SportCar();
              sportCar.accelerate();
    }
}
