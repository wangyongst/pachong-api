package com.myweb.service.impl;

import com.myweb.dao.jpa.hibernate.*;
import com.myweb.pojo.*;
import com.myweb.service.OneService;
import com.myweb.vo.GetReferUrlVo;
import com.utils.Result;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;


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
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result registry(User user) {
        Result result = new Result();
        if (StringUtils.isBlank(user.getAddress()) || StringUtils.isBlank(user.getSignMessage()) || StringUtils.isBlank(user.getSignedMessage())) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        //判断签名

        //
        if (userRepository.findByAddress(user.getAddress()).size() > 0) {
            result.setMessage("This address has been registered!");
            return result;
        }
        user.setReferCode(RandomStringUtils.randomAlphanumeric(8));
        User savedUser = userRepository.save(user);
        result.setStatus(1);
        result.setData(savedUser);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result setNickName(User user) {
        Result result = new Result();
        if (StringUtils.isBlank(user.getNickName()) || user.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        User savedUser = userRepository.findOne(user.getId());
        savedUser.setNickName(user.getNickName());
        User savedUserIn = userRepository.save(savedUser);
        result.setStatus(1);
        result.setData(savedUserIn);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result setAvatar(User user) {
        Result result = new Result();
        if (StringUtils.isBlank(user.getNickName()) || user.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        User savedUser = userRepository.findOne(user.getId());
        savedUser.setAvatar(user.getAvatar());
        userRepository.save(savedUser);
        result.setStatus(1);
        result.setData(savedUser);
        return result;
    }

    @Override
    public Result getReferUrl(User user) {
        Result result = new Result();
        if (user.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        User savedUser = userRepository.findOne(user.getId());
        int referCount = referRepository.countIdByReferCode(savedUser.getReferCode());
        BigDecimal sumReferFee = referRepository.sumReferFeeByReferCode(savedUser.getReferCode());
        GetReferUrlVo gruv = new GetReferUrlVo();
        gruv.setReferCode(savedUser.getReferCode());
        gruv.setReferCount(referCount);
        gruv.setSumReferFee(sumReferFee);
        result.setStatus(1);
        result.setData(gruv);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result setName(Fishery fishery) {
        Result result = new Result();
        if (StringUtils.isBlank(fishery.getName()) || fishery.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Fishery savedFishery = fisheryRepository.findOne(fishery.getId());
        savedFishery.setName(fishery.getName());
        fisheryRepository.save(savedFishery);
        result.setStatus(1);
        result.setData(savedFishery);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result bind(Fishery fishery) {
        Result result = new Result();
        if (StringUtils.isBlank(fishery.getBindAddress()) || fishery.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Fishery savedFishery = fisheryRepository.findOne(fishery.getId());
        savedFishery.setBindAddress(fishery.getBindAddress());
        if (StringUtils.isBlank(savedFishery.getBindAddress())) {
            savedFishery.setBindStatus("first binding");
        } else {
            savedFishery.setBindStatus("binding");
        }
        Fishery savedFisheryIn = fisheryRepository.save(savedFishery);
        result.setStatus(1);
        result.setData(savedFisheryIn);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result unbind(Fishery fishery) {
        Result result = new Result();
        if (fishery.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Fishery savedFishery = fisheryRepository.findOne(fishery.getId());
        savedFishery.setBindStatus("unbinding");
        fisheryRepository.save(savedFishery);
        result.setStatus(1);
        result.setData(savedFishery);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result sell(Market market) {
        Result result = new Result();
        if (market.getFisheryId() == 0 || market.getStartPrice() == null || market.getStopPrice() == null || market.getSellDuration() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Fishery savedFishery = fisheryRepository.findOne(market.getFisheryId());
        if (savedFishery.getSellStatus().equals("selling")) {
            result.setMessage("The Fishery is selling in market!");
            return result;
        }
        savedFishery.setSellStatus("selling");
        fisheryRepository.save(savedFishery);
        market.setSellStatus("selling");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long currentTime = System.currentTimeMillis();
        market.setSellStartTime(df.format(currentTime));
        market.setFavorCount(0);
        Market savedMarket = marketRepository.save(market);
        result.setStatus(1);
        result.setData(savedMarket);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result unsell(Market market) {
        Result result = new Result();
        if (market.getFisheryId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Fishery savedFishery = fisheryRepository.findOne(market.getFisheryId());
        if (savedFishery.getSellStatus().equals("unselled")) {
            result.setMessage("The Fishery is unselled in market!");
            return result;
        }
        savedFishery.setSellStatus("unselled");
        fisheryRepository.save(savedFishery);
        marketRepository.deleteAllByFisheryId(market.getFisheryId());
        result.setStatus(1);
        result.setData(savedFishery);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result buy(Fishery fishery,Refer refer) {
        Result result = new Result();
        if (fishery.getId() == 0 || fishery.getUserId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        if(StringUtils.isNotBlank(refer.getReferCode())){
            refer.setStatus("buy");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long currentTime = System.currentTimeMillis();
            refer.setCreateTime(df.format(currentTime));
            referRepository.save(refer);
        }
        Fishery savedFishery = fisheryRepository.findOne(fishery.getId());
        savedFishery.setSellStatus("");
        savedFishery.setUserId(fishery.getUserId());
        fisheryRepository.save(savedFishery);
        marketRepository.deleteAllByFisheryId(fishery.getId());
        result.setStatus(1);
        result.setData(savedFishery);
        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public Result favor(Market market) {
        Result result = new Result();
        if (market.getId() == 0) {
            result.setMessage("The required parameters are empty!");
            return result;
        }
        Market savedMarket = marketRepository.findOne(market.getId());
        savedMarket.setFavorCount(savedMarket.getFavorCount() + 1);
        marketRepository.save(savedMarket);
        result.setStatus(1);
        result.setData(savedMarket);
        return result;
    }

    @Override
    public Result query(Opslog opslog) {
        Result result = new Result();
        List<Opslog> opslogList = opslogRepository.findByUserId(opslog.getUserId());
        result.setStatus(1);
        result.setData(opslogList);
        return result;
    }

    @Override
    public void createLog(Opslog opslog) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long currentTime = System.currentTimeMillis();
        opslog.setActionTime(df.format(currentTime));
        opslogRepository.save(opslog);
    }
}
