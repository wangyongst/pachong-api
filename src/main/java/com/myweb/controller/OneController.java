package com.myweb.controller;

import com.myweb.pojo.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OneController {

    @Autowired
    public OneService oneService;

    //注册， 提交签名信息，并在后端做验证
    @ResponseBody
    @RequestMapping(value = "/user/registy", method = RequestMethod.POST)
    public Result registy(@ModelAttribute User user) {
        return oneService.registry(user);
    }

    //设置昵称
    @RequestMapping(value = "/user/setNickName", method = RequestMethod.POST)
    public Result setNickName(@ModelAttribute User user) {
        return oneService.setNickName(user);
    }

    //设置头像
    @RequestMapping(value = "/user/setAvatar", method = RequestMethod.POST)
    public Result setAvatar(@ModelAttribute User user) {
        return oneService.setAvatar(user);
    }

    //获取推荐码
    @ResponseBody
    @RequestMapping(value = "/user/getReferUrl", method = RequestMethod.GET)
    public Result getReferUrl(@ModelAttribute User user) {
        return oneService.getReferUrl(user);
    }

    //绑定游戏地址
    @ResponseBody
    @RequestMapping(value = "/fishery/bind", method = RequestMethod.POST)
    public Result bind(@ModelAttribute Fishery fishery) {
        return oneService.bind(fishery);
    }

    //取消绑定
    @ResponseBody
    @RequestMapping(value = "/fishery/unbind", method = RequestMethod.POST)
    public Result unbind(@ModelAttribute Fishery fishery) {
        return oneService.unbind(fishery);
    }

    //出售
    @ResponseBody
    @RequestMapping(value = "/fishery/sell", method = RequestMethod.POST)
    public Result sell(@ModelAttribute Fishery fishery, @ModelAttribute Market market) {
        return oneService.sell(fishery);
    }

    //取消绑定
    @ResponseBody
    @RequestMapping(value = "/fishery/unsell", method = RequestMethod.POST)
    public Result unsell(@ModelAttribute Fishery fishery) {
        return oneService.unsell(fishery);
    }

    //购买渔场
    @ResponseBody
    @RequestMapping(value = "/market/buy", method = RequestMethod.POST)
    public Result buy(@ModelAttribute Market market) {
        return oneService.buy(market);
    }

    //赞
    @ResponseBody
    @RequestMapping(value = "/market/favor", method = RequestMethod.POST)
    public Result favor(@ModelAttribute Market market) {
        return oneService.favor(market);
    }

    //查询
    @ResponseBody
    @RequestMapping(value = "/opslog/query", method = RequestMethod.GET)
    public Result query(@ModelAttribute Opslog opslog) {
        return oneService.query(opslog);
    }


    //记录推荐成功事件
    @ResponseBody
    @RequestMapping(value = "/refer/record", method = RequestMethod.POST)
    public Result record(@ModelAttribute Refer refer) {
        return oneService.record(refer);
    }

    //查询推荐的总数量
    @ResponseBody
    @RequestMapping(value = "/refer/queryCount", method = RequestMethod.GET)
    public Result queryCount(@ModelAttribute Refer refer) {
        return oneService.queryCount(refer);
    }

    //查询推荐费总和
    @ResponseBody
    @RequestMapping(value = "/refer/queryFees", method = RequestMethod.GET)
    public Result queryFees(@ModelAttribute Refer refer) {
        return oneService.queryFees(refer);
    }
}
