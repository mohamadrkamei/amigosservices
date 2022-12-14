package com.amigoscode.fraud;

import com.amigoscode.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId){
        boolean isFraudulentCustomer = fraudCheckService.isFraudlentCustomerId(customerId);
       log.info("fraoud check requestfor customer{} " , customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
