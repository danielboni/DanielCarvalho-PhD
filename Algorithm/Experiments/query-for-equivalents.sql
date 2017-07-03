-- Query for selecting EQUIVALENT queries in the history --

SELECT DISTINCT q.id FROM tb_query_history q, tb_query_abstract a
WHERE q.id = a.id_query AND
q.availability = 95.0 AND
q.response_time = 2.0 AND
q.price_per_call = 0.5 AND
q.authentication = 'yes' AND
q.privacy = 'yes' AND
q.trust = 'low' AND
q.degree_of_rawness = 'low' AND
q.veracity = 'reliable' AND
q.production_time = 'working hours' AND
q.production_rate = 2.0 AND
q.freshness = 'no' AND
q.provenance = 'not certified' AND
q.total_cost = 10.0 AND
q.total_response_time = 6.0 AND
q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
WHERE qq.id = aa.id_query AND aa.id_abstract NOT IN (1, 2, 3) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) < 3);