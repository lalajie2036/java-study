package com.soft2036.unit4.case22;

import com.soft2036.unit4.case21.TestOne;

/**
 * @ClassName Example4_22
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/7
 **/
public class Example4_22 {
    public static void main(String[] args) {
        Circle  circle=new Circle(10);
        Circular circular=new Circular(circle,20);
        System.out.println("圆锥的体积:"+circular.getVolume());
        TestOne a = new TestOne();
        a.fTestOne();
    }
}

