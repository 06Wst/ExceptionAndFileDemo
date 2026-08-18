package com.itheima.wst.exception;

import com.itheima.wst.entity.Gf;

import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        //综合练习优化版
        Scanner sc=new Scanner(System.in);

        Gf g=new Gf();

        while (true){
            try {
                System.out.println("请输入姓名");
                String name=sc.next();
                g.setName(name);
                System.out.println("请输入年龄");
                int age=sc.nextInt();
                g.setAge(age);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println(g);

    }
}
