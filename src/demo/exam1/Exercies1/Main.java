package demo.exam1.Exercies1;

public class Main {
    public static void main(String[] args) {
        ConversionUtil conversionUtil = new ConversionUtil();
        System.out.printf("F -> C: %f\n", conversionUtil.fahrenheitToCelsius(1));
        System.out.printf("C -> F: %f", conversionUtil.celciusToFahrenheit(50));
    }

}
