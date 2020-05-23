create table goods(
	id_good int not null auto_increment,
	id_base int not null,
	name char(50) not null,
	price  int not null,
	des char(100),
	weight int ,
	primary key(id_good),
	foreign key(id_base) references base_good_class(id_base)
)