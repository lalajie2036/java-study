package com.soft2036.unit5.case5;

import com.soft2036.unit4.People;

/**
 * @ClassName Example5_5
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
class CreatPeople {
    public People creatPeople() { //方法的类型是People类
        People p = new People();
        return p;
    }
}
class CreatChinese extends CreatPeople {
    @Override
    //重写方法的类型是People类的子类:Chinese
    public Chinese creatPeople() {
        Chinese chinese=new Chinese();
        return chinese;
    }
}
public class Example5_5 {
    public static void main(String[] args) {
        CreatChinese create=new CreatChinese();
        //create调用重写的方法
        Chinese zhang = create.creatPeople();
        zhang.speak();
    }
}
