package com.spring.aop.overview.springaopoverview.aop;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

  @Pointcut("execution(* com.spring.aop.overview.springaopoverview.business.*.*(..))")
  public void businessLayerExecution() {
  }

  @Pointcut("execution(* com.spring.aop.overview.springaopoverview.data.*.*(..))")
  public void dataLayerExecution() {
  }

  @Pointcut("com.spring.aop.overview.springaopoverview.aop.CommonJoinPointConfig.businessLayerExecution() && com.spring.aop.overview.springaopoverview.aop.CommonJoinPointConfig.dataLayerExecution()")
  public void allLayerExecution() {
  }
  
  @Pointcut("bean(Dao*)") 
    public void beanStartingWithDao() {
  }

  @Pointcut("bean(*Dao*)") 
  public void beanContainingDao() {
}
}
