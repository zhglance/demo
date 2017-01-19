package callback.demo;

/**
 * Created by zhangzh on 2017/1/19.
 */
public class BottomService {



    public void bottom(UpperService upperService, String param) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        upperService.upperTaskAfterCallBottomService( param +" bottom callback upperTaskAfterCallBottomService() execute -->");

    }

}
