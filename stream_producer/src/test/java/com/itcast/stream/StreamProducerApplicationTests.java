package com.itcast.stream;

import com.itcast.stream.product.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class StreamProducerApplicationTests {
    @Autowired
    private MessageSender messageSender;
    @Test
    public void contextLoads() {
        for (int i = 0; i < 5; i++) {
            messageSender.send("1");

        }
    }

}
