package com.kingbom.cloudbuild;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Price {
    private long timestamp;
    private long value;
}
