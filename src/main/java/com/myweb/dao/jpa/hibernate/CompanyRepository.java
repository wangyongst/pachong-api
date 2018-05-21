package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Company.class, idClass = Integer.class)
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    public List<Company> findByNo(String no);

    public List<Company> findByName(String name);

    public List<Company> findByEnname(String enname);
}