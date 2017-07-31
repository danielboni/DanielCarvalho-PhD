use query_history_test1;

-- Em algum momento por o ID para ser automatico
insert into tb_abstract_service values
(1, 'A1(x?, y!)', 'given disease x, returns infected patients y'),
(2, 'A2(x?, y!)', 'given patient x, returns his pernonal information y'),
(3, 'A3(x?, y!)', 'given doctor x, returns threated patients y'),
(4, 'A4(x?, y!)', 'given patient x, returns dna information y'),
(5, 'A5(x?, y!)', 'given hospital x, returns patients y'),
(6, 'A6(x?, y!)', 'given hospital x, returns doctors y');

INSERT INTO tb_query_history VALUE ('reused', in_definition, in_availability, in_response_time, in_price_per_call, in_authentication, in_privacy, in_trust, in_degree_of_rawness, 
										in_veracity, in_production_time, in_production_rate, in_data_type, in_freshness, in_provenance, in_total_cost, in_total_response_time);