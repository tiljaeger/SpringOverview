package com.spring.aop.overview.springaopoverview.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

  Logger logger = LoggerFactory.getLogger(this.getClass());

  @Around("execution(* com.spring.aop.overview.springaopoverview.business.*.*(..))")
  public void around(ProceedingJoinPoint joinPoint) throws Throwable {

    // start time = x
    long startTime = System.currentTimeMillis();
    joinPoint.proceed();
    long timeTaken = System.currentTimeMillis() - startTime;
    // allow execution of method
    // end time y
    logger.info("Time taken by {} is {}", joinPoint, timeTaken);
  }

}
