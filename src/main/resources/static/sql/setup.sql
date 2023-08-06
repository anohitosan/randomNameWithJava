CREATE DATABASE randomnamedb;

USE randomnamedb;

CREATE TABLE mst_member (
	id INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	family_name VARCHAR(255) NOT NULL,
	first_name VARCHAR(255) NOT NULL,
	created_at DateTime NOT NULL default now(),
	updated_at DateTime NOT NULL default now()
	);
	
INSERT INTO mst_member
(family_name, first_name)
VALUES ('日本', '太郎');