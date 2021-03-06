package com.project.ticketservice.repository.elasticSearch;

import com.project.ticketservice.entity.elasticSearch.TicketModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel,String> {
}
