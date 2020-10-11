package com.soft2036.unit5.case8;

/**
 * @ClassName Example5_8
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
class A {
    //final double PI;  非法，因为没有给常量指定值
    //PI是常量
    final double PI=3.1415926;
    public double getArea(final double r) {
        // r=89; 非法，因为不允许再改变r的值
        return PI*r*r;
    }
    public final void speak() {
        System.out.println("您好，How's everything here ?");
    }
}
class B extends A {
/** 非法，不能重写speak方法
  public void speak() {
      System.out.println("你好");
  }
  */
}
public class Example5_8 {
    public static void main(String[] args) {
        B b=new B();
        System.out.println("面积："+b.getArea(100));
        b.speak();       //调用继承的方法
    }
}
