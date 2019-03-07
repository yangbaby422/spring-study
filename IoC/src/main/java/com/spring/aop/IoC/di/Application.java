package com.spring.aop.IoC.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by HP on 2019-03-04.
 */
public class Application {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
                ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

    }
}
