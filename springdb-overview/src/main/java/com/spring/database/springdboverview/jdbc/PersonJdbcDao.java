package com.spring.database.springdboverview.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.database.springdboverview.entity.Person;

@Repository
public class PersonJdbcDao {

  // use Spring Jdbc
  @Autowired
  JdbcTemplate jdbcTemplate;

  class PersonRowMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
      Person person = new Person();
      person.setId(rs.getInt("id"));
      person.setName(rs.getString("name"));
      person.setLocation(rs.getString("location"));
      person.setBirthDate(rs.getTimestamp("birth_date"));
      return person;
    }

  }

  // use Spring Jdbc
  // use BeanPropertyRowMapper
  // public List<Person> findAll() {
  // return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
  // }
  // use PersonRowMapper
  public List<Person> findAll() {
    return jdbcTemplate.query("select * from person", new PersonRowMapper());
  }

  // use Spring Jdbc
  public Person findById(int id) {
    return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},
        new BeanPropertyRowMapper(Person.class));
  }

  // use Spring Jdbc
  // @return int how many rows are deleted
  public int deleteById(int id) {
    return jdbcTemplate.update("delete from person where id=?", new Object[] {id});
  }

  public int insert(Person person) {
    return jdbcTemplate.update("insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES(?,?,?,?)", new Object[] {
      person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime())});
  }

  public int update(Person person) {
    return jdbcTemplate.update("update PERSON set NAME = ?, LOCATION = ?, BIRTH_DATE = ? where ID =?", new Object[] {
      person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId()});
  }

}
