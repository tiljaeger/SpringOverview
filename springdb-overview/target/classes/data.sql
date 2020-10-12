// this is only used for spring jdbc, jpa creates a in memory db (schema update) 
// automatically because of @Entity annotation in Person class

//create table person
//(
//   id integer not null,
//   name varchar(255) not null,
//   location varchar(255),
//   birth_date timestamp,
//   primary key(id)
//);


INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10001,  'Tilman', 'Saarbrücken',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10002,  'Julia', 'Zürich',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10003,  'Lukas', 'Amsterdam',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE ) 
VALUES(10004,  'Marina', 'Paris',sysdate());

