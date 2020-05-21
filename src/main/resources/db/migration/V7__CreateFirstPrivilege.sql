create table first_privilege(
	id_first_privilege int not null auto_increment,
	id_role int ,
	name char(50),
	primary key(id_first_privilege),
	foreign key(id_role) references role_privilege(id_role)
)auto_increment=100