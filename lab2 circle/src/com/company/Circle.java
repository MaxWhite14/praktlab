package com.company;

public class Circle{
    private double r;
    public Circle(){}
    public Circle(double r){
        this.r = r;
    }
    public double getR(){
        return r;
    }
   public void setR(double r){
        this.r = r;
    }
    @Override
    public String toString() {
        return "Circle @ (this.r).";
    }
}
