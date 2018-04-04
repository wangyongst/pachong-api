package com.myweb.service;


import com.myweb.pojo.Fishery;
import com.myweb.pojo.User;
import com.utils.Result;

public interface OneService {

    public Result registry(User user);

    public Result getUser(User user);

    public Result setNickName(User user);

    public Result setAvatar(User user);

    public Result getReferUrl(User user);

    public Result bind(Fishery fishery);
}
