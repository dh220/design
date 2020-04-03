package com.dh.strategy;

/**
 * 根据传入的策略类执行对应的策略方法
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:15:55
 */
public class TransContext {

    private TransSupper transSupper;

    public TransContext(TransSupper transSupper) {
        this.transSupper = transSupper;
    }

    public String getResult(String exec){
        return transSupper.acceptTrans(exec);
    }
}
