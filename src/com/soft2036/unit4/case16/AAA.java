package com.soft2036.unit4.case16;

class AAA {
    private int money;
    private int getMoney() {
        return money;
    }
    public static void main(String[] args) {
        //对象exa在AAA类中
        AAA  exa=new AAA();
        exa.money=3000;
        int m=exa.getMoney();
        System.out.println("money="+m);
    }
}
