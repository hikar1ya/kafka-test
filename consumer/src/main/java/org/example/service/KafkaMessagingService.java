package org.example.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.TargetOfferFile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class KafkaMessagingService {
    private static final String topicCreateOrder = "${topic.coupons}";
    private static final String kafkaConsumerGroupId = "${spring.kafka.consumer.group-id}";


    @Transactional
    @KafkaListener(topics = topicCreateOrder, groupId = kafkaConsumerGroupId, properties = {"spring.json.value.default.type=org.example.model.TargetOfferFile"})
    public TargetOfferFile printOrder(TargetOfferFile targetOfferFile) {
        log.info("Receiving new target offers for coupon: {}", targetOfferFile.getCouponId());
        log.info("List of offers: {}", targetOfferFile.getOffersIds());
        return targetOfferFile;
    }
}
