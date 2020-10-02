package com.soft2036.unit3;

public class Example3_8 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        char b[]={'a','b','c','d'};
        //传统方式
        for(int n=0;n<a.length;n++){
            System.out.println(a[n]);
        }
        //传统方式
        for(int n=0;n<b.length;n++){
            System.out.println(b[n]);
        }
        //循环变量i依次取数组a的每一个元素的值（改进方式）
        for(int i:a) {
            System.out.println(i);
        }
        //循环变量ch依次取数组b的每一个元素的值（改进方式）
        for(char ch:b) {
            System.out.println(ch);
        }
    }
}


