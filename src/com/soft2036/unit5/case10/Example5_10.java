package com.soft2036.unit5.case10;

/**
 * @ClassName Example5_10
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/15
 **/
class  动物 {
    void cry() {

    }
}
class 狗 extends 动物 {
    @Override
    void cry() {
        System.out.println("这是狗的叫声：汪汪...汪汪");
    }
}
class 猫 extends 动物 {
    @Override
    void cry() {
        System.out.println("这是猫的叫声：喵喵...喵喵...");
    }
}
/**
 * @author Mister-Lu
 */
public class Example5_10 {
    public static void main(String[] args) {
        //animal是狗的上转型对象
        动物 animal=new 狗();
        animal.cry();
        //animal是狗的上转型对象
        animal=new 猫();
        animal.cry();
    }
}
