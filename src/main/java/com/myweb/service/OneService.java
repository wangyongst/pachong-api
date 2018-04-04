package com.myweb.service;


import com.myweb.pojo.*;
import com.utils.Result;

public interface OneService {

    public Result registry(User user);

    public Result setNickName(User user);

    public Result setAvatar(User user);

    public Result getReferUrl(User user);

    public Result bind(Fishery fishery);

    public Result unbind(Fishery fishery);

    public Result sell(Fishery fishery);

    public Result unsell(Fishery fishery);

    public Result buy(Market market);

    public Result favor(Market market);

    public Result query(Opslog opslog);

    public Result record(Refer refer);

    public Result queryCount(Refer refer);

    public Result queryFees(Refer refer);
}
