CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Weather`;
CREATE TABLE `Weather` (
     `Id` int NOT NULL AUTO_INCREMENT,
     `RecordDate` DATE,
     `Temperature` int,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Weather` (Id, RecordDate, Temperature) VALUES (1, '2015-01-01', 10);
INSERT INTO `Weather` (Id, RecordDate, Temperature) VALUES (2, '2015-01-02', 25);
INSERT INTO `Weather` (Id, RecordDate, Temperature) VALUES (3, '2015-01-03', 20);
INSERT INTO `Weather` (Id, RecordDate, Temperature) VALUES (4, '2015-01-04', 30);

SET FOREIGN_KEY_CHECKS = 1;
