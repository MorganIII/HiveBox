package com.morgan.HiveBox.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    public static final String VERSION = "0.0.1";

    @GetMapping("/print-version")
    public String printVersion() {
        logger.info("code version is: {}", VERSION);
        return VERSION;
    }
}