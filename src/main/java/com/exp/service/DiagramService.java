package com.exp.service;

import com.exp.domain.DataDiagram;

import java.util.List;

public interface DiagramService {
    List<DataDiagram> findAllDiagram(String name);
}
