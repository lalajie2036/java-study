package com.soft2036.unit4.case19;

/**
 * @author Mister-Lu
 */
public class Example4_19 {
    public  static void main(String[] args) {
        //装箱:Integer x=new Integer(100),y=new Integer(12);
        Integer x=100,y=12;
        //先拆箱再装箱:Integer m=new Integer(x.intValue()+y.intValue());
        Integer m=x+y;
        //拆箱:int ok=m.intValue();
        int ok=m;
        System.out.println(ok);
    }
}
