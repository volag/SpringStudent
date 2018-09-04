package com.lc.evaluation.aop;



public class PersonServiceImpl  {

    public void save(String name) {
        throw new RuntimeException("我是异常");
        // System.out.println("我是save()方法");
    }

    public void update(String name, Integer id) {
        System.out.println("我是update()方法");
    }

    public String getPersonName(Integer id) {
        System.out.println("我是getPersonName()方法");
        return "xxx";
    }

}