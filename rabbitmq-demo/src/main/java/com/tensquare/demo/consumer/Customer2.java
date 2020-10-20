package com.tensquare.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 分列模式(Fanout)_消息消费者
 * @author TianCi.Xiong
 * @since 2020/10/20 20:20
 */
@Component
@RabbitListener(queues = "itheima")
public class Customer2 {
    @RabbitHandler
    public void showMessage(String message) {
        System.out.println("itheima接收到消息：" + message);
    }
}
