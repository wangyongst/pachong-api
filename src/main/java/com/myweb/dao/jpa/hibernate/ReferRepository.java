package com.myweb.dao.jpa.hibernate;

import com.myweb.pojo.Opslog;
import com.myweb.pojo.Refer;
import com.myweb.vo.SumReferFeeVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryDefinition(domainClass = Refer.class, idClass = Integer.class)
public interface ReferRepository extends JpaRepository<Refer, Integer> {

    public List<Refer> findByReferCode (String referCode);

    @Query("select new com.myweb.vo.SumReferFeeVo(sum(refer.referFee)) from Refer refer where refer.referCode = ?1")
    public SumReferFeeVo countSumByReferCode(String referCode);
}