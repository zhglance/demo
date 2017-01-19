package callback.demo;

/**
 * Created by zhangzh on 2017/1/19.
 */
public class UpperServiceImpl implements UpperService {

    private BottomService bottomService;

    @Override
    public void upperTaskAfterCallBottomService(String upperParam) {

        System.out.println( upperParam + " upperTaskAfterCallBottomService() execute.");
    }

    public UpperServiceImpl(BottomService bottomService) {
        this.bottomService = bottomService;
    }

    @Override
    public void callBottomService(final String param) {

        new Thread(new Runnable() {

            public void run() {
                bottomService.bottom(UpperServiceImpl.this,    param  + " callBottomService.bottom() execute --> ");
            }
        }).start();


    }


}
