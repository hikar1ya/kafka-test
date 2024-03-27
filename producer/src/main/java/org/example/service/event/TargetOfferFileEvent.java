package org.example.service.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TargetOfferFileEvent {
    private String filePath;
    private Integer couponId;
    private List<Integer> offersIds;
}

