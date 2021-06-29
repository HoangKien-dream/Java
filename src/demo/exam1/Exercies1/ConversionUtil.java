package demo.exam1.Exercies1;

import java.util.Scanner;

public class ConversionUtil {
   public double fahrenheitToCelsius (double fDegree){
       return  (fDegree-32)/1.8;
   }
   public double celciusToFahrenheit(double cDegree){
       return 1.8 * cDegree+32;
   }
}
