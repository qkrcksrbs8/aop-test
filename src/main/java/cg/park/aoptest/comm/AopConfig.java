package cg.park.aoptest.comm;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class AopConfig {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* cg.park.aoptest..impl.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        joinPoint.proceed();
        stopWatch.stop();

        logger.info("서비스: {}, 소요시간: {}",joinPoint.getSignature().toShortString(), stopWatch.getTotalTimeMillis());
        return joinPoint.proceed();
    }

}