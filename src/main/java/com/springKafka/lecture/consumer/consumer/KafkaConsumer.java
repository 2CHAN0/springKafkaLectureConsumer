package com.springKafka.lecture.consumer.consumer;

import com.springKafka.lecture.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "UserV1", groupId = "UserConsume-Group", containerFactory = "userConcurrentKafkaListenerContainerFactory")
    public void userConsume(@Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition ,
                            @Header (KafkaHeaders.OFFSET) int offset,
                            User user
                           ){
        System.out.println("name : "+user.getName());
        System.out.println("age  : "+user.getAge());
        System.out.println("email : "+user.getEmail());
        System.out.println("partition : "+partition);
        System.out.println("offset  : "+offset);
    }
}
