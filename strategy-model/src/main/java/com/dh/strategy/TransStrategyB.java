package com.dh.strategy;

/**
 * 策略B
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:15:55
 */
public class TransStrategyB extends TransSupper{
    private static final String strategyB = "策略B";
    @Override
    public String acceptTrans(String exec) {
        return strategyB.concat(":").concat(exec);
    }
}
