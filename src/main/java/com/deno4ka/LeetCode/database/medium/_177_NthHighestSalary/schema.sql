CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `Salary` INT,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Employee` (`Salary`) VALUES (100);
INSERT INTO `Employee` (`Salary`) VALUES (200);
INSERT INTO `Employee` (`Salary`) VALUES (300);
INSERT INTO `Employee` (`Salary`) VALUES (400);
INSERT INTO `Employee` (`Salary`) VALUES (500);
INSERT INTO `Employee` (`Salary`) VALUES (500);
INSERT INTO `Employee` (`Salary`) VALUES (600);
INSERT INTO `Employee` (`Salary`) VALUES (700);
INSERT INTO `Employee` (`Salary`) VALUES (800);
INSERT INTO `Employee` (`Salary`) VALUES (900);
INSERT INTO `Employee` (`Salary`) VALUES (1000);

SET FOREIGN_KEY_CHECKS = 1;
