package com.switchfully;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class ExternalStockInformationService {

    private static final int MAXIMUM_RANDOM_VALUE = 100;
    private static final int MINIMUM_RANDOM_VALUE = 10;

    public BigDecimal getPriceInEuroForStock(String stockId){
        double randomNumber = new Random().nextDouble(MINIMUM_RANDOM_VALUE, MAXIMUM_RANDOM_VALUE);
        return new BigDecimal(randomNumber).setScale(2, RoundingMode.HALF_EVEN);
    }
}


