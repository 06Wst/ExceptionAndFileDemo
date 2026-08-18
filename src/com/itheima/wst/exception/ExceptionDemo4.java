package com.itheima.wst.exception;

import java.util.Scanner;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        //综合练习
        String res="";
        while (true){
            try {
                res=sc();
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("请重新输入");
            }
        }

        System.out.println("输入成功");
        System.out.println(res);

    }

    public static String sc() throws Exception{
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        if(name.length()<3 || name.length()>10){
            throw new Exception("姓名长度必须在3-10之间");
        }
        int age=sc.nextInt();
        if(age<18 || age>40){
            throw new Exception("年龄必须在18-40之间");
        }
        return name+age;
    }
}
