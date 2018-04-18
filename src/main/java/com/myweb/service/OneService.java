package com.myweb.service;


import com.myweb.pojo.*;
import com.utils.Result;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

public interface OneService {

    public Result registry(User user);

    public Result setNickName(User user);

    public Result setAvatar(MultipartFile multipartFile, User user);

    public Result getReferUrl(User user);

    public Result setName(Fishery fishery);

    public Result bind(Fishery fishery);

    public Result unbind(Fishery fishery);

    public Result sell(Market market);

    public Result unsell(Market market);

    public Result buy(Fishery fishery,Refer refer);

    public Result favor(Market market);

    public Result get(User user);

    public Result query(Opslog opslog,Pageable pageable);

    public Result createLog(Opslog opslog);

    public Result getFishery(Fishery fishery);
}
