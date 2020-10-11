package com.soft2036.unit5.case6;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
public class Student {
    int number;
    String name;
    Student() {
    }
    Student(int number,String name) {
        this.number=number;
        this.name=name;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
}
