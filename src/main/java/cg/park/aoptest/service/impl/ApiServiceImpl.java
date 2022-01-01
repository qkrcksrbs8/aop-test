package cg.park.aoptest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public void serviceA () throws Exception {
        Thread.sleep(1000);
    }

    public void serviceB () throws Exception {
        Thread.sleep(2000);
    }

}
