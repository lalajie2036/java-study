package com.soft2036.unit4.case22;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/7
 **/

public class Circular {
    Circle bottom;
    double height;
    public Circular(Circle c,double h) {
        bottom = c;
        height = h;
    }
    public double getVolume() {
        return bottom.getArea()*height/3.0;
    }
}

