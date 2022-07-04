package com.exp.service.impl;

import com.exp.domain.DataDiagram;
import com.exp.mapper.DiagramMapper;
import com.exp.service.DiagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("diagramService")
public class DiagramServiceImpl implements DiagramService {
    @Autowired
    private DiagramMapper diagramMapper;

    @Override
    public List<DataDiagram> findAllDiagram(String id) {
        return diagramMapper.findAllDiagram(id);
    }
}
