package com.spring.aop.IoC.quickstart.annotation;

import org.springframework.stereotype.Component;

/**
 * 采用注解开发的bean
 * @Component用于类级别注解，标注本类为一个可被spring容器托管的bean
 * @ComponentScan用于寻找用@Component注解标注的bean
 */
@Component

public class Hello {
    public String getHello(){
        return "Hello World";
    }


}
