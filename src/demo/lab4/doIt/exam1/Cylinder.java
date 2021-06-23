package demo.lab4.doIt.exam1;

public class Cylinder  extends Circle{
    private double height;


    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
                return getRadius()*getRadius()*3.14*height;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
