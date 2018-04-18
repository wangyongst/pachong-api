package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Market.class, idClass = Integer.class)
public interface MarketRepository extends JpaRepository<Market, Integer> {
    public List<Market> findAllByFisheryId(Integer fisheryId);
}