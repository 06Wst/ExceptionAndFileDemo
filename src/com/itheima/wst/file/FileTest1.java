package com.itheima.wst.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileTest1 {
    public static void main(String[] args) {

        //练习1：创建文件
        File f3=new File("C:\\Users\\Legion\\Desktop\\image\\aaa");        //先创建目录
        boolean res=f3.mkdirs();
        System.out.println(res);
        File f4=new File(f3,"a.txt");            //再拼接父和子创建文件
        try {
            f4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=========================");

        //练习2：判断目录下是否有jpg文件
        File f1=new File("C:\\Users\\Legion\\Desktop\\image");
        if(f1.exists()){
            System.out.println(getMov(f1));
        }else{
            System.out.println("查找jpg路径不存在");
        }
        System.out.println("==========================");

        //练习3：找到电脑中所有jpg
        /*File []root=File.listRoots();
        for (File i : root) {
            getAll(i);
        }*/

        //练习4，删除一个多级文件夹
        File f2=new File("C:\\Users\\Legion\\Desktop\\image\\ccc");
        if(f2.exists()){
            deleteDir(f2);
            System.out.println(f2.exists());
        }
        else {
            System.out.println("删除不存在");
        }
        System.out.println("==========================");

        //练习5：统计文件夹的大小
        long m=getm(f1);
        System.out.println(m);
        System.out.println("===================");

        //练习5，统计一个文件夹中每种文件的个数
        if (f1.exists()) {
            HashMap<String,Integer>map= getCnt(f1);
            System.out.println(map);
        }else {
            System.out.println("该路径不存在");
        }
    }

    private static long getm(File f1) {
        long m=0L;
        File[] fs= f1.listFiles();
        for (File i : fs) {
            if(i.isFile()){
                m+=i.length();
            }else {
                m+=getm(i);
            }
        }
        return m;
    }

    private static void getAll(File file) {
        File[] f=file.listFiles();
        if(f==null || f.length==0){                //可能扫描到空文件夹，需要返回
            return;
        }
        for (File i : f) {
            if(i.isFile() && i.getName().endsWith(".jpg")){
                System.out.print(i.getName()+" ");
            }else if (i.isDirectory()){
                getAll(i);                    //递归解决
            }
        }
    }

    private static HashMap<String, Integer> getCnt(File f1) {
        HashMap<String,Integer> map=new HashMap<>();
        File[] f=f1.listFiles();
        for (File i : f) {
            if(i.isFile()){
                String []name=i.getName().split("\\.");
                if(name.length>1){
                    if(map.containsKey(name[1])){
                        map.put(name[1],map.get(name[1])+1);
                    }else{
                        map.put(name[1],1);
                    }
                }
            }else{
                HashMap<String,Integer> temp =getCnt(i);                   //获取到下一层的map进行合并
                for (Map.Entry<String, Integer> e : temp.entrySet()) {
                    if(map.containsKey(e.getKey())){
                        map.put(e.getKey(),map.get(e.getKey())+e.getValue());
                    }else{
                        map.put(e.getKey(),e.getValue());
                    }
                }
            }
        }
        return map;
    }

    private static void deleteDir(File f2) {
        File []fs= f2.listFiles();
        for (File i : fs) {
            if(i.isDirectory()){
                deleteDir(i);                  //递归实现
            }else if (i.isFile()){
                i.delete();
            }
        }
        f2.delete();
    }


    private static boolean getMov(File f1) {
        File []fs=f1.listFiles();
        for (File i : fs) {
            if(i.isFile() && i.getName().endsWith(".jpg")){       //先判断是文件，再判断是jpg
                return true;
            }
        }
        return false;
    }
}
