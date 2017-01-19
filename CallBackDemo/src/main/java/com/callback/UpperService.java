package com.callback;

/**
 * 这个就是小李啦
 *
 */
public class UpperService  {
    /**
     *
     * @param bottomService
     * @param question
     */
    public void executeMessage(BottomService bottomService, String question){
        System.out.println("小王问的问题--->" + question);

        //模拟小李办自己的事情需要很长时间
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /**
         * 小李办完自己的事情之后想到了答案是2
         */
        String result = "答案是2";

        /**
         * 于是就打电话告诉小王，调用小王中的方法
         * 这就相当于B类反过来调用A的方法D
         */
        bottomService.solve(result);



    }

}
