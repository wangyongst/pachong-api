package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Refer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Refer.class, idClass = Integer.class)
public interface ReferRepository extends JpaRepository<Refer, Integer> {

    public int countAllByReferCode(String referCode);

    @Query("select sum(refer.referFee) from Refer refer where refer.referCode = ?1")
    public BigDecimal sumReferFeeByReferCode(String referCode);
}