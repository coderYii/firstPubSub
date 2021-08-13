package com.yii.publisher.controller;

import com.yii.common.entity.Message;
import com.yii.publisher.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/rpc")
public class HelloController {

    @Autowired
    MessageService messageService;

    @ResponseBody
    @RequestMapping("/hello")
    public Message sayHello() {

        return messageService.sendMessage();
    }
}
