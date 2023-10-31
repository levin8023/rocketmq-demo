package com.example.rocketmq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Levin
 */
@Slf4j
@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class ProducerDemo {
    private final RocketMQTemplate rocketMQTemplate;

    @PostMapping("/send")
    public SendResult send(@RequestBody Message message) {
        return rocketMQTemplate.syncSend("test", message);
    }
}
