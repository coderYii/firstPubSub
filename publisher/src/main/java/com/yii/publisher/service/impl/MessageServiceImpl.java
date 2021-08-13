package com.yii.publisher.service.impl;

import com.yii.common.entity.Message;
import com.yii.publisher.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public Message sendMessage() {
        Message msg = new Message();
        msg.setMsg("hello world");
        return msg;
    }
}
