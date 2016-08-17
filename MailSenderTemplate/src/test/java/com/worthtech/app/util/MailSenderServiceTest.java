package com.worthtech.app.util;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangzh on 2016/8/11.
 */
public class MailSenderServiceTest {
    @Test
    public void sendWithTemplate() throws Exception {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        MailSenderService mailSender = ac.getBean("mailsenderService", MailSenderService.class);

        //注册完马上发送邮件
        mailSender.setTo("903974344@qq.com");
        mailSender.setSubject("来自worthtech的邮件");
        mailSender.setTemplateName("mail.vm");//设置的邮件模板
        Map model=new HashMap();
        model.put("username", "903974344@qq.com");
        String url="https://www.fxiaoke.com";
        model.put("url", url);
        model.put("email", "zhangzh@fxiaoke.com");
        mailSender.sendWithTemplate(model);
        System.out.println("邮件发送成功！");


    }

    @Test
    public void sendText() throws Exception {

    }

    @Test
    public void sendHtml() throws Exception {

    }

    @Test
    public void sendHtmlWithImage() throws Exception {

    }

    @Test
    public void sendHtmlWithAttachment() throws Exception {

    }

}