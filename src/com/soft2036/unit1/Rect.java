package com.soft2036.unit1;

public class Rect {
    double width;
    double height;
    double getArea(){
        return width * height;
    }
    public static void main(String[] args) {
        Rect rectangle;
        rectangle  = new Rect();
        rectangle.width = 1.819;
        rectangle.height = 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积:" + area);
    }
}