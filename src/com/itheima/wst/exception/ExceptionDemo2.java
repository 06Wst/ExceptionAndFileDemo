package com.itheima.wst.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        //异常常见方法
        int []arr={1,2,3,4,5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            /*String msg=e.getMessage();        //获取异常的详细信息字符串格式
            System.out.println(msg);*/

            /*String msg=e.toString();            //获取异常的详细信息字符串格式，包含异常的类名、方法名、行号等信息
            System.out.println(msg);*/

            e.printStackTrace();            //仅仅打印信息，不会中断程序执行，包含信息最多最常用
        }
        System.out.println("程序继续执行");
        System.out.println("-----------------");

        System.out.println(123);         //正常输出
        System.err.println(123);          //错误输出，打印顺序不同
    }
}
