package com.soft2036.unit5.case2;

/**
 * @ClassName Example5_2
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/9
 **/
public class Example5_2 {
    public static void main(String[] args) {
        B b=new B();
        b.setX(888);
        System.out.println("子类对象未继承的x的值是:"+b.getX());
        b.y=12.678;
        System.out.println("子类对象的实例变量y的值是:"+b.getY());
    }
}
