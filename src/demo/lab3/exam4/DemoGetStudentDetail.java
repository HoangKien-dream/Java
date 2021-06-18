package demo.lab3.exam4;

import java.util.Scanner;

public class DemoGetStudentDetail {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
         name = scanner.nextLine();
        System.out.println("Enter your age: ");
        age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your weight: ");
        weight=scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Information student:");
        System.out.printf("%s\n", name);
        System.out.printf("%d\n", age);
        System.out.printf("%.2f\n", weight);
    }
}
