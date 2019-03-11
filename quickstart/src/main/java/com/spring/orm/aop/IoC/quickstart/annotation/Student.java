package com.spring.orm.aop.IoC.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by HP on 2019-02-28.
 */
@Component
@Data
public class Student {
    @Value("Tom")
    private String name;

    @Value("20")
    private int age;

    //使用 @Autowired注入一个Phone类型的bean
    @Autowired
    private Phone phone;

}
