package com.myweb.service;


import com.myweb.pojo.*;
import com.utils.Result;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface OneService {

    public Result query(Company company, Integer type) throws Exception;

    public Result search(Company company, Integer type);

}
