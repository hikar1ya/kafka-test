package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.service.event.TargetOfferFileEvent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaMessagingService {

    @Value("${topic.OMNI-JME-COUPONS}")
    private String sendClientTopic;

    private final KafkaTemplate<String , Object> kafkaTemplate;

    public void send(TargetOfferFileEvent targetOfferFileEvent) {
        kafkaTemplate.send(sendClientTopic, targetOfferFileEvent.getCouponId().toString(), targetOfferFileEvent);
    }
}

