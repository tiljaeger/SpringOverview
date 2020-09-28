package com.spring.basics.springoverview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.componentscan.ComponentDAO;

@Configuration
// default component scan in this package and all appropriate subpackages
@ComponentScan("com.spring.basics.springoverview")
// add components of other packages
@ComponentScan("com.spring.basics.componentscan")
public class SpringOverviewComponentScanApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringOverviewComponentScanApplication.class);
  
  public static void main(String[] args) {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringOverviewComponentScanApplication.class);

    ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);
    
    
    LOGGER.info("--------> {}", componentDao);
    
    applicationContext.close();

  }

}
