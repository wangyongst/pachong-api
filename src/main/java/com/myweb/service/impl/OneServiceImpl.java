package com.myweb.service.impl;

import com.myweb.dao.jpa.hibernate.*;
import com.myweb.pojo.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        Result result = new Result();
        Fishery savedFishery = fisheryRepository.getOne(fishery.getId());
        savedFishery.setBindAddress(fishery.getBindAddress());
        Fishery savedFisheryIn = fisheryRepository.save(savedFishery);
        if (savedFisheryIn != null) {
            result.setStatus(1);
            result.setData(savedFisheryIn);
            result.setMessage("Fishry bind success!");
        } else {
            result.setStatus(0);
            result.setMessage("Fishry bind unsuccess!");
        }
        return result;
    }

    @Override
    public Result unbind(Fishery fishery) {
        Result result = new Result();
        Fishery savedFishery = fisheryRepository.getOne(fishery.getId());
        savedFishery.setBindAddress(null);
        Fishery savedFisheryIn = fisheryRepository.save(savedFishery);
        if (savedFisheryIn != null) {
            result.setStatus(1);
            result.setData(savedFisheryIn);
            result.setMessage("Fishry unbind success!");
        } else {
            result.setStatus(0);
            result.setMessage("Fishry unbind unsuccess!");
        }
        return result;
    }

    @Override
    public Result sell(Fishery fishery) {
        Result result = new Result();
        Fishery savedFishery = fisheryRepository.getOne(fishery.getId());
        savedFishery.setSellStatus(1);
        Fishery savedFisheryIn = fisheryRepository.save(savedFishery);
        if (savedFisheryIn != null) {
            result.setStatus(1);
            result.setData(savedFisheryIn);
            result.setMessage("Fishry sell success!");
        } else {
            result.setStatus(0);
            result.setMessage("Fishry sell unsuccess!");
        }
        return result;
    }

    @Override
    public Result unsell(Fishery fishery) {
        Result result = new Result();
        Fishery savedFishery = fisheryRepository.getOne(fishery.getId());
        savedFishery.setSellStatus(0);
        Fishery savedFisheryIn = fisheryRepository.save(savedFishery);
        if (savedFisheryIn != null) {
            result.setStatus(1);
            result.setData(savedFisheryIn);
            result.setMessage("Fishry sell success!");
        } else {
            result.setStatus(0);
            result.setMessage("Fishry sell unsuccess!");
        }
        return result;
    }

    @Override
    public Result buy(Market market) {
        Result result = new Result();
        Market savedMarket = marketRepository.getOne(market.getId());
      //
        if (savedMarket != null) {
            result.setStatus(1);
            result.setData(savedMarket);
            result.setMessage("Market buy success!");
        } else {
            result.setStatus(0);
            result.setMessage("Market buy unsuccess!");
        }
        return result;
    }

    @Override
    public Result favor(Market market) {
        Result result = new Result();
        Market savedMarket = marketRepository.getOne(market.getId());
        savedMarket.setFavorCount(savedMarket.getFavorCount()+1);
        Market savedMarketIn = marketRepository.save(savedMarket);
        if (savedMarketIn != null) {
            result.setStatus(1);
            result.setData(savedMarket);
            result.setMessage("Market buy success!");
        } else {
            result.setStatus(0);
            result.setMessage("Market buy unsuccess!");
        }
        return result;
    }

    @Override
    public Result query(Opslog opslog) {
        Result result = new Result();
        List<Opslog> opslogList = opslogRepository.findByUserId(opslog.getUserId());
        if (opslogList != null) {
            result.setStatus(1);
            result.setData(opslogList);
            result.setMessage("Opslog query success!");
        } else {
            result.setStatus(0);
            result.setMessage("Opslog query unsuccess!");
        }
        return result;
    }

    @Override
    public Result record(Refer refer) {
        Result result = new Result();
        Refer savedRefer = referRepository.save(refer);
        if (savedRefer != null) {
            result.setStatus(1);
            result.setData(savedRefer);
            result.setMessage("Fishry sell success!");
        } else {
            result.setStatus(0);
            result.setMessage("Fishry sell unsuccess!");
        }
        return result;
    }

    @Override
    public Result queryCount(Refer refer) {
        Result result = new Result();
        List<Refer> referList = referRepository.findByReferCode(refer.getReferCode());
        if (referList != null) {
            result.setStatus(1);
            result.setData(referList.size());
            result.setMessage("Opslog query success!");
        } else {
            result.setStatus(0);
            result.setMessage("Opslog query unsuccess!");
        }
        return result;
    }

    @Override
    public Result queryFees(Refer refer) {
        Result result = new Result();
        Integer referfee = referRepository.countSumByReferCode(refer.getReferCode());
        if (referfee != null) {
            result.setStatus(1);
            result.setData(referfee);
            result.setMessage("Refer queryfee success!");
        } else {
            result.setStatus(0);
            result.setMessage("Refer queryfee unsuccess!");
        }
        return result;
    }


}
