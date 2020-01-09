package com.epam.calcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CalcDemoApplication implements ApplicationRunner {

    @Autowired
    private AddValueService addValueService;

    public static void main(String[] args) {
        SpringApplication.run(CalcDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> aArgs = args.getOptionValues("a");
        List<String> bArgs = args.getOptionValues("b");
        System.out.println(addValueService.add(Integer.valueOf(aArgs.get(0)), Integer.valueOf(bArgs.get(0))));
    }
}
