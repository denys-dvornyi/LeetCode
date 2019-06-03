SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `Person`;
CREATE TABLE `Person` (
     `PersonId` int(11) NOT NULL AUTO_INCREMENT,
     `FirstName` varchar(255),
     `LastName` varchar(255),
     PRIMARY KEY (`PersonId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `Address`;
CREATE TABLE `Address` (
      `AddressId` int(11) NOT NULL AUTO_INCREMENT,
      `PersonId` int(11) NOT NULL,
      `City` varchar(255) DEFAULT NULL,
      `State` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`AddressId`),
      KEY `FK_Person_idx` (`PersonId`),
      CONSTRAINT `FK_Person` FOREIGN KEY (`PersonId`)
      REFERENCES `Person` (`PersonId`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `Person` (LastName, FirstName) values ('Wang', 'Allen');
INSERT INTO `Person` (LastName, FirstName) values ('Steve', 'Jobs');
INSERT INTO `Person` (LastName, FirstName) values ('Bill', 'Gates');
INSERT INTO `Address` (PersonId, City, State) values (1, 'New York City', 'New York');
INSERT INTO `Address` (PersonId, City, State) values (2, 'Palo Alto', 'California');

SET FOREIGN_KEY_CHECKS = 1;
