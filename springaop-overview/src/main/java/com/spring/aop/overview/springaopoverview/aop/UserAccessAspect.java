package com.spring.aop.overview.springaopoverview.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
@Aspect
// Configuration
@Configuration
public class UserAccessAspect {

  Logger logger = LoggerFactory.getLogger(this.getClass());

  // what kind of methods I would like to intercept
  // execution(* PACKAGE.*.(..)) --> pointcut
  //@Before("execution(* com.spring.aop.overview.springaopoverview.business.*.*(..))")
  @Before("com.spring.aop.overview.springaopoverview.aop.CommonJoinPointConfig.dataLayerExecution()")
  public void before(JoinPoint joinPoint) {
    
    // what to do? --> advice
    logger.info("check for user access");
    // logger.info("intercepted method call " + joinPoint);
    logger.info("allowed execution for {} " + joinPoint);
  }

}
