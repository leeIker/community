create table second_good_class(
	id_second int not null  auto_increment,
	id_first int not null,
	name   char(50) not null,
	primary key(id_second),
	foreign key(id_first) references first_good_class(id_first)
)auto_increment=100