package com.dh.strategy;

/**
 * 策略C
 * @Created with IDEA
 * @author:DaiHang
 * @Date:2020/4/3
 * @Time:15:55
 */
public class TransStrategyC extends TransSupper{
    private static final String strategyC = "策略C";

    private String str1 = "";
    private String str2 = "";

    public TransStrategyC(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }
    @Override
    public String acceptTrans(String exec) {
        return strategyC.concat(":").concat(exec).concat("\n").concat(str1).concat(str2);
    }
}
