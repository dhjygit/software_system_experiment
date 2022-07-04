package com.exp.mapper;

import com.exp.domain.ViewList;

import java.util.List;

public interface ViewMapper {
    List<ViewList> findAllView(String id);
}
