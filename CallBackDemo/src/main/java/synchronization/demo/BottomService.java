package synchronization.demo;

/**
 * Created by zhangzh on 2017/1/19.
 */
public class BottomService {



    public String bottom(String param) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return param +" BottomService.bottom() execute -->";

    }

}
