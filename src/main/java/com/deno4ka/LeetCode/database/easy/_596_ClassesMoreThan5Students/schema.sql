CREATE DATABASE  IF NOT EXISTS `leet_code`;
USE `leet_code`;

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses` (
     `id` INT NOT NULL AUTO_INCREMENT,
     `student` VARCHAR(255),
     `class` VARCHAR(255),
     PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

# INSERT INTO `courses` (student, class) VALUES ('A', 'Math');
# INSERT INTO `courses` (student, class) VALUES ('B', 'English');
# INSERT INTO `courses` (student, class) VALUES ('C', 'Math');
# INSERT INTO `courses` (student, class) VALUES ('D', 'Biology');
# INSERT INTO `courses` (student, class) VALUES ('E', 'Math');
# INSERT INTO `courses` (student, class) VALUES ('F', 'Computer');
# INSERT INTO `courses` (student, class) VALUES ('G', 'Math');
# INSERT INTO `courses` (student, class) VALUES ('H', 'Math');
# INSERT INTO `courses` (student, class) VALUES ('I', 'Math');

INSERT INTO `courses` (student, class) VALUES ('A','Math');
INSERT INTO `courses` (student, class) VALUES ('B','English');
INSERT INTO `courses` (student, class) VALUES ('C','Math');
INSERT INTO `courses` (student, class) VALUES ('D','Biology');
INSERT INTO `courses` (student, class) VALUES ('E','Math');
INSERT INTO `courses` (student, class) VALUES ('F','Math');
INSERT INTO `courses` (student, class) VALUES ('A','Math');

SET FOREIGN_KEY_CHECKS = 1;
