CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `cinema`;
CREATE TABLE `cinema` (
     `id` INT NOT NULL AUTO_INCREMENT,
     `movie` VARCHAR(255),
     `description` VARCHAR(255),
     `rating` FLOAT(2, 1),
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `cinema` (id, movie, description, rating) VALUES (1, 'War', 'great 3D', 8.9);
INSERT INTO `cinema` (id, movie, description, rating) VALUES (2, 'Science', 'fiction', '.5');
INSERT INTO `cinema` (id, movie, description, rating) VALUES (3, 'irish', 'boring', '.2');
INSERT INTO `cinema` (id, movie, description, rating) VALUES (4, 'Ice song', 'Fantacy', 8.6);
INSERT INTO `cinema` (id, movie, description, rating) VALUES (5, 'House card', 'Interesting', 9.1);

SET FOREIGN_KEY_CHECKS = 1;
