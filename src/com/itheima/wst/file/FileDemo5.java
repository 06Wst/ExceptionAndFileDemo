package com.itheima.wst.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Legion\\Desktop\\image\\ccc");

        //获取目录下的所有文件和子目录
        File []fs=f1.listFiles();
        for (File f : fs) {
            System.out.println(f);
        }

        System.out.println("-----------------");

        //获取所有盘符
        File []roots=File.listRoots();
        for (File root : roots) {
            System.out.println(root);
        }
        System.out.println("-----------------");

        //获取路径下的所有文件和子目录的名字
        File f2=new File("C:\\Users\\Legion\\Desktop\\image");
        String []names=f2.list();
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("-----------------");

        //文件名过滤器
        File f3=new File("C:\\Users\\Legion\\Desktop\\image");
        String []names1=f3.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f=new File(dir,name);
                if(f.isFile() && name.endsWith("jpg")){
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(names1));
        System.out.println("-----------------");

        //文件过滤器
        File []fs1=f3.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f=new File(dir,name);
                if(f.isFile() && name.endsWith("jpg")){
                    return true;
                }
                return false;
            }
        });
        for (File f : fs1) {
            System.out.println(f);
        }
        System.out.println("-----------------");

        //目录过滤器
        File []fs2=f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith("jpg");
            }
        });
        for (File f : fs2) {
            System.out.println(f);
        }
        System.out.println("-----------------");
    }
}
