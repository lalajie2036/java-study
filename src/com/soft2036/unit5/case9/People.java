package com.soft2036.unit5.case9;

/**
 * @ClassName People
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/14
 **/
public class People extends Anthropoid {
    char m='A';
    int n=60;
    void computer(int a,int b) {
        int c=a+b;
        System.out.println(a+"加"+b+"等于"+c);
    }
    void crySpeak(String s) {
        System.out.println(m+"**"+s+"**"+m);
    }
}
