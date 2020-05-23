create table base_good_class(
	id_base  int not null auto_increment,
	id_second int not null ,
	name  char(50),
	primary key(id_base),
	foreign key(id_second) references second_good_class(id_second)
)auto_increment=500