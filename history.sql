create database if not exists query_history;
use query_history;

create table if not exists tb_abstract_service (
id int primary key auto_increment,
name varchar(50) not null,
description varchar(80) not null
);

show tables;
desc tb_abstract_service;

insert into tb_abstract_service values
(default, 'A1', 'given disease x, returns infected patients y'),
(default, 'A2', 'given patient x, returns his pernonal information y'),
(default, 'A3', 'given doctor x, returns threated patients y'),
(default, 'A4', 'given patient x, returns dna information y'),
(default, 'A5', 'given hospital x, returns patients y'),
(default, 'A6', 'given hospital x, returns doctors y');

select * from tb_abstract_service;

create table if not exists tb_concrete_service (
id int primary key auto_increment,
name varchar(50) not null,
description varchar(80) not null
);

desc tb_concrete_service;

insert into tb_concrete_service values
(default, 'DS11', 'given patient x, returns his personal information y'),
(default, 'DS12', 'given patient x, returns his personal information y'),
(default, 'DS13', 'given patient x, returns his personal information y'),
(default, 'DS14', 'given patient x, returns his personal information y'),
(default, 'DS15', 'given patient x, returns his personal information y');

select * from tb_concrete_service;


create table if not exists tb_concrete_abstract (
id int primary key auto_increment,
id_concrete  int not null,
id_abstract int not null,
foreign key (id_concrete) references tb_concrete_service (id),
foreign key (id_abstract) references tb_abstract_service (id)
);

select * from tb_concrete_abstract;

create table if not exists tb_query_history (
id int primary key auto_increment,
status  varchar(50) not null,
timestap datetime not null
);

select * from tb_query_history;



create table if not exists tb_query_abstract (
id_query int not null,
id_abstract int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
primary key (id_query, id_abstract)
);


desc tb_query_abstract;

select * from tb_query_abstract ;

create table if not exists tb_coverage_domain (
id_query  int not null,
id_abstract int not null,
id_concrete int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
foreign key (id_concrete) references tb_concrete_service (id),
primary key (id_query, id_abstract, id_concrete)
);

alter table tb_coverage_domain 
drop foreign key tb_coverage_domain_ibfk_1;
delete from tb_concrete_service where id = 20;

											
                                                        
													
                                                                
                                                                
                                                                