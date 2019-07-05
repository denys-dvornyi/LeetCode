CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Trips`;
CREATE TABLE `Trips` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `Client_Id` INT,
     `Driver_Id` INT,
     `City_Id` INT,
     `Status` ENUM('completed', 'cancelled_by_driver', 'cancelled_by_client'),
     `Request_at` VARCHAR(50),
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users` (
     `Users_Id` INT NOT NULL AUTO_INCREMENT,
     `Banned` VARCHAR(50),
     `Role` ENUM('client', 'driver', 'partner'),
     PRIMARY KEY (`Users_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (1, 1, 10, 1, 'completed', '2013-10-01');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (2, 2, 11, 1, 'cancelled_by_driver', '2013-10-01');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (3, 3, 12, 6, 'completed', '2013-10-01');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (4, 4, 13, 6, 'cancelled_by_client', '2013-10-01');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (5, 1, 10, 1, 'completed', '2013-10-02');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (6, 2, 11, 6, 'completed', '2013-10-02');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (7, 3, 12, 6, 'completed', '2013-10-02');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (8, 2, 12, 12, 'completed', '2013-10-03');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (9, 3, 10, 12, 'completed', '2013-10-03');
INSERT INTO `Trips` (`Id`, `Client_Id`, `Driver_Id`, `City_Id`, `Status`, `Request_at`) VALUES (10, 4, 13, 12, 'cancelled_by_driver', '2013-10-03');

INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (1, 'No', 'client');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (2, 'Yes', 'client');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (3, 'No', 'client');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (4, 'No', 'client');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (10, 'No', 'driver');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (11, 'No', 'driver');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (12, 'No', 'driver');
INSERT INTO `Users` (`Users_Id`, `Banned`, `Role`) VALUES (13, 'No', 'driver');


SET FOREIGN_KEY_CHECKS = 1;
