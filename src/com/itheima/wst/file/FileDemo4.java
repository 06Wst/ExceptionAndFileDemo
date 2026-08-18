package com.itheima.wst.file;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        //删除文件，不会进入回收站
        File f1=new File("C:\\Users\\Legion\\Desktop\\image\\aaa");
        boolean res1= f1.delete();
        System.out.println(res1);

        //删除目录，必须为空目录
        File f2=new File("C:\\Users\\Legion\\Desktop\\image\\bbb");
        boolean res2=f2.delete();
        System.out.println(res2);

        //删除目录，有内容则删除不了
        File f3=new File("C:\\Users\\Legion\\Desktop\\image\\ccc");
        boolean res3=f3.delete();
        System.out.println(res3);
    }
}
