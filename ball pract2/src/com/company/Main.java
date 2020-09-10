package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter coordinates x,y where u want to move ur ballz");
        Scanner scanner = new Scanner(System.in);
        double xDisp = scanner.nextDouble();
        double yDisp = scanner.nextDouble();
        Ball b1 = new Ball(30,100);
        System.out.println(b1);
        b1.move(xDisp,yDisp);
        System.out.println(b1);
    }
}

