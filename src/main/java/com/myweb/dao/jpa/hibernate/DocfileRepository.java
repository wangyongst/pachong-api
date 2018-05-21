package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Docfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Docfile.class, idClass = Integer.class)
public interface DocfileRepository extends JpaRepository<Docfile, Integer> {

    public List<Docfile> findByNoOrderByIdAsc(String no);
}