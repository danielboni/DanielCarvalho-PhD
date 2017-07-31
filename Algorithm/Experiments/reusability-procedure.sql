use query_history_1;
DESC tb_query_history;

select * from tb_abstract_service;

CREATE function Teste()
returns TABLE
as (SELECT * FROM tb_abstract_service);

CALL Teste();

-- IN abstracts is a string of abstract services' id separated by comma.
-- IN numberOfAbstracts is the number of abstract services in the incoming query.
DELIMITER $$
CREATE PROCEDURE ReusabilityAlgorithm(IN abstracts VARCHAR(100), IN numberOfAbstracts INT, 
										IN in_availability FLOAT(4,2), IN in_response_time FLOAT(4,2), IN in_price_per_call FLOAT(4,2), IN in_authentication INT,
                                        IN in_privacy INT, IN in_trust INT, IN in_degree_of_rawness INT, IN in_veracity INT, 
                                        IN in_production_time VARCHAR(50), IN in_production_rate FLOAT(10,2), IN in_freshness INT, IN in_provenance INT, 
                                        IN in_total_cost FLOAT(4,2), IN in_total_response_time FLOAT(10,2))
BEGIN
	DECLARE cursor_id int;
    DECLARE cursor_nome varchar(50);
    DECLARE cursor_desc varchar(100);
    DECLARE done INT DEFAULT FALSE;
    DECLARE cursor_equi_a CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								q.availability = in_availability AND
								q.response_time = in_response_time AND
								q.price_per_call = in_price_per_call AND
								q.authentication = in_authentication AND
								q.privacy = in_privacy AND
								q.trust = in_trust AND
								q.degree_of_rawness = in_degree_of_rawness AND
								q.veracity = in_veracity AND
								q.production_time = in_production_time AND
								q.production_rate = in_production_rate AND
								q.freshness = in_freshness AND
								q.provenance = in_provenance AND
								q.total_cost = in_total_cost AND
								q.total_response_time = in_total_response_time AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) < numberOfAbstracts));
    DECLARE cursor_equi_b CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								q.availability >= in_availability AND
								q.response_time <= in_response_time AND
								q.price_per_call <= in_price_per_call AND
								q.authentication >= in_authentication AND
								q.privacy >= in_privacy AND
								q.trust >= in_trust AND
								q.degree_of_rawness >= in_degree_of_rawness AND
								q.veracity >= in_veracity AND
								q.production_rate >= in_production_rate AND
								q.freshness >= in_freshness AND
								q.provenance >= in_provenance AND
								q.total_cost <= in_total_cost AND
								q.total_response_time <= in_total_response_time AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) < numberOfAbstracts));
    DECLARE cursor_equi_c CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								(q.availability < in_availability OR
                                 q.availability > in_availability OR
								 q.response_time < in_response_time OR
                                 q.response_time > in_response_time OR
								 q.price_per_call < in_price_per_call OR
                                 q.price_per_call > in_price_per_call OR
								 q.authentication > in_authentication OR
                                 q.authentication < in_authentication OR
								 q.privacy > in_privacy OR
                                 q.privacy < in_privacy OR
								 q.trust > in_trust OR
                                 q.trust < in_trust OR
								 q.degree_of_rawness > in_degree_of_rawness OR
                                 q.degree_of_rawness < in_degree_of_rawness OR
								 q.veracity > in_veracity OR
                                 q.veracity < in_veracity OR
								 q.production_rate > in_production_rate OR
                                 q.production_rate < in_production_rate OR
								 q.freshness > in_freshness OR
                                 q.freshness < in_freshness OR
								 q.provenance > in_provenance OR
                                 q.provenance < in_provenance OR
								 q.total_cost < in_total_cost OR
                                 q.total_cost > in_total_cost OR
                                 q.total_response_time < in_total_response_time OR
								 q.total_response_time > in_total_response_time) AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) < numberOfAbstracts));
    DECLARE cursor_i CURSOR FOR SELECT * FROM tb_abstract_service; 
    DECLARE cursor_i CURSOR FOR SELECT * FROM tb_abstract_service; 
    DECLARE cursor_i CURSOR FOR SELECT * FROM tb_abstract_service; 
    DECLARE cursor_sub_a CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								q.availability = in_availability AND
								q.response_time = in_response_time AND
								q.price_per_call = in_price_per_call AND
								q.authentication = in_authentication AND
								q.privacy = in_privacy AND
								q.trust = in_trust AND
								q.degree_of_rawness = in_degree_of_rawness AND
								q.veracity = in_veracity AND
								q.production_time = in_production_time AND
								q.production_rate = in_production_rate AND
								q.freshness = in_freshness AND
								q.provenance = in_provenance AND
								q.total_cost = in_total_cost AND
								q.total_response_time = in_total_response_time AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) >= numberOfAbstracts));
    DECLARE cursor_sub_b CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								q.availability >= in_availability AND
								q.response_time <= in_response_time AND
								q.price_per_call <= in_price_per_call AND
								q.authentication >= in_authentication AND
								q.privacy >= in_privacy AND
								q.trust >= in_trust AND
								q.degree_of_rawness >= in_degree_of_rawness AND
								q.veracity >= in_veracity AND
								q.production_rate >= in_production_rate AND
								q.freshness >= in_freshness AND
								q.provenance >= in_provenance AND
								q.total_cost <= in_total_cost AND
								q.total_response_time <= in_total_response_time AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) >= numberOfAbstracts));
    DECLARE cursor_sub_c CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								(q.availability < in_availability OR
                                 q.availability > in_availability OR
								 q.response_time < in_response_time OR
                                 q.response_time > in_response_time OR
								 q.price_per_call < in_price_per_call OR
                                 q.price_per_call > in_price_per_call OR
								 q.authentication > in_authentication OR
                                 q.authentication < in_authentication OR
								 q.privacy > in_privacy OR
                                 q.privacy < in_privacy OR
								 q.trust > in_trust OR
                                 q.trust < in_trust OR
								 q.degree_of_rawness > in_degree_of_rawness OR
                                 q.degree_of_rawness < in_degree_of_rawness OR
								 q.veracity > in_veracity OR
                                 q.veracity < in_veracity OR
								 q.production_rate > in_production_rate OR
                                 q.production_rate < in_production_rate OR
								 q.freshness > in_freshness OR
                                 q.freshness < in_freshness OR
								 q.provenance > in_provenance OR
                                 q.provenance < in_provenance OR
								 q.total_cost < in_total_cost OR
                                 q.total_cost > in_total_cost OR
                                 q.total_response_time < in_total_response_time OR
								 q.total_response_time > in_total_response_time) AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) >= numberOfAbstracts));
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
END $$
DELIMITER ;

