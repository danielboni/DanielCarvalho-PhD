use query_history;
show tables;

select * from tb_concrete_service;



describe tb_abstract_service;
select * from tb_abstract_service;

describe tb_concrete_service;
describe tb_concrete_abstract;
describe tb_query_abstract;
describe tb_query_history;
describe tb_combination;
describe tb_rewriting;


SELECT * FROM tb_query_history q;
SELECT * FROM tb_query_abstract q;

select q.id, a.id_query, a.id_abstract
from tb_query_history q, tb_query_abstract a
where q.id = a.id_query and 
(a.id_abstract = 1 or a.id_abstract = 2) and
((select count(*) from tb_query_abstract a2 where a2.id_query = q.id) = 2);


select q.id, a.id_query, count(*)
from tb_query_history q, tb_query_abstract a
where q.id = a.id_query 
group by q.id
having count(*) = 2;



select distinct * 
from tb_query_history q, tb_query_abstract a
where q.id = a.id_query;



select distinct q.id from tb_query_history q, tb_query_abstract a 
where q.id = a.id_query and 
( a.id_abstract = 1 or a.id_abstract = 2 ) and q.availability <= 95.0 and q.response_time >= 2.0 
and q.price_per_call >= 0.5 and (q.authentication = 'yes' or q.authentication = 'no') and 
(q.privacy = 'yes' or q.privacy = 'no') and (q.trust = 'low' or q.trust = 'medium') and q.degree_of_rawness = 'low' and 
(q.veracity = 'reliable' or q.veracity = 'unreliable') and q.production_time = 'working hours' and q.production_rate >= 2.0 and q.freshness = 'no' 
and q.provenance = 'not certified' and q.total_cost >= 10.0 and q.total_response_time >= 6.0 ;


SELECT * FROM tb_query_history q;
SELECT * FROM tb_query_abstract q;

select distinct q.id from tb_query_history q, tb_query_abstract a 
where q.id = a.id_query and 
( a.id_abstract = 1 or a.id_abstract = 2 ) and q.availability >= 95.0 and q.response_time <= 2.0 
and q.price_per_call <= 0.5 and (q.authentication = 'yes') and 
(q.privacy = 'yes') and (q.trust = 'high' or q.trust = 'medium') and (q.degree_of_rawness = 'low' or q.degree_of_rawness = 'medium' or q.degree_of_rawness = 'high') and 
(q.veracity = 'reliable') and q.production_time = 'working hours' and q.production_rate <= 2.0 and (q.freshness = 'no' or q.freshness = 'yes') 
and (q.provenance = 'not certified' or q.provenance = 'certified') and q.total_cost <= 10.0 and q.total_response_time <= 6.0 ;

use query_history_11;

select * from tb_query_history;

select distinct q.id from tb_query_history q, tb_query_abstract a where q.id = a.id_query and
 q.availability <= 96.0 and q.response_time <= 2.0 and q.price_per_call <= 0.5 and
 (q.authentication = 'yes' or q.authentication = 'no') and (q.privacy = 'yes' or q.privacy = 'no') and (q.trust = 'low' or q.trust = 'medium') and q.degree_of_rawness = 'low' and (q.veracity = 'reliable' or q.veracity = 'unreliable') and q.production_time = 'working hours' and q.production_rate <= 2.0 and q.freshness = 'yes' and q.provenance = 'not certified' and q.total_cost <= 10.0 and q.total_response_time >= 6.0 
and q.id not in (select distinct qq.id from tb_query_history qq, tb_query_abstract aa where qq.id = aa.id_query and aa.id_abstract not in (1, 2, 3));

select distinct qq.id from tb_query_history qq, tb_query_abstract aa where qq.id = aa.id_query and aa.id_abstract not in (1, 2, 3);

select * from tb_query_abstract where id_query = 1;

select * from tb_query_abstract a where a.id_query = 1;