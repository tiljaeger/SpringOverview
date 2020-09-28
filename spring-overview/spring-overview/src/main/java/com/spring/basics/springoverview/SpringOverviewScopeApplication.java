package com.spring.basics.springoverview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springoverview.scope.PersonDAO;

@Configuration
@ComponentScan("com.spring.basics.springoverview")
public class SpringOverviewScopeApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringOverviewScopeApplication.class);
  
  public static void main(String[] args) {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringOverviewScopeApplication.class);

    PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
    
    PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
    
    LOGGER.info("{}", personDao);
    LOGGER.info("{}", personDao.getJdbcConnection());

    LOGGER.info("{}", personDao2);
    LOGGER.info("{}", personDao2.getJdbcConnection());
    
    applicationContext.close();

  }

}
