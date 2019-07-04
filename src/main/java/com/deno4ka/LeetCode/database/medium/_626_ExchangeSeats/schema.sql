CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
     `id` INT,
     `student` VARCHAR(255)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `seat` (`id`, `student`) VALUES (1, 'Abbot');
INSERT INTO `seat` (`id`, `student`) VALUES (2, 'Doris');
INSERT INTO `seat` (`id`, `student`) VALUES (3, 'Emerson');
INSERT INTO `seat` (`id`, `student`) VALUES (4, 'Green');
INSERT INTO `seat` (`id`, `student`) VALUES (5, 'Jeames');

SET FOREIGN_KEY_CHECKS = 1;
