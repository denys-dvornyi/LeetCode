CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `World`;
CREATE TABLE `World` (
     `Id` INT NOT NULL AUTO_INCREMENT,
     `name` VARCHAR(255),
     `continent` VARCHAR(255),
     `area` INT,
     `population` INT,
     `gdp` BIGINT,
     PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Afghanistan', 'Asia', 652230, 25500100, 20343000000);
INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Albania', 'Europe', 28748, 2831741, 12960000000);
INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Algeria', 'Africa', 2381741, 37100000, 188681000000);
INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Andorra', 'Europe', 468, 78115, 3712000000);
INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Angola', 'Africa', 1246700, 20609294, 100990000000);
INSERT INTO `World` (name, continent, area, population, gdp) VALUES ('Australia', 'Australia', 7692024, 25180200, 1418275000000);

SET FOREIGN_KEY_CHECKS = 1;