DROP FUNCTION fn_verPreço;

CALL teste2();

select distinct q.id from tb_query_history q, tb_query_abstract a
where q.id = a.id_query and
q.availability = 95.0 and
q.response_time = 2.0 and
q.price_per_call = 0.5 and
q.authentication = 'yes' and
q.privacy = 'yes' and
q.trust = 'low' and
q.degree_of_rawness = 'low' and
q.veracity = 'reliable' and
q.production_time = 'working hours' and
q.production_rate = 2.0 and
q.freshness = 'no' and
q.provenance = 'not certified' and
q.total_cost = 10.0 and
q.total_response_time = 6.0 and
q.id not in (select distinct qq.id from tb_query_history qq, tb_query_abstract aa
where qq.id = aa.id_query and aa.id_abstract not in (1, 2, 3) and (select count(id_query) from tb_query_abstract where id_query = qq.id) < 3);



SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								(q.availability < in_availability OR
                                 q.availability > in_availability OR
								 q.response_time < in_response_time OR
                                 q.response_time > in_response_time OR
								 q.price_per_call < in_price_per_call OR
                                 q.price_per_call > in_price_per_call OR
								 q.authentication > in_authentication OR
                                 q.authentication < in_authentication OR
								 q.privacy > in_privacy OR
                                 q.privacy < in_privacy OR
								 q.trust > in_trust OR
                                 q.trust < in_trust OR
								 q.degree_of_rawness > in_degree_of_rawness OR
                                 q.degree_of_rawness < in_degree_of_rawness OR
								 q.veracity > in_veracity OR
                                 q.veracity < in_veracity OR
								 q.production_rate > in_production_rate OR
                                 q.production_rate < in_production_rate OR
								 q.freshness > in_freshness OR
                                 q.freshness < in_freshness OR
								 q.provenance > in_provenance OR
                                 q.provenance < in_provenance OR
								 q.total_cost < in_total_cost OR
                                 q.total_cost > in_total_cost OR
                                 q.total_response_time < in_total_response_time OR
								 q.total_response_time > in_total_response_time) AND
								NOT EXISTS (SELECT aa.id FROM tb_abstrac aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) >= numberOfAbstracts));










