package com.soft2036.unit5.case7;

/**
 * @ClassName Average
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/11
 **/
public class Average extends Sum {
    //子类继承的int型变量n被隐藏
    double n;
    @Override
    public double f() {
        double c;
        //子类double型变量n进行int转换运算的结果赋值给隐藏的int型变量n
        super.n=(int)n;
        c=super.f();
        return c+n;
    }
    public double g() {
        double c;
        c=super.f();
        return c-n;
    }
}
