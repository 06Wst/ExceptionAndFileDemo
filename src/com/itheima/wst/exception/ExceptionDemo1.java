package com.itheima.wst.exception;

import com.itheima.wst.entity.Student;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        //运行时异常：空指针异常
        /*
         Cannot invoke "com.itheima.wst.entity.Student.getName()" because "s1[0]" is null
         */
        /*Student[] s1=new Student[3];           //null null null
        String name=s1[0].getName();
        System.out.println(name);*/

        //通过异常信息debug，提示索引越界且错误位于Student类的构造方法中，数组长度为1
        /*Student s1=new Student("张三,18");
        System.out.println(s1);*/


    }
}
