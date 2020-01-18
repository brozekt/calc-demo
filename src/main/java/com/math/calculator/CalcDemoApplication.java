package com.math.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;

@SpringBootApplication
public class CalcDemoApplication implements ApplicationRunner {
    String unusedVar = "please delete me";

    @Autowired
    private AddValueService addValueService;
    @Autowired
    private MultiplyValueService multiplyValueService;

    public static void main(String[] args) {
        SpringApplication.run(CalcDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> aArgs = args.getOptionValues("a");
        List<String> bArgs = args.getOptionValues("b");
        System.out.println("The result is "+addValueService.add(Integer.valueOf(aArgs.get(0)), Integer.valueOf(bArgs.get(0))));
        System.out.println("I'm done, going into clock mode...");
        while (true){
            System.out.println(Instant.now());
            Thread.sleep(2000);
        }
    }
}
