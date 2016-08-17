import com.mongodb.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzh on 2016/8/15.
 */
public class MongoTest {

    private static final String simpleTemplate = "亲爱的${username}，您好：\n" +
            "\n" +
            "    您在纷享销客上有1项审批工作需要处理，其中1项即将到期，请点击链接登录首页:${url}\n" +
            "\n" +
            "    如果您的email程序不支持链接点击，请将上面的地址拷贝至您的浏览器(如IE)的地址栏进入。\n" +
            "\n" +
            "    如果您还有其他疑问，请可以发送邮件至:${email}。\n" +
            "\n" +
            "    我们对您产生的不便，深表歉意。\n" +
            "\n" +
            "    纷享销客希望您度过快乐的时光!\n" +
            "\n" +
            "---------------------------------\n" +
            "此信由纷享销客自动发出，请勿直接回复，谢谢。";

    private static final String simpleTemplate2 = "##2亲爱的${username}，您好：\n" +
            "\n" +
            "    您在纷享销客上有1项审批工作需要处理，其中1项即将到期，请点击链接登录首页:${url}\n" +
            "\n" +
            "    如果您的email程序不支持链接点击，请将上面的地址拷贝至您的浏览器(如IE)的地址栏进入。\n" +
            "\n" +
            "    如果您还有其他疑问，请可以发送邮件至:${email}。\n" +
            "\n" +
            "    我们对您产生的不便，深表歉意。\n" +
            "\n" +
            "    纷享销客希望您度过快乐的时光!\n" +
            "\n" +
            "---------------------------------\n" +
            "此信由纷享销客自动发出，请勿直接回复，谢谢。";

    @Test
    public void MongoTest() {

        Mongo mongo = new Mongo( "172.31.102.102" , 27099 );
//        List<String> dbNames= mongo.getDatabaseNames();
//        for(String s:dbNames) {
//            System.out.println(s);
//        }

        System.out.println("=====================================================");
       MailTemplate simpleT = new MailTemplate("simple",simpleTemplate);
//
//        MongoDatabase templateDb = mongoClient.getDatabase("fs-paas-workflow-mailtemplate");
       DB db = mongo.getDB("fs-paas-workflow-mailtemplate");
//        DBCollection conn = templateDb.getCollection("mailtemplate");

        DBCollection conn = db.getCollection("mailtemplate");


        //db游标
        DBCursor cur = conn.find();
        while (cur.hasNext()) {
            System.out.println(cur.next());
        }

        DBObject bean = new BasicDBObject();
        bean.put("simpleType","simpleTemplate");
        bean.put("template",simpleTemplate);

        DBObject bean2 = new BasicDBObject();
        bean2.put("simpleType","simpleTemplate2");
        bean2.put("template",simpleTemplate2);

        List<DBObject> list = new ArrayList<DBObject>();

        list.add(bean);
        list.add(bean2);

       conn.insert(list);


        System.out.println("=====================================================");

        //db游标
        DBCursor cur2 = conn.find();
        while (cur2.hasNext()) {
            System.out.println(cur2.next());
        }
















        if (mongo != null)
            mongo.close();
        mongo = null;
        db = null;
        mongo = null;
        System.gc();

    }
}
