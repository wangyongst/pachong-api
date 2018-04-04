package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Refer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Refer.class, idClass = Integer.class)
public interface ReferRepository extends JpaRepository<Refer, Integer> {

}