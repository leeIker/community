CREATE TABLE `user` (
	`id` int(15) NOT NULL AUTO_INCREMENT,
	`name` varchar(32) NOT NULL,
	`password` varchar(60) NOT NULL,
	`createTime` bigint NOT NULL,
	`userToken` varchar(500) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
