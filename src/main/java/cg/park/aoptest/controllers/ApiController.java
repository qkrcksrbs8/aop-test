package cg.park.aoptest.controllers;

import cg.park.aoptest.service.impl.ApiServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ApiServiceImpl apiServiceImpl;

    @RequestMapping("/test")
    public void apiTest() {

        try {
            apiServiceImpl.serviceA();
            apiServiceImpl.serviceB();
        }
        catch (Exception e) {
            logger.error("오류");
        }

    }

}
