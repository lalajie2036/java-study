package com.soft2036.unit3;

/**
 * @author Mister-Lu
 */
public class Example3_5 {
   public static void main(String[] args) {
      //存放最后的和
      long sum = 0;
      //存放关键的数字
      int a = 8;
      //存放求和项
      long item = a;
      //存放求和项数
      int n = 12;
      for(int i = 1;i<=n; i++) {
         sum=sum+item;
         item = item*10 + a;
      }
      System.out.println(sum);
   }
}








