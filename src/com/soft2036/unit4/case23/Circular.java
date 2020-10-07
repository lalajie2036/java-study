package com.soft2036.unit4.case23;

/**
 * @ClassName Circular
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/7
 **/
public class Circular {
    Circle bottom;
    double height;
    public void setBottom(Circle c) {
        bottom = c;
    }
    public void setHeight(double h) {
        height = h;
    }
    double getVolume() {
        return bottom.getArea()*height/3.0;
    }
}

