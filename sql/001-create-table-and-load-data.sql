CREATE TABLE members;

CREATE TABLE members (
 id int unsigned AUTO_INCREMENT,
 name VARCHAR(20) NOT NULL,
 age int NOT NULL,

 PRIMARY KEY(id)
)
INSERT INTO members (id,name,age) VALUES (1,"tanaka", 35);
INSERT INTO members (id,name,age) VALUES (2,"yamada", 28);
INSERT INTO members (id,name,age) VALUES (3,"suzuki", 16);
