package com.example.rocketmq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Levin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    String name;
    String content;
}
