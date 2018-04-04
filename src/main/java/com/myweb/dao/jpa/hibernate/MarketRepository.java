package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Market.class, idClass = Integer.class)
public interface MarketRepository extends JpaRepository<Market, Integer> {

}