package com.exp.controller;

import com.exp.domain.ViewList;
import com.exp.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/viewList")
public class ViewController {
    @Autowired
    private ViewService viewService; /*查询*/

    @PostMapping
    @ResponseBody
    public List<ViewList> findAllView(@RequestBody Map<String, String> parameters) {
        String id = parameters.get("id");
        return viewService.findAllView(id);
    }
}
