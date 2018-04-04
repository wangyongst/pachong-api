package com.myweb.service.impl;

import com.myweb.dao.jpa.hibernate.*;
import com.myweb.pojo.Fishery;
import com.myweb.pojo.User;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("OneService")
@SuppressWarnings("All")
@Transactional(readOnly = true)
public class OneServiceImpl implements OneService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FisheryRepository fisheryRepository;

    @Autowired
    private MarketRepository marketRepository;

    @Autowired
    private OpslogRepository opslogRepository;

    @Autowired
    private ReferRepository referRepository;


    @Override
    public Result registry(User user) {
        Result result = new Result();
        User savedUser = userRepository.save(user);
        if (savedUser != null) {
            result.setStatus(1);
            result.setData(savedUser);
            result.setMessage("User registry success!");
        } else {
            result.setStatus(0);
            result.setMessage("User registry unsuccess!");
        }
        return result;
    }

    public Result getUser(User user) {
        Result result = new Result();
        User savedUser = userRepository.getOne(user.getId());
        if (savedUser != null) {
            result.setStatus(1);
            result.setData(savedUser);
            result.setMessage("User get success!");
        } else {
            result.setStatus(0);
            result.setMessage("User get unsuccess!");
        }
        return result;
    }

    @Override
    public Result setNickName(User user) {
        Result result = new Result();
        User savedUser = userRepository.getOne(user.getId());
        savedUser.setNickName(user.getNickName());
        User savedUserIn = userRepository.save(savedUser);
        if (savedUserIn != null) {
            result.setStatus(1);
            result.setData(savedUserIn);
            result.setMessage("User registry success!");
        } else {
            result.setStatus(0);
            result.setMessage("User registry unsuccess!");
        }
        return result;
    }

    @Override
    public Result setAvatar(User user) {
        Result result = new Result();
        User savedUser = userRepository.getOne(user.getId());
        savedUser.setAvatar(user.getAvatar());
        User savedUserIn = userRepository.save(savedUser);
        if (savedUserIn != null) {
            result.setStatus(1);
            result.setData(savedUserIn);
            result.setMessage("User registry success!");
        } else {
            result.setStatus(0);
            result.setMessage("User registry unsuccess!");
        }
        return result;
    }

    @Override
    public Result getReferUrl(User user) {
        Result result = new Result();
        User savedUser = userRepository.getOne(user.getId());
        if (savedUser != null) {
            result.setStatus(1);
            result.setData(savedUser);
            result.setMessage("User get success!");
        } else {
            result.setStatus(0);
            result.setMessage("User get unsuccess!");
        }
        return result;
    }

    @Override
    public Result bind(Fishery fishery) {
        return null;
    }


}
