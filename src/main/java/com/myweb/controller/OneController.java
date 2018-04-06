package com.myweb.controller;

import com.myweb.pojo.*;
import com.myweb.service.OneService;
import com.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    public Result setAvatar(@ModelAttribute User user) {
        return oneService.setAvatar(user);
    }

    //上传头像
    @PostMapping("/user/uploadAvatar")
    public Result uploadAvatar(@RequestParam("editormd-image-file") MultipartFile multipartFile) {
        return oneService.uploadAvatar(multipartFile);
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
        oneService.createLog(opslog);
        return oneService.bind(fishery);
    }

    //设置渔场名称
    @ResponseBody
    @RequestMapping(value = "/fishery/setName", method = RequestMethod.POST)
    public Result setName(@ModelAttribute Fishery fishery, @ModelAttribute Opslog opslog) {
        opslog.setAction("设置渔场名称");
        oneService.createLog(opslog);
        return oneService.setName(fishery);
    }

    //取消绑定
    @ResponseBody
    @RequestMapping(value = "/fishery/unbind", method = RequestMethod.POST)
    public Result unbind(@ModelAttribute Fishery fishery, @ModelAttribute Opslog opslog) {
        opslog.setAction("取消绑定");
        oneService.createLog(opslog);
        return oneService.unbind(fishery);
    }

    //出售
    @ResponseBody
    @RequestMapping(value = "/fishery/sell", method = RequestMethod.POST)
    public Result sell(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("出售");
        oneService.createLog(opslog);
        return oneService.sell(market);
    }

    //取消绑定
    @ResponseBody
    @RequestMapping(value = "/fishery/unsell", method = RequestMethod.POST)
    public Result unsell(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("取消绑定");
        oneService.createLog(opslog);
        return oneService.unsell(market);
    }

    //购买渔场
    @ResponseBody
    @RequestMapping(value = "/market/buy", method = RequestMethod.POST)
    public Result buy(@ModelAttribute Fishery fishery, @ModelAttribute Refer refer, @ModelAttribute Opslog opslog) {
        opslog.setAction("购买渔场");
        oneService.createLog(opslog);
        return oneService.buy(fishery, refer);
    }

    //赞
    @ResponseBody
    @RequestMapping(value = "/market/favor", method = RequestMethod.POST)
    public Result favor(@ModelAttribute Market market, @ModelAttribute Opslog opslog) {
        opslog.setAction("赞");
        oneService.createLog(opslog);
        return oneService.favor(market);
    }

    //查询
    @ResponseBody
    @RequestMapping(value = "/opslog/query", method = RequestMethod.GET)
    public Result query(@ModelAttribute Opslog opslog, @ModelAttribute PageRequest pageRequest) {
        return oneService.query(opslog, pageRequest);
    }
}
