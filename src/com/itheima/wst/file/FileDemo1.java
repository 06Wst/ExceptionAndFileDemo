package com.itheima.wst.file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {

        //创建File对象
        String str="C:\\Users\\Legion\\Desktop\\image\\下载.jpg";
        File f1=new File(str);                //将字符串转化为File对象，表示一个文件或目录，可以使用文件的各种方法
        System.out.println(f1);

        //根据父级目录和子目录名创建File对象，底层用分隔符拼接路径即  new File(parent + "\\" + child);  ，不同系统的分隔符不同
        File f2=new File("C:\\Users\\Legion\\Desktop\\image","下载.jpg");
        System.out.println(f2);

        //根据父级目录和子级文件字符串创建File对象
        File parent=new File("C:\\Users\\Legion\\Desktop\\image\\");
        String child="下载.jpg";
        File f4=new File(parent,child);
        System.out.println(f4);
    }
}
