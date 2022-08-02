package com.amigoscode.fraud;

import lombok.Data;

@Data
public class FraudCheckResponse {

    Boolean isFraudster;
    FraudCheckResponse(boolean isFraudster){
        this.isFraudster = isFraudster;

    }
}
