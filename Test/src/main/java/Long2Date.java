import java.util.Date;

/**
 * Created by zhangzh on 2016/9/19.
 */
public class Long2Date {

    public static void main(String[] args) {

        long lDate = 1474248510240L;

        Date date = new Date(lDate);

        System.out.println(date);

    }
}
