package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TargetOfferFile {
    private String filePath;
    private int couponId;
    private List<Integer> offersIds;
}
