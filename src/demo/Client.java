package demo;

import demo.entity.*;

public class Client {
    public static void main(String[] args) {
        //Exercise 1:
        Rectangle rectangle = new Rectangle(3, 2);
        rectangle.display();
        rectangle.setHeight(4);
        rectangle.setWidth(8);
        rectangle.display();
        //Exercise 2:
        Temperature temperature = new Temperature(25);
        temperature.displayTem();
        temperature.setCTemp(35);
        temperature.displayTem();
        //Exercise 3:
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();
        switchButton.connectToLamp(electricLamp);
        for (int i = 0; i < 10; i++){
            switchButton.switchOn();
            switchButton.switchOff();
        }
    }
}
