package com.soft2036.unit5.case11;

/**
 * @ClassName Example5_11
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/16
 **/
abstract class GirlFriend {  //抽象类，封装了两个行为标准
    abstract void speak();
    abstract void cooking();
}
class ChinaGirlFriend extends GirlFriend {
    @Override
    void speak(){
        System.out.println("你好");
    }
    @Override
    void cooking(){
        System.out.println("水煮鱼");
    }
}
class AmericanGirlFriend extends GirlFriend {
    @Override
    void speak(){
        System.out.println("hello");
    }
    @Override
    void cooking(){
        System.out.println("roast beef");
    }
}
class Boy {
    GirlFriend friend;
    void setGirlfriend(GirlFriend f){
        friend = f;
    }
    void showGirlFriend() {
        friend.speak();
        friend.cooking();
    }
}
/**
 * @author Mister-Lu
 */
public class Example5_11 {
    public static void main(String[] args) {
        //girl是上转型对象
        GirlFriend girl = new ChinaGirlFriend();
        Boy boy = new Boy();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
        //girl是上转型对象
        girl = new AmericanGirlFriend();
        boy.setGirlfriend(girl);
        boy.showGirlFriend();
    }
}
