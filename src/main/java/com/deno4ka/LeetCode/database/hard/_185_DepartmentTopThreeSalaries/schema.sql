CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `Name` VARCHAR(255),
     `Salary` INT,
     `DepartmentId` INT,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Department`;
CREATE TABLE `Department` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `Name` VARCHAR(255),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Department` (`Id`, `Name`) VALUES (1, 'IT');
INSERT INTO `Department` (`Id`, `Name`) VALUES (2, 'Sales');

INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (1, 'Joe', 85000, 1);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (2, 'Henry', 80000, 2);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (3, 'Sam', 60000, 2);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (4, 'Max', 90000, 1);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (5, 'Janet', 69000, 1);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (6, 'Randy', 85000, 1);
INSERT INTO `Employee` (`Id`, `Name`, `Salary`, `DepartmentId`) VALUES (7, 'Will', 70000, 1);

SET FOREIGN_KEY_CHECKS = 1;
