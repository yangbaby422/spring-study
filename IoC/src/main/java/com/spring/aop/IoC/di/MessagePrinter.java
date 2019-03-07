package com.spring.aop.IoC.di;
import com.spring.aop.IoC.di.service.MessageService;

/**
 * Created by HP on 2019-03-04.
 */
public class MessagePrinter {
    final private MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());

    }}
