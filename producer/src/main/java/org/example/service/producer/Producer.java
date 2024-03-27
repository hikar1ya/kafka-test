package org.example.service.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.TargetOfferFile;
import org.example.service.KafkaMessagingService;
import org.example.service.event.TargetOfferFileEvent;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {

    private final KafkaMessagingService kafkaMessagingService;
    private final ModelMapper modelMapper;

    public TargetOfferFile sendFileEvent(TargetOfferFile targetOfferFile) {
        kafkaMessagingService.send(modelMapper.map(targetOfferFile, TargetOfferFileEvent.class));
        log.info("Send order from producer {}", targetOfferFile);
        return targetOfferFile;
    }
}

