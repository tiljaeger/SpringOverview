package com.spring.basics.springoverview.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component -- generic component, can also use @Repository
@Repository
public class PersonDAO {
  @Autowired
  JdbcConnection jdbcConnection;

  
  public JdbcConnection getJdbcConnection() {
    return jdbcConnection;
  }

  
  public void setJdbcConnection(JdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }

}
