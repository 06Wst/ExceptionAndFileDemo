package com.itheima.wst.file;

import java.io.File;
import java.sql.SQLOutput;

public class FileDemo2 {
    public static void main(String[] args) {

        //判断和获取方法
        File f1=new File("C:\\Users\\Legion\\Desktop\\image");
        File f2=new File("C:\\Users\\Legion\\Desktop\\image","下载.jpg");

        System.out.println(f1.isDirectory());       //判断是否为文件夹
        System.out.println(f2.isFile());           //判断是否为文件
        System.out.println(f1.exists());           //判断文件或目录是否存在

        File f3=new File("aaa\\dd\\sd\\asd");
        System.out.println(f3.isFile());           //不存在则返回false
        System.out.println(f3.exists());

        //判断方法返回值均为boolean类型

        //获取方法

        //length获取文件大小，不能获取文件夹大小
        long l1= f2.length();           //获取文件或目录的大小，单位为字节
        System.out.println(l1);
        long l3=f1.length();            //获取文件夹的大小，不同操作系统返回值不同，可能是0或者4096，但都不能表示文件夹的大小
        System.out.println(l3);
        long l2=f3.length();           //不存在则返回0
        System.out.println(l2);
        System.out.println("======================");

        //获取绝对路径
        String s1=f1.getAbsolutePath();
        System.out.println(s1);
        File f4=new File("a.txt");
        String s2=f4.getAbsolutePath();
        System.out.println(s2);
        System.out.println("======================");

        //获取定义文件时的路径，即参数
        String s3=f4.getPath();
        System.out.println(s3);
        String s4=f1.getPath();
        System.out.println(s4);
        System.out.println("======================");

        //获取文件名
        String s5=f2.getName();
        System.out.println(s5);
        String s7=f1.getName();             //如果是文件夹，返回文件夹名
        System.out.println(s7);
        String s6=f3.getName();
        System.out.println(s6);
        System.out.println("======================");

        //获取文件最后修改时间，毫秒值
        long t1=f1.lastModified();
        System.out.println(t1);
    }
}
