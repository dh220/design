package com.dh;

/**
 * 懒汉式
 * （伪单例模式）存在线程安全和线程不安全问题
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:17:04
 */
public class LHSingle {
    public static LHSingle lhSingle;

    public LHSingle() {
    }
    public static LHSingle getInstance(){
        if(lhSingle==null){
             lhSingle = new LHSingle();
        }
        return lhSingle;
    }
}
