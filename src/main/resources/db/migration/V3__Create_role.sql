CREATE TABLE `role` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`name` char(20) NULL,
	`pri_for_oder` boolean NOT NULL,
	`pri_for_user` boolean NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
