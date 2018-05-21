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

@CrossOrigin("*")
@Controller
public class OneController {

    @Autowired
    public OneService oneService;

    //爬虫查询
    @ResponseBody
    @RequestMapping(value = "/pachong/query", method = RequestMethod.GET)
    public Result query(@ModelAttribute Company company, @RequestParam Integer type) {
        return oneService.query(company, type);
    }

    //数据库查询
    @ResponseBody
    @RequestMapping(value = "/pachong/search", method = RequestMethod.GET)
    public Result search(@ModelAttribute Company company, @RequestParam Integer type) {
        return oneService.search(company, type);
    }
}
