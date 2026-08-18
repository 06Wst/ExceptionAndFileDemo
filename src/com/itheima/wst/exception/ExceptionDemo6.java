package com.itheima.wst.exception;

import com.itheima.wst.entity.Gf;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Gf g=new Gf();

        while (true){
            try {
                System.out.println("请输入姓名");
                String name=sc.next();
                g.setName(name);
                System.out.println("请输入年龄");
                String age=sc.next();
                g.setAge(Integer.parseInt(age));
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                //System.out.println("年龄必须是整数");
            } catch (RuntimeException e) {
                e.printStackTrace();
                //System.out.println("请重新输入");
            }
        }

        System.out.println(g);
    }
}
