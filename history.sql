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

/* Q1 > Q2 */

-- Pego o dominio de abstratos de Q2 
select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id;

-- Pego o dominio de abstratos de Q1
select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '6' and tb_coverage_domain.id_abstract =tb_abstract_service.id;


-- Pegar a parte do dominio de Q1 que nao pertence a Q2 
select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '6' and tb_coverage_domain.id_abstract = tb_abstract_service.id and
tb_coverage_domain.id_abstract not in (select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id);

select tb_coverage_domain.id_abstract, tb_coverage_domain.id_concrete, tb_concrete_service.name from tb_coverage_domain, tb_abstract_service, tb_concrete_service
where tb_coverage_domain.id_query = '6' and tb_coverage_domain.id_abstract = tb_abstract_service.id and tb_coverage_domain.id_concrete = tb_concrete_service.id and
tb_coverage_domain.id_abstract not in (select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id);




-- Algorithm X: Q2 (new query) and Q1 (previous). Q1 is contained in Q2. Thus,
-- algorithm X retrieves concrete services that completes the query Q2. For this
-- example Q2 is id=6 and Q1 is id=1.

select distinct c.id, c.name, ab.name from tb_concrete_service c, tb_concrete_abstract ca, tb_abstract_service ab
where c.id = ca.id_concrete and ab.id = ca.id_abstract and
ca.id_abstract in (select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
						where tb_coverage_domain.id_query = '6' and tb_coverage_domain.id_abstract = tb_abstract_service.id and
						tb_coverage_domain.id_abstract not in (select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
																where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id))
;


select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
						where tb_coverage_domain.id_query = '6' and tb_coverage_domain.id_abstract = tb_abstract_service.id and
						tb_coverage_domain.id_abstract not in (select distinct tb_coverage_domain.id_abstract from tb_coverage_domain, tb_abstract_service
																where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id)