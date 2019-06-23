CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Person`;
CREATE TABLE `Person` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `Email` varchar(255),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Person` (Id, Email) VALUES (4, 'bob@example.com');
INSERT INTO `Person` (Id, Email) VALUES (3, 'john@example.com');
INSERT INTO `Person` (Id, Email) VALUES (2, 'bob@example.com');
INSERT INTO `Person` (Id, Email) VALUES (1, 'john@example.com');

SET FOREIGN_KEY_CHECKS = 1;
