package com.itheima.wst.file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {

        //创建文件
        //File f1=new File("C:\\Users\\Legion\\Desktop\\image\\ada.jpg");
        //File f1=new File("C:\\Users\\Legio\\image\\ada.jpg");
        File f1=new File("C:\\Users\\Legion\\Desktop\\image\\aaa");
        boolean res1= false;
        try {
            res1 = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(res1);

        //创建目录，该路径存在，创建失败，注意 如果存在一个 名为aaa的无后缀文件，创建目录失败
        File f2=new File("C:\\Users\\Legion\\Desktop\\image\\bbb");
        boolean res2=f2.mkdir();
        System.out.println(res2);

        //创建多级目录
        File f3=new File("C:\\Users\\Legion\\Desktop\\image\\ccc\\ddd");
        boolean res3=f3.mkdirs();
        System.out.println(res3);
    }
}
