package com.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// @Component -- generic component, can also use @Repository

@Repository
public class ComponentDAO {

  @Autowired
  ComponentJdbcConnection jdbcConnection;

  public ComponentJdbcConnection getComponentJdbcConnection() {
    return jdbcConnection;
  }

  public void setComponentJdbcConnection(ComponentJdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }

}
