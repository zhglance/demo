package com.callback;

/**
 * 测试类
 *
 */
public class Test {
    public static void main(String[]args){
        /**
         * new 一个小李
         */
        UpperService upperService = new UpperService();

        /**
         * new 一个小王
         */
        BottomServiceImpl bottomService = new BottomServiceImpl(upperService);

        /**
         * 小王问小李问题
         */
        bottomService.askQuestion("1 + 1 = ?");
    }
}
