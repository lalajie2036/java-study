package com.soft2036.unit4.case23;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/7
 **/
public class Circle {
    double radius;
    Circle(double r) {
        radius=r;
    }
    double getArea() {
        return 3.14*radius*radius;
    }
}