-- Procedimento para testar o primeiro tipo de consultas: 
-- consultas equivalentes em termos de serviços abstratos
-- e equivalentes em termos de requisitos de qualidade de-
-- finidos pelo usuario. 
DELIMITER $$
CREATE PROCEDURE ReusabilityAlgorithmA (IN in_definition VARCHAR(100), IN abstracts VARCHAR(100), IN numberOfAbstracts INT, 
										IN in_availability FLOAT(4,2), IN in_response_time FLOAT(4,2), IN in_price_per_call FLOAT(4,2), IN in_authentication INT,
                                        IN in_privacy INT, IN in_trust INT, IN in_degree_of_rawness INT, IN in_veracity INT, IN in_data_type varchar(50),
                                        IN in_production_time VARCHAR(50), IN in_production_rate FLOAT(10,2), IN in_freshness INT, IN in_provenance INT, 
                                        IN in_total_cost FLOAT(4,2), IN in_total_response_time FLOAT(10,2))
BEGIN
	DECLARE composition_id int;
    DECLARE query_id int;
    DECLARE flag INT;
    DECLARE done INT DEFAULT FALSE;
    DECLARE cursor_equi_equi CURSOR FOR SELECT DISTINCT c.id_composition FROM tb_query_history q, tb_query_abstract a, tb_query_composition c
								WHERE q.id = a.id_query AND
                                q.id = c.id_query AND
                                c.is_available = true AND 
								q.availability = in_availability AND
								q.response_time = in_response_time AND
								q.price_per_call = in_price_per_call AND
								q.authentication = in_authentication AND
								q.privacy = in_privacy AND
								q.trust = in_trust AND
								q.degree_of_rawness = in_degree_of_rawness AND
								q.veracity = in_veracity AND
								q.production_time = in_production_time AND
								q.production_rate = in_production_rate AND
								q.freshness = in_freshness AND
								q.provenance = in_provenance AND
								q.total_cost = in_total_cost AND
								q.total_response_time = in_total_response_time AND
								q.id NOT IN (SELECT DISTINCT qq.id FROM tb_query_history qq, tb_query_abstract aa
								WHERE qq.id = aa.id_query AND (aa.id_abstract NOT IN (abstracts) OR (SELECT COUNT(id_query) FROM tb_query_abstract WHERE id_query = qq.id) < numberOfAbstracts));
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
	
    INSERT INTO tb_query_history VALUE ('reused', in_definition, in_availability, in_response_time, in_price_per_call, in_authentication, in_privacy, in_trust, in_degree_of_rawness, 
										in_veracity, in_production_time, in_production_rate, in_data_type, in_freshness, in_provenance, in_total_cost, in_total_response_time, in_production_rate);
	SET query_id = LAST_INSERT_ID();
    SET flag = 0;
    
    OPEN cursor_equi_equi;
    read_loop: LOOP
		FETCH cursor_equi_equi INTO composition_id;
        
        IF done THEN
			LEAVE read_loop;
		END IF;
    
		INSERT INTO tb_query_composition VALUES (query_id, composition_id);
		SET flag = flag + 1;
    END LOOP;
    CLOSE cursor_equi_equi;
    
    IF flag THEN
		RETURN (SELECT query_id from tb_query_history);
	END IF;
    
END $$
DELIMITER ;