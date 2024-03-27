package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.model.TargetOfferFile;
import org.example.service.producer.Producer;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/file")
public class FileController {
    private final Producer producer;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public TargetOfferFile sendFile(@RequestBody TargetOfferFile targetOfferFile) {
        log.info("Send file to kafka");
        producer.sendFileEvent(targetOfferFile);
        return targetOfferFile;
    }
}
