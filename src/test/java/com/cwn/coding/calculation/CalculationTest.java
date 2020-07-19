package com.cwn.coding.calculation;

import com.cwn.coding.CalculationService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class CalculationTest {
    private final CalculationService calculationService;

    @Autowired
    public CalculationTest(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Test
    void multiple(){
        Assert.assertEquals(24, calculationService.multiple(2,3,4));
    }

    @Test
    void sum(){
        Assert.assertEquals(10, calculationService.sum(1,2,3,4));
    }
}
