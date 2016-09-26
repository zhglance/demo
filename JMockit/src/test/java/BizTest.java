//import mockit.Expectations;
//import mockit.Injectable;
//import mockit.Verifications;
//import org.apache.commons.lang3.StringUtils;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.util.Assert;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by zhangzh on 2016/9/6.
// */
//public class BizTest {
//
//    private Biz biz = new Biz();
//
//    @Injectable
//    Dao dao;
//
//
//    @Before
//    public void setUp() throws Exception {
//        biz.setDao(dao);
//    }
//
//
//    @Test
//    public void insertTest() {
//
//        biz.insert("111","Name","student");
//
//        new Verifications() {
//            {
//                dao.insert((BeanEntity)any);
//                times = 1;
//            }
//        };
//
//    }
//
//    @Test
//    public void insertNullTest() {
//
//        biz.insert("111",null,"student");
//
//        new Verifications() {
//            {
//                dao.insert((BeanEntity)any);
//                times = 0;
//            }
//        };
//
//    }
//
//    @Test
//    public void updateTest() {
//
//        biz.update("111","student");
//
//        new Verifications() {
//            {
//                dao.update("111",anyString);
//                times = 1;
//            }
//        };
//
//    }
//
//    @Test
//    public void removeTest() {
//
//        biz.remove("111");
//
//        new Verifications() {
//            {
//                dao.remove("111");
//                times = 1;
//            }
//        };
//
//    }
//
//
//    @Test
//    public void findTest() {
//
//        new Expectations(dao) {{
//
//            dao.finds("name");
//
//            BeanEntity bean1 = new BeanEntity();
//            bean1.setBeanType("student");
//            bean1.setBeanName("name");
//            bean1.setBeanId("11111111");
//
//            BeanEntity bean2 = new BeanEntity();
//            bean2.setBeanType("teacher");
//            bean2.setBeanName("name");
//            bean2.setBeanId("2222222222222");
//
//            List<BeanEntity> beans = new ArrayList<BeanEntity>();
//            beans.add(bean1);
//            beans.add(bean2);
//
//            result = beans;
//
//        }};
//
//       String result =  biz.finds("name");
//
//        Assert.isTrue(StringUtils.equals("#student#teacher#",result));
//
//        new Verifications() {
//            {
//                dao.finds("name");
//                times = 1;
//            }
//        };
//
//    }
//
//
//
//
//
//
//}
