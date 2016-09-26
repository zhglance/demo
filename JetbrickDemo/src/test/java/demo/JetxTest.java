package demo;

import jetbrick.template.JetEngine;
import jetbrick.template.JetTemplate;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class JetxTest {


    public static void main(String[] args) {

        JetEngine engine = JetEngine.create();

        JetTemplate template = engine.getTemplate("users.jetx");       //.getTemplate(templateStr);


        Map<String, Object> context = new HashMap<String, Object>();
        context.put("username","张三");
        context.put("email","zhangsan@qq.com");
        context.put("url","www.123.com");

        StringWriter writer = new StringWriter();
        template.render(context, writer);

        System.out.println(writer.toString());

    }

}
