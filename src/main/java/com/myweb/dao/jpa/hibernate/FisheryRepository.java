package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Fishery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Fishery.class, idClass = Integer.class)
public interface FisheryRepository extends JpaRepository<Fishery, Integer> {

}