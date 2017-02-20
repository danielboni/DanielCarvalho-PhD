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


use query_history;

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
																where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id);
                                                                
select * from tb_query_history;
select * from tb_composition;



-- Algorithm Z: Q2 (new query) and Q1 (previous). Q1 contains Q2. Thus,
-- algorithm Z makes a projection of the compositions of Q1 that satisfies Q2. 
-- For this example Q1 is id=6 and Q2 is id=1.

select c.id, c.id_concrete from tb_composition c, tb_concrete_abstract abs
where c.id_query = '6' and 
      c.id_concrete = abs.id_concrete and
      abs.id_abstract in (
	      select distinct tb_coverage_domain.id_abstract
          from tb_coverage_domain
          where tb_coverage_domain.id_query = '1' 
      )
order by c.id;


-- Recupera do dominio de corbertura da query passada no id com o nome do abstract.
select distinct tb_coverage_domain.id_abstract,  tb_abstract_service.name
from tb_coverage_domain, tb_abstract_service
where tb_coverage_domain.id_query = '1' and tb_coverage_domain.id_abstract =tb_abstract_service.id;	
                                                                
-- Recupera do dominio de corbertura da query passada no id.
select distinct tb_coverage_domain.id_abstract
from tb_coverage_domain
where tb_coverage_domain.id_query = '1';				