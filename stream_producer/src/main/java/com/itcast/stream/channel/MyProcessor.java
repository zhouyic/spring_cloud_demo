package com.itcast.stream.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义消息通道
 * @author zhouyicai
 * @Description: TODO
 * @date 2020/5/14 23:20
 */
public interface MyProcessor {
    /**
     * 消息生产者配置
     */
    String MYOUTPUT = "myoutput";
    @Output("myoutput")
    MessageChannel myoutput();

    /**
     * 消息消费者的配置
     */
    String MYINPUT = "myinput";
    @Input("myinput")
    MessageChannel myinput();
}
