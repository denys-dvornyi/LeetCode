CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `Name` varchar(255),
     `Salary` int,
     `ManagerId` int,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Employee` (Name, Salary, ManagerId) VALUES ('Joe', 70000, 3);
INSERT INTO `Employee` (Name, Salary, ManagerId) VALUES ('Henry', 80000, 4);
INSERT INTO `Employee` (Name, Salary, ManagerId) VALUES ('Sam', 60000, NULL);
INSERT INTO `Employee` (Name, Salary, ManagerId) VALUES ('Max', 90000, NULL);

SET FOREIGN_KEY_CHECKS = 1;
