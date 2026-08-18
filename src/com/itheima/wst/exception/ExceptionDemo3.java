package com.itheima.wst.exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
        throws：抛出异常，不处理异常
        throw：抛出异常，处理异常，中断程序执行
         */

        //int []arr={1,2,3,4,5};
        int []arr=new int[0];              //此时arr为空数组，会抛出空指针异常
        try {
            int max=getMax(arr);
            System.out.println(max);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("程序继续执行");
    }
    public static int getMax(int []arr){
        if (arr == null) {
            throw new NullPointerException();               //手动抛出空指针异常，下面的代码不会执行，程序会中断执行
        } else if (arr.length==0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("执行下面代码");
        int max=arr[0];
        for (int i : arr) {
            if (i>max) {
                max = i;
            }
        }
        return max;
    }
}
