package demo.lab4.doIt;

import demo.lab4.doIt.exam1.Circle;
import demo.lab4.doIt.exam1.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"Red",7);
        System.out.printf("Volume of cylinder is: %.2f\n",cylinder.getVolume());
        System.out.printf("Area of circle is: %.2f \n",cylinder.getArea());
        System.out.printf(cylinder.toString());
    }
}
