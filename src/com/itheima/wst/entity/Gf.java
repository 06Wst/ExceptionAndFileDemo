package com.itheima.wst.entity;

public class Gf {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws RuntimeException {
        if(name.length()<3 || name.length()>10){
            throw new RuntimeException("姓名长度必须在3-10之间");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if (age < 18 || age > 40) {
            throw new RuntimeException("年龄必须在18-40之间");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Gf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
