package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new radius of circle");
        double r = scanner.nextDouble();
        Circle circ = new Circle(4);
        circ.setR(r);
        System.out.println("New radius is:"+circ.getR());

    }
}
