CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Person`;
CREATE TABLE `Person` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `Email` varchar(255),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Person` (`Id`, `Email`) VALUES (1, 'a@b.com');
INSERT INTO `Person` (`Id`, `Email`) VALUES (2, 'c@d.com');
INSERT INTO `Person` (`Id`, `Email`) VALUES (3, 'a@b.com');

SET FOREIGN_KEY_CHECKS = 1;
