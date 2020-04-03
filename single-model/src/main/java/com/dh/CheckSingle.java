package com.dh;

/**
 * 双重检索
 * 懒汉式的变种，通过synchronized关键字控制保证线程安全
 * 1.第一遍检索避免不必要的上锁（相对加锁的懒汉模式而言）
 * 2.第二遍检索 在给当前线程加锁后，例行检查
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:17:10
 */
public class CheckSingle {
    public static CheckSingle checkSingle;
    public CheckSingle() { }
    public static CheckSingle getInstance(){
        if(checkSingle==null){
            synchronized (CheckSingle.class){
                if(checkSingle==null){
                    checkSingle = new CheckSingle();
                }
            }
        }
        return checkSingle;
    }

    /**
     * 防止序列化破坏单例模式
     * @return
     */
    private Object readResolve() {
        return checkSingle;
    }
}
