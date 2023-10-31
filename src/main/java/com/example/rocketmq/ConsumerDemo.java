package com.example.rocketmq;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author Levin
 */
@RequiredArgsConstructor
@Slf4j
@Service
@RocketMQMessageListener(topic = "test", consumerGroup = "group2", messageModel = MessageModel.CLUSTERING)
public class ConsumerDemo implements RocketMQListener<Message> {

    @SneakyThrows
    @Override
    public void onMessage(Message message) {
        log.info("CLUSTERING onMessage: " + message.toString());
        if ((System.currentTimeMillis() & 1) == 0) {
            throw new RuntimeException("不想接收");
        }
    }
}

