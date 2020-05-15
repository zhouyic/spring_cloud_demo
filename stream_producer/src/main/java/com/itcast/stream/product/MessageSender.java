package com.itcast.stream.product;

import com.itcast.stream.channel.MyProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 负责向中间件发送数据
 * @author zhouyicai
 * @Description: TODO
 * @date 2020/5/14 23:06
 */
@Component
@EnableBinding(MyProcessor.class)
public class MessageSender {
    @Resource
    @Qualifier(value ="myoutput")
    private MessageChannel myoutput;

    public void send(Object obj){
        //发送消息
        //messageBuilder: 工具类:创建消息
        myoutput.send(MessageBuilder.withPayload(obj).build());
    }
}
