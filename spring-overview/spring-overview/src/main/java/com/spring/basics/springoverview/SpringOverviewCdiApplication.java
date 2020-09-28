package com.spring.basics.springoverview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springoverview.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan("com.spring.basics.springoverview")
public class SpringOverviewCdiApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringOverviewCdiApplication.class);


  public static void main(String[] args) {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringOverviewCdiApplication.class);

    SomeCdiBusiness cdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);
    
    LOGGER.info("--------------> {} dao-{}", cdiBusiness.getSomeCdiDao());
    
    applicationContext.close();
  }

}
