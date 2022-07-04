package com.exp.controller;

import com.exp.domain.DataDiagram;
import com.exp.service.DiagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dataDiagram")
public class DiagramController {
    @Autowired
    private DiagramService diagramService;

    @PostMapping
    @ResponseBody
    public List<DataDiagram> findAllDiagram(@RequestBody Map<String, String> parameters) {
        String id = parameters.get("id");
        return diagramService.findAllDiagram(id);
    }
}
