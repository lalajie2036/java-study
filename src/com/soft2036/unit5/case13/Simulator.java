package com.soft2036.unit5.case13;

/**
 * @ClassName Simulator
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/28
 **/
public class Simulator {
    public void playSound(Animal animal) {
        System.out.print("现在播放"+animal.getAnimalName()+"类的声音:");
        animal.cry();
    }
}
