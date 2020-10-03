package com.soft2036.unit4;

/**
 * @author Mister-Lu
 */
public class Ladder {
    double 上底,高;
    //类变量
    static double 下底;
    void 设置上底(double a) {
        上底 = a;
    }
    void 设置下底(double b) {
        下底 = b;
    }
    double 获取上底() {
        return 上底;
    }
    double 获取下底() {
        return 下底;
    }
}