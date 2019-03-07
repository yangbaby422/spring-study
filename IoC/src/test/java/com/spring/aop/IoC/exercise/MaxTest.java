package com.spring.aop.IoC.exercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by HP on 2019-03-04.
 */
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)//反射
//指定配置文件路径
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class MaxTest {
    //自动注入max
    @Autowired
    private Max max;
    @Test
    public void getMax() {
        assertEquals(5,max.getMax());
    }

}