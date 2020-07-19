package com.cwn.coding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    private final CalculationService calculationService;

    public HomeController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping
    private String hello(@RequestParam(required = false, defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/multiple")
    private int multiple(@RequestParam int a, @RequestParam int b){
        return calculationService.multiple(a, b);
    }
}
