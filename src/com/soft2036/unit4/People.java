package com.soft2036.unit4;

/**
 * @author Mister-Lu
 */
public class People{
    int leg,hand;
    String name;
    public People(String s){
        name=s;
        this.init();   //可以省略this，即将this.init();写成init();
    }

    public People() {

    }

    void init(){
        leg=2;
        hand=2;
        System.out.println(name+"有"+hand+"只手"+leg+"条腿");
    }
    public static void main(String[] args){
        //当调用构造方法People创建boshi时，其中的this就是对象boshi
        People boshi=new People("布什");
    }
}
