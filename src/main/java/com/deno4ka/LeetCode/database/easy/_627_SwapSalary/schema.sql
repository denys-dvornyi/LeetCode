CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
     `id` INT NOT NULL AUTO_INCREMENT,
     `name` VARCHAR(100),
     `sex` CHAR(1),
     `salary` INT,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `salary` (id, name, sex, salary) VALUES (1, 'A', 'm', 2500);
INSERT INTO `salary` (id, name, sex, salary) VALUES (2, 'B', 'f', 1500);
INSERT INTO `salary` (id, name, sex, salary) VALUES (3, 'C', 'm', 5500);
INSERT INTO `salary` (id, name, sex, salary) VALUES (4, 'D', 'f', 500);

SET FOREIGN_KEY_CHECKS = 1;
