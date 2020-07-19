package com.cwn.coding;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    int multiple(int... a){
        int total = 1;
        for (int i : a) {
            total *= i;
        }
        return total;
    }

    int sum(int... a){
        int total = 0;
        for (int i : a) {
            total += i;
        }

        return total;
    }
}
