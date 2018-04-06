package com.myweb.service;


import com.myweb.pojo.*;
import com.utils.Result;

public interface OneService {

    public Result registry(User user);

    public Result setNickName(User user);

    public Result setAvatar(User user);

    public Result getReferUrl(User user);

    public Result setName(Fishery fishery);

    public Result bind(Fishery fishery);

    public Result unbind(Fishery fishery);

    public Result sell(Market market);

    public Result unsell(Market market);

    public Result buy(Fishery fishery,Refer refer);

    public Result favor(Market market);

    public Result query(Opslog opslog);

    public void createLog(Opslog opslog);

}
