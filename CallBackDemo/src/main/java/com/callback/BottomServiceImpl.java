package com.callback;

/**
 * 底层服务
 */
public class BottomServiceImpl implements BottomService {
    /**
     * 调用的上层服务
     */
    private UpperService upperService;

    /**
     * 小王的构造方法，持有小李的引用
     * @param upperService
     */
    public BottomServiceImpl(UpperService upperService){
        this.upperService = upperService;
    }

    /**
     * 小王通过这个方法去问小李的问题
     * @param question  就是小王要问的问题,1 + 1 = ?
     */
    public void askQuestion(final String question){
        //这里用一个线程就是异步，
        new Thread(new Runnable() {

            public void run() {
                /**
                 * 小王调用小李中的方法，在这里注册回调接口
                 * 这就相当于A类调用B的方法C
                 */
                upperService.executeMessage(BottomServiceImpl.this, question);
            }
        }).start();

        //小网问完问题挂掉电话就去干其他的事情了，诳街去了
        play();
    }

    public void play(){
        System.out.println("我要逛街去了");
    }

    /**
     * 小李知道答案后调用此方法告诉小王，就是所谓的小王的回调方法
     */

    public void solve(String result) {
        System.out.println("小李告诉小王的答案是--->" + result);
    }

}
