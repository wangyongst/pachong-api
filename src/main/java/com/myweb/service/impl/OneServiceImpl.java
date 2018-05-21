package com.myweb.service.impl;

import com.myweb.dao.jpa.hibernate.*;
import com.myweb.icris.IcrisApi;
import com.myweb.pojo.Company;
import com.myweb.service.OneService;
import com.myweb.vo.AllThings;
import com.utils.Result;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.List;


@Service("OneService")
@SuppressWarnings("All")
@Transactional(readOnly = true)
public class OneServiceImpl implements OneService {


    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DocfileRepository docfileRepository;

    @Autowired
    private HistoryRepository historyRepository;


    @Override
    public Result query(Company company, Integer type) throws Exception {
        Result result = new Result();
        if (StringUtils.isNotBlank(company.getNo()) && type != null && type == 0) {
            IcrisApi api = new IcrisApi();
            api.agree();
            api.chinese();
            api.pachong(Integer.parseInt(company.getNo()));
            List<Company> companies = companyRepository.findByNo(company.getNo());
            if (companies.size() != 1) {
                result.setMessage("Cant find Company by this NO");
                return result;
            }
            AllThings allThings = new AllThings();
            allThings.setCompany(companies.get(0));
            allThings.setHistories(historyRepository.findByNoOrderByDateAsc(companies.get(0).getNo()));
            allThings.setDocfiles(docfileRepository.findByNoOrderByIdAsc(companies.get(0).getNo()));
            result.setStatus(1);
            result.setData(allThings);
            return result;
        }
        else {
            result.setMessage("The required parameters are right!");
            return result;
        }
    }

    public Result search(Company company, Integer type) {
        Result result = new Result();
        if (StringUtils.isNotBlank(company.getNo()) && type != null && type == 0) {
            List<Company> companies = companyRepository.findByNo(company.getNo());
            if (companies.size() != 1) {
                result.setMessage("Cant find Company by this NO");
                return result;
            }
            AllThings allThings = new AllThings();
            allThings.setCompany(companies.get(0));
            allThings.setHistories(historyRepository.findByNoOrderByDateAsc(companies.get(0).getNo()));
            allThings.setDocfiles(docfileRepository.findByNoOrderByIdAsc(companies.get(0).getNo()));
            result.setStatus(1);
            result.setData(allThings);
            return result;
        } else if (StringUtils.isNotBlank(company.getName()) && type != null && type == 1) {
            List<Company> companies = companyRepository.findByNo(company.getNo());
            if (companies.size() == 0) {
                result.setMessage("Cant find Company by this Name");
                return result;
            } else {
                result.setStatus(1);
                result.setData(companies);
                return result;
            }
        } else if (StringUtils.isNotBlank(company.getEnname()) && type != null && type == 1) {
            List<Company> companies = companyRepository.findByEnname(company.getEnname());
            if (companies.size() == 0) {
                result.setMessage("Cant find Company by this ENName");
                return result;
            } else {
                result.setStatus(1);
                result.setData(companies);
                return result;
            }
        } else {
            result.setMessage("The required parameters are right!");
            return result;
        }
    }
}
