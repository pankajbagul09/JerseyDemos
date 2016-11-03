package com.hmrc.cftf.services.documentum;

import com.hmrc.cftf.services.common.ContentType;
import com.hmrc.cftf.services.common.CoreService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Serializable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/documentum/process-flow.xml");
        context.getBean("documentumPublisherService", CoreService.class).invoke("Hello world is to be published");

        System.out.println("------------------------------------------");
        Serializable output = context.getBean("type1TransformerService", CoreService.class).invoke("Hello world is to be published");
        System.out.println(output);
        System.out.println("------------------------------------------");
        output = context.getBean("type2TransformerService", CoreService.class).invoke("Hello world is to be published");
        System.out.println(output);

    }
}
