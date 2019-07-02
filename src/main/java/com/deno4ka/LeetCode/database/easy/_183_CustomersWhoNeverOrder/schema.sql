CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Customers`;
CREATE TABLE `Customers` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `Name` varchar(255),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Orders`;
CREATE TABLE `Orders` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `CustomerId` int NOT NULL,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Customers` (`Id`, `Name`) VALUES (1, 'Joe');
INSERT INTO `Customers` (`Id`, `Name`) VALUES (2, 'Henry');
INSERT INTO `Customers` (`Id`, `Name`) VALUES (3, 'Sam');
INSERT INTO `Customers` (`Id`, `Name`) VALUES (4, 'Max');

INSERT INTO `Orders` (`Id`, `CustomerId`) VALUES (1, 3);
INSERT INTO `Orders` (`Id`, `CustomerId`) VALUES (2, 1);

SET FOREIGN_KEY_CHECKS = 1;
