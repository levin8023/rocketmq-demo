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
@RocketMQMessageListener(topic = "test", consumerGroup = "group1", messageModel = MessageModel.BROADCASTING)
public class Consumer2Demo implements RocketMQListener<Message> {

    @SneakyThrows
    @Override
    public void onMessage(Message message) {
        log.info("BROADCASTING onMessage: " + message.toString());
    }
}

