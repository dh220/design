package com.dh.strategy;

/**
 * @Created 调用策略方法端
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:15:48
 */
public class Client {

    public static void main(String[] args) {
        TransContext context = null;
        //执行A
        context = new TransContext(new TransStrategyA());
        System.out.println(context.getResult("你瞅啥？"));
        //执行B
        context = new TransContext(new TransStrategyB());
        System.out.println(context.getResult("瞅你 咋滴？"));
        //执行C
        context = new TransContext(new TransStrategyC("试试","就试试"));
        System.out.println(context.getResult("在瞅一下 试试？"));

    }

}
