package com.wei.ecommercesystem;

import com.wei.ecommercesystem.mq.RocketMQService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @program: Ecommerce-System
 * @description:
 * @author: Yuheng Wei
 * @create: 2023-09-05 11:29
 */
@SpringBootTest
public class MQTest {
    @Autowired
    RocketMQService rocketMQService;
    @Test
    public void sendMQTest() throws Exception {
        rocketMQService.sendMessage("test-wei", "Hello World!" + new
                Date().toString());
    }
}
