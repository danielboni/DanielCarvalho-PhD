create database if not exists query_history_8;
use query_history_8;

select * from tb_query_history;


create table if not exists tb_abstract_service (
id int primary key,
name varchar(50) not null,
description varchar(100) not null
);

insert into tb_abstract_service values
(1, 'A1', 'given disease x, returns infected patients y'),
(2, 'A2', 'given patient x, returns his pernonal information y'),
(3, 'A3', 'given doctor x, returns threated patients y'),
(4, 'A4', 'given patient x, returns dna information y'),
(5, 'A5', 'given hospital x, returns patients y'),
(6, 'A6', 'given hospital x, returns doctors y');

create table if not exists tb_concrete_service (
id int primary key,
name varchar(50) not null,
description varchar(100) not null
);

create table if not exists tb_concrete_abstract (
id_concrete  int not null,
id_abstract int not null,
foreign key (id_concrete) references tb_concrete_service (id),
foreign key (id_abstract) references tb_abstract_service (id),
primary key (id_concrete)
);

create table if not exists tb_query_history (
id int primary key,
status  varchar(50) not null,
timestap datetime not null,
description varchar(100) not null
);

create table if not exists tb_query_abstract (
id_query int not null,
id_abstract int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
primary key (id_query, id_abstract)
);

create table if not exists tb_coverage_domain (
id_query  int not null,
id_abstract int not null,
id_concrete int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
foreign key (id_concrete) references tb_concrete_service (id),
primary key (id_query, id_abstract, id_concrete)
);

create table if not exists tb_combination (
id  int not null,
id_concrete int not null,
foreign key (id_concrete) references tb_concrete_service (id),
primary key (id, id_concrete)
);

create table if not exists tb_rewriting (
id_query  int not null,
id_combination int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_combination) references tb_combination (id),
primary key (id_query, id_combination)
);

alter table tb_query_history add column definition varchar(100);
alter table tb_query_history add column availability int;
alter table tb_query_history add column response_time int;
alter table tb_query_history add column price_per_call float(4,2);
alter table tb_query_history add column authentication varchar(50);
alter table tb_query_history add column privacy varchar(50);
alter table tb_query_history add column trust varchar(50);
alter table tb_query_history add column degree_of_rawness varchar(50);
alter table tb_query_history add column veracity varchar(50);
alter table tb_query_history add column production_time varchar(50);
alter table tb_query_history add column production_rate float(10,2);
alter table tb_query_history add column data_type varchar(50);
alter table tb_query_history add column freshness varchar(50);
alter table tb_query_history add column provenance varchar(50);
alter table tb_query_history add column total_cost float(4,2);
alter table tb_query_history add column total_response_time float(10,2);

alter table tb_query_history change production_rate production_rate float(10,2);

alter table tb_concrete_service add column availability int;
alter table tb_concrete_service add column response_time int;
alter table tb_concrete_service add column price_per_call float(4,2);
alter table tb_concrete_service add column authentication varchar(50);
alter table tb_concrete_service add column privacy varchar(50);
alter table tb_concrete_service add column trust varchar(50);
alter table tb_concrete_service add column degree_of_rawness varchar(50);
alter table tb_concrete_service add column veracity varchar(50);
alter table tb_concrete_service add column production_time varchar(50);
alter table tb_concrete_service add column production_rate float(10,2);
alter table tb_concrete_service add column data_type varchar(50);
alter table tb_concrete_service add column freshness varchar(50);
alter table tb_concrete_service add column provenance varchar(50);

alter table tb_query_history drop column description;
