package com.ob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: oubin
 * @date: 2018/12/8 16:20
 * @Description:
 */
public class Constants {

    static {
        List<PayType> payTypes = new ArrayList<>(Arrays.asList(PayType.values()));
    }

    /**
     * 支付类型
     */
    public enum PayType{
        /**
         * 网龙币支付
         */
        CHANNEL_EMONEY,
        /**
         * 人民币
         */
        CHANNEL_CASH
        ;

    }

    /**
     * 支付渠道
     */
    public enum Channel {
        /**
         * 网龙币支付
         */
        CHANNEL_EMONEY,
        /**
         * 支付宝支付
         */
        CHANNEL_ALIPAY;
    }

    /**
     * 币种编码
     */
    public enum Currency{
        /**
         * 网龙币支付
         */
        CHANNEL_EMONEY,
        /**
         * 人民币
         */
        CHANNEL_CASH
        ;

    }
}
