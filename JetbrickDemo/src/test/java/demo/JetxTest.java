package demo;

import jetbrick.template.JetEngine;
import jetbrick.template.JetTemplate;
import org.junit.Test;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JetxTest {

    public static final String templateStr = "<table>\n" +
            "  <tr>\n" +
            "    <td>序号</td>\n" +
            "    <td>姓名</td>\n" +
            "    <td>邮箱</td>\n" +
            "  </tr>\n" +
            "  ##for (user : users)\n" +
            "  <tr>\n" +
            "    <td>${name}</td>\n" +
            "    <td>${email}</td>\n" +
            "  </tr>\n" +
            "  ##end\n" +
            "</table>";

    @Test
    public void test() {
        // 0. 准备一些 Model 数据作为测试
        List<User> users = Arrays.asList(
                new User("张三", "zhangsan@qq.com"),
                new User("李四", "lisi@qq.com"),
                new User("王五", "wangwu@qq.com")
        );

        // 1. 创建一个默认的 JetEngine
        JetEngine engine = JetEngine.create();

        // 2. 获取一个模板对象 (从默认的 classpath 下面)
        JetTemplate template = engine.getTemplate("users.jetx");       //.getTemplate(templateStr);

        // 3. 创建 context 对象
        Map<String, Object> context = new HashMap<String, Object>();
//        context.put("users", users);
        context.put("name","张三");
        context.put("email","zhangsan@qq.com");
        context.put("url","www.fxiaoke.com");

        // 4. 渲染模板到自定义的 Writer
        StringWriter writer = new StringWriter();
        template.render(context, writer);

        // 5. 打印结果
        System.out.println(writer.toString());
    }
}
