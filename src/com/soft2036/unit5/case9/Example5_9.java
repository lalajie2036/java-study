package com.soft2036.unit5.case9;

/**
 * @ClassName Example5_9
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/14
 **/
public class Example5_9 {
    public static void main(String args[]) {
        People  people=new People();
        //monkey是people对象的上转型对象。
        Anthropoid monkey=people;
        //等同于people调用重写的crySpeak方法
        monkey.crySpeak("I love this game");
        //monkey.n=100;                         //非法,因为n是子类新增的成员变量
        //monkey.computer(12,19);               //非法,因为computer()是子类新增的方法
        //操作隐藏的m,不等同于people.m
        System.out.println(monkey.m) ;
        //操作隐藏的m,不等同于people.m
        System.out.println(people.m) ;
        //把上转型对象强制转化为子类的对象
        People zhang=(People)monkey;
        //zhang是子类的对象
        zhang.computer(55,33);
        //操作子类声明的成员的变量m
        zhang.m='T';
        System.out.println(zhang.m) ;
    }
}