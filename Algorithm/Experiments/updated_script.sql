drop database query_history_test1;
create database if not exists query_history_test1;
use query_history_test1;

create table if not exists tb_abstract_service (
id int primary key,
definition varchar(100) not null,
description varchar(100) not null
);

insert into tb_abstract_service values
(1, 'A1(x?, y!)', 'given disease x, returns infected patients y'),
(2, 'A2(x?, y!)', 'given patient x, returns his pernonal information y'),
(3, 'A3(x?, y!)', 'given doctor x, returns threated patients y'),
(4, 'A4(x?, y!)', 'given patient x, returns dna information y'),
(5, 'A5(x?, y!)', 'given hospital x, returns patients y'),
(6, 'A6(x?, y!)', 'given hospital x, returns doctors y');

create table if not exists tb_query_history (
id int primary key,
query_type  varchar(50) not null,
ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
definition varchar(100) not null,
availability FLOAT(4,2),
response_time FLOAT(4,2),
price_per_call float(4,2),
authentication INT,
privacy INT,
trust INT,
degree_of_rawness INT,
veracity INT,
production_time varchar(50),
production_rate float(10,2),
data_type varchar(50),
freshness INT,
provenance INT,
total_cost float(4,2),
total_response_time float(10,2)
);

create table if not exists tb_concrete_service (
id int primary key,
definition varchar(100) not null,
availability FLOAT(4,2),
response_time FLOAT(4,2),
price_per_call float(4,2),
authentication INT,
privacy INT,
trust INT,
degree_of_rawness INT,
veracity INT,
production_time varchar(50),
production_rate float(10,2),
data_type varchar(50),
freshness INT,
provenance INT
);

create table if not exists tb_concrete_abstract (
id_concrete  int not null,
id_abstract int not null,
foreign key (id_concrete) references tb_concrete_service (id),
foreign key (id_abstract) references tb_abstract_service (id),
primary key (id_concrete)
);

create table if not exists tb_query_abstract (
id_query int not null,
id_abstract int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
primary key (id_query, id_abstract)
);

/*
create table if not exists tb_coverage_domain (
id_query  int not null,
id_abstract int not null,
id_concrete int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_abstract) references tb_abstract_service (id),
foreign key (id_concrete) references tb_concrete_service (id),
primary key (id_query, id_abstract, id_concrete)
); */

create table if not exists tb_composition (
id  int not null,
id_concrete int not null,
foreign key (id_concrete) references tb_concrete_service (id),
primary key (id, id_concrete)
);

create table if not exists tb_query_composition (
id_query int not null,
id_composition int not null,
foreign key (id_query) references tb_query_history (id),
foreign key (id_composition) references tb_composition (id),
primary key (id_query, id_composition)
);

select * from tb_abstract_service;




