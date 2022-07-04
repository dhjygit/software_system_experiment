package com.exp.mapper;

import com.exp.domain.DataDiagram;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiagramMapper {
    List<DataDiagram> findAllDiagram(@Param("id") String id);
}
