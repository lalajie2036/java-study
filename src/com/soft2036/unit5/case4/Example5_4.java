package com.soft2036.unit5.case4;

/**
 * @ClassName Example5_4
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
class A {
    double f(float x,float y) {
        return x+y;
    }
    public int g(int x,int y) {
        return x+y;
    }
}
class B extends A {
    @Override
    double f(float x, float y) {
        return x*y;
    }
}
public class Example5_4 {
    public static void main(String[] args) {
        B b=new B();
        double result=b.f(5,6);
        System.out.println("调用重写方法得到的结果:"+result);
        int m=b.g(3,5);
        System.out.println("调用继承方法得到的结果:"+m);
    }
}
