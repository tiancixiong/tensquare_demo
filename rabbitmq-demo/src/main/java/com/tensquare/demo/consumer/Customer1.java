package com.tensquare.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 直接模式(Direct)_消息消费者
 * @author TianCi.Xiong
 * @since 2020/10/20 8:38
 */
@Component
@RabbitListener(queues = "itcast")
public class Customer1 {
    @RabbitHandler
    public void showMessage(String message) {
        System.out.println("itcast接收消息：" + message);
    }


}
