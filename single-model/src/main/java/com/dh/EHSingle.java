package com.dh;

/**
 * 饿汉式
 * 初始化时就实例化-存在浪费空间
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:17:08
 */
public class EHSingle {
    public static EHSingle ehSingle = new EHSingle();
    public EHSingle() { }

    public static EHSingle getInstance(){
        return ehSingle;
    }
}
