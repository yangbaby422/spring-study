package com.spring.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 2019-02-25.
 */
public class HelloWorldApp {
    public static void main(String[] args){
//      读入数据文件
        ApplicationContext context = new
                ClassPathXmlApplicationContext("/beans.xml");
//      读取配置好的bean
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
//      helloworld运行
        System.out.print(helloWorld.getHello());
    }
}
