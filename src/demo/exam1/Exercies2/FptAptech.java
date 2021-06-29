package demo.exam1.Exercies2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FptAptech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String text = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(text," ");
        System.out.println("Result:");
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
