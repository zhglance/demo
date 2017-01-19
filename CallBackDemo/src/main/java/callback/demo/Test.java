package callback.demo;

import java.util.Date;

/**
 * Created by zhangzh on 2017/1/19.
 */
public class Test {

    public static void main(String[] args) {


        BottomService bottomService = new BottomService();

        UpperService upperService = new UpperServiceImpl(bottomService);

        System.out.println("=============== callBottomService start ==================:" + new Date());;

        upperService.callBottomService("callBottomService start --> ");

        System.out.println("=============== callBottomService end ====================:" + new Date());

    }
}
