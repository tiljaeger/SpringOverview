package com.spring.basics.springoverview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.springoverview.xml.XmlPersonDAO;

public class SpringOverviewXmlContextApplication {

  private static Logger LOGGER = LoggerFactory.getLogger(SpringOverviewXmlContextApplication.class);

  public static void main(String[] args) {

    // instead of using java application conext -> use xml application context
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

    XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);

    LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
    LOGGER.info("--> {} {}", xmlPersonDao, xmlPersonDao.getXmlJdbcConnection());

    applicationContext.close();
  }

}
