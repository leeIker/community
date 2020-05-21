CREATE TABLE `pri_for_name` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`add_name` boolean NOT NULL,
	`delete_name` boolean NOT NULL,
	`name_modify` boolean NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
