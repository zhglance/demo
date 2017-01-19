package callback.demo;

/**
 * Created by zhangzh on 2017/1/19.
 */
public interface UpperService {

    public void upperTaskAfterCallBottomService(String upperParam);

    public void callBottomService(final String param);
}
