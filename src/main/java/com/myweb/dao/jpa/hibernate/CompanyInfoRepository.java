package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Company;
import com.myweb.pojo.CompanyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Company.class, idClass = Integer.class)
public interface CompanyInfoRepository extends JpaRepository<CompanyInfo, Integer> {

    public List<CompanyInfo> findByNo(String no);

    public List<CompanyInfo> findByEnname(String enname);
}