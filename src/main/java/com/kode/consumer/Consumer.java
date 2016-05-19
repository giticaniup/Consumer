package com.kode.consumer;

import com.facishare.open.broker.message.result.BrokerMsgResult;
import com.facishare.open.broker.message.service.BuildMsgService;
import com.kode.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhongcy on 2016/3/9.
 */
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beans=context.getBeanDefinitionNames();
        for(String bean:beans){
            System.out.println("容器中的bean有"+bean);
        }
        DemoService demoService= (DemoService) context.getBean("hellodubbo");
        demoService.say();
    }

}
