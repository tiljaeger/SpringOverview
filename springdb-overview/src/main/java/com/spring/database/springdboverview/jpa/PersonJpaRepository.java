package com.spring.database.springdboverview.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.database.springdboverview.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

  // connect to database
  @PersistenceContext
  EntityManager entityManager;

  // use JPA
  public Person findById(int id) {
    return entityManager.find(Person.class, id);
  }

  // use jpql and named query for this method
  // named query is defined in Person.class
  public List<Person> findAll() {
    TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
    return namedQuery.getResultList();
  }

  public Person update(Person person) {
    return entityManager.merge(person);
  }

  public Person insert(Person person) {
    return entityManager.merge(person);
  }

  public void deleteById(int id) {
    Person person = findById(id);
    entityManager.remove(person);
  }
}
