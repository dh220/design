package com.dh.strategy;

/**
 * 策略A
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:15:55
 */
public class TransStrategyA extends TransSupper {
    private static final String strategyA = "策略A";
    @Override
    public String acceptTrans(String exec) {
        return strategyA.concat(":").concat(exec);
    }
}
