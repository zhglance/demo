import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.junit.Test;

/**
 * Created by zhangzh on 2016/8/15.
 */
public class MongoRemoveTest {

    @Test
    public void Test() {

        Mongo mongo = new Mongo( "172.31.102.102" , 27099 );

        System.out.println("=====================================================");
//
        DB db = mongo.getDB("fs-paas-workflow-mailtemplate");

        DBCollection conn = db.getCollection("mailtemplate");

        conn.remove(new BasicDBObject("simpleType","simpleTemplate2"));


        if (mongo != null)
            mongo.close();
        mongo = null;
        db = null;
        mongo = null;
        System.gc();
    }
}
