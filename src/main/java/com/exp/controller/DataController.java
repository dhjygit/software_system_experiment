package com.exp.controller;

import com.exp.domain.DataList;
import com.exp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dataList")
public class DataController {
    @Autowired
    private DataService dataService; /*查询*/

    @PostMapping
    @ResponseBody
    public List<DataList> findAllData() {
        return dataService.findAllData();
    }
}
