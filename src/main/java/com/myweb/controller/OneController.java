package com.myweb.controller;

import com.myweb.pojo.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.yaml.snakeyaml.error.Mark;

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
    @ResponseBody
    @RequestMapping(value = "/user/setNickName", method = RequestMethod.POST)
    public Result setNickName(@ModelAttribute User user) {
        return oneService.setNickName(user);
    }

    //设置头像
    @ResponseBody
    @RequestMapping(value = "/user/setAvatar", method = RequestMethod.POST)
    public Result setAvatar(@RequestParam("avatar") MultipartFile multipartFile, @ModelAttribute User user) {
        return oneService.setAvatar(multipartFile, user);
    }

    //获取推荐码生成推荐事件
    @ResponseBody
    @RequestMapping(value = "/user/getReferUrl", method = RequestMethod.GET)
    public Result getReferUrl(@ModelAttribute User user) {
        return oneService.getReferUrl(user);
    }

    //绑定游戏地址
    @ResponseBody
    @RequestMapping(value = "/fishery/bind", method = RequestMethod.POST)
    public Result bind(@ModelAttribute Fishery fishery, @ModelAttribute Opslog opslog) {
        opslog.setAction("绑定游戏地址");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.bind(fishery);
    }

    //设置渔场名称
    @ResponseBody
    @RequestMapping(value = "/fishery/setName", method = RequestMethod.POST)
    public Result setName(@ModelAttribute Fishery fishery, @ModelAttribute Opslog opslog) {
        opslog.setAction("设置渔场名称");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.setName(fishery);
    }

    //取消绑定
    @ResponseBody
    @RequestMapping(value = "/fishery/unbind", method = RequestMethod.POST)
    public Result unbind(@ModelAttribute Fishery fishery, @ModelAttribute Opslog opslog) {
        opslog.setAction("取消绑定");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.unbind(fishery);
    }

    //出售
    @ResponseBody
    @RequestMapping(value = "/fishery/sell", method = RequestMethod.POST)
    public Result sell(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("出售");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.sell(market);
    }

    //取消出售
    @ResponseBody
    @RequestMapping(value = "/fishery/unsell", method = RequestMethod.POST)
    public Result unsell(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("取消出售");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.unsell(market);
    }

    //购买渔场
    @ResponseBody
    @RequestMapping(value = "/market/buy", method = RequestMethod.POST)
    public Result buy(@ModelAttribute Fishery fishery, @ModelAttribute Refer refer, @ModelAttribute Opslog opslog) {
        opslog.setAction("购买渔场");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.buy(fishery, refer);
    }

    //赞
    @ResponseBody
    @RequestMapping(value = "/market/favor", method = RequestMethod.POST)
    public Result favor(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("赞");
        Result result = oneService.createLog(opslog);
        if (result.getStatus() == 0) return result;
        return oneService.favor(market);
    }

    //查询
    @ResponseBody
    @RequestMapping(value = "/opslog/query", method = RequestMethod.GET)
    public Result query(@ModelAttribute Opslog opslog, @RequestParam int pageNumber, @RequestParam int pageSize) {
        Sort sort = new Sort(Sort.Direction.DESC, "actionTime");
        Pageable pageable = new PageRequest(pageNumber, pageSize, sort);
        return oneService.query(opslog, pageable);
    }
}
