package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Opslog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Opslog.class, idClass = Integer.class)
public interface OpslogRepository extends JpaRepository<Opslog, Integer> {

    public Page<Opslog> findAllByAddress(String address, Pageable pageable);
}