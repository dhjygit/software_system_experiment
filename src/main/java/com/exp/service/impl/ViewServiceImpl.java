package com.exp.service.impl;

import com.exp.domain.ViewList;
import com.exp.mapper.ViewMapper;
import com.exp.service.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("viewService")
public class ViewServiceImpl implements ViewService {
    @Autowired
    private ViewMapper viewMapper;

    @Override
    public List<ViewList> findAllView(String id) {
        return viewMapper.findAllView(id);
    }
}
