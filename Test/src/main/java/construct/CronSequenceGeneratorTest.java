package construct;

import org.springframework.scheduling.support.CronSequenceGenerator;

import java.util.Date;

/**
 * Created by zhangzh on 2017/1/18.
 */
public class CronSequenceGeneratorTest {

    public static void main(String[] args) {

        String cron = "0 */5 * * * ?"; //每个五分钟执行一次

        CronSequenceGenerator cronSequenceGenerator = new CronSequenceGenerator(cron);

        Date currentTime = new Date();

        System.out.println("currentTime: " + currentTime);

        Date nextTimePoint = cronSequenceGenerator.next(currentTime);

        System.out.println("nextTimePoint: " + nextTimePoint);

        Date nextNextTimePoint = cronSequenceGenerator.next(nextTimePoint);

        System.out.println("nextNextTimePoint: " + nextNextTimePoint);
    }
}
