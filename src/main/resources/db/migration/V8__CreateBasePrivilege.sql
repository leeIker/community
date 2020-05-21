create table base_privilege(
	id_base_privilege int not null auto_increment,
	id_first_privilege int,
	name char(50),
	isUse boolean,
	primary key(id_base_privilege),
	foreign key(id_first_privilege) references first_privilege(id_first_privilege)
	
)auto_increment=500