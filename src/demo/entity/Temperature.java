package demo.entity;

public class Temperature {
    private double cTemp;

    public Temperature(double cTemp){
         this.cTemp =cTemp;
    }
    public double getCTemp (){
        return cTemp;
    }
    public void setCTemp (double cTemp){
        this.cTemp=cTemp;
    }
    public double getFTemp (){
        return cTemp *9/5 +32;
    }
    public double getKTemp (){
        return cTemp + 273.15;
    }
    public void displayTem (){
        System.out.printf("%fC -> %fF\n",cTemp, getFTemp());
        System.out.printf("%fC -> %fK\n",cTemp, getKTemp());
    }
}
