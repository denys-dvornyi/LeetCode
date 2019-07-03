CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Scores`;
CREATE TABLE `Scores` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `Score` DECIMAL(3,2),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Scores` (`Id`, `Score`) VALUES (1, 3.5);
INSERT INTO `Scores` (`Id`, `Score`) VALUES (2, 3.65);
INSERT INTO `Scores` (`Id`, `Score`) VALUES (3, 4.0);
INSERT INTO `Scores` (`Id`, `Score`) VALUES (4, 3.85);
INSERT INTO `Scores` (`Id`, `Score`) VALUES (5, 4.0);
INSERT INTO `Scores` (`Id`, `Score`) VALUES (6, 3.65);

SET FOREIGN_KEY_CHECKS = 1;
