package com.tensquare.demo.producer;

import com.tensquare.demo.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 消息生产者
 * @author TianCi.Xiong
 * @since 2020/10/20 8:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MqTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 直接模式(Direct)_消息生产者
     */
    @Test
    public void testSend() {
        rabbitTemplate.convertAndSend("itcast", "我要红包");
    }

    /**
     * 分列模式(Fanout)_消息生产者
     */
    @Test
    public void testSendFanout() {
        rabbitTemplate.convertAndSend("chuanzhi", "", "分列模式走起");
    }

    /**
     * 主题模式(Topic)_消息生产者1
     */
    @Test
    public void testSendTopic1() {
        rabbitTemplate.convertAndSend("topictest", "goods.aaa", "主题模式");
    }
    /**
     * 主题模式(Topic)_消息生产者2
     */
    @Test
    public void testSendTopic2() {
        rabbitTemplate.convertAndSend("topictest", "article.content.log", "主题模式");
    }
    /**
     * 主题模式(Topic)_消息生产者3
     */
    @Test
    public void testSendTopic3() {
        rabbitTemplate.convertAndSend("topictest", "goods.log", "主题模式");
    }
}
