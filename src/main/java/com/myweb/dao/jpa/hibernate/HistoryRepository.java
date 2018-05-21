package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = History.class, idClass = Integer.class)
public interface HistoryRepository extends JpaRepository<History, Integer> {
    public List<History> findByNoOrderByDateAsc(String no);
}