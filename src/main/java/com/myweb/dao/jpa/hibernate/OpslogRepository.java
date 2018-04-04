package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Opslog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryDefinition(domainClass = Opslog.class, idClass = Integer.class)
public interface OpslogRepository extends JpaRepository<Opslog, Integer> {

}