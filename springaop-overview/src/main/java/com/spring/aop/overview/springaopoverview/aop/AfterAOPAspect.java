package com.spring.aop.overview.springaopoverview.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
@Aspect
// Configuration
@Configuration
public class AfterAOPAspect {

  Logger logger = LoggerFactory.getLogger(this.getClass());

  // @AfterReturning(value = "execution(* com.spring.aop.overview.springaopoverview.business.*.*(..))", returning =
  // "result")
  @AfterReturning(value = "com.spring.aop.overview.springaopoverview.aop.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
  public void afterRetruning(JoinPoint joinPoint, Object result) {

    logger.info("{} returned with value {}", joinPoint, result);
  }

  @AfterThrowing(value = "execution(* com.spring.aop.overview.springaopoverview.business.*.*(..))", throwing = "exception")
  public void afterThrowing(JoinPoint joinPoint, Object exception) {

    logger.info("{} returned with value {}", joinPoint, exception);
  }
}
