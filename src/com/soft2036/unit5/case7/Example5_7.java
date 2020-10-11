package com.soft2036.unit5.case7;

/**
 * @ClassName Example5_7
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
public class Example5_7 {
    public static void main(String[] args) {
        Average aver=new Average();
        aver.n=100.5678;
        double result1=aver.f();
        double result2=aver.g();
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
    }
}
