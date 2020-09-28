package com.spring.basics.springoverview.xml;

public class XmlPersonDAO {

  XmlJdbcConnection xmlJdbcConection;

  
  public XmlJdbcConnection getXmlJdbcConnection() {
    return xmlJdbcConection;
  }

  
  public void setXmlJdbcConnection(XmlJdbcConnection jdbcConnection) {
    this.xmlJdbcConection = jdbcConnection;
  }

}
