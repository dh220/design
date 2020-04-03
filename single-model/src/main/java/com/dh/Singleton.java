package com.dh;

/**
 * 第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，
 * 只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:17:16
 */
public class Singleton {
    private Singleton(){
    }
    public static Singleton getInstance(){
        return Inner.instance;
    }
    private static class Inner {
        private static final Singleton instance = new Singleton();
    }
}
