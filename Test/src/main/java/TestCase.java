import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhangzh on 2016/8/23.
 */
public class TestCase {

    public static void main(String[] args) {

        long time =1477655552721L;
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-1);


        System.out.print("\n date:" + new Date(time));

    }
}
