package com.exp.service.impl;

import com.exp.domain.DataList;
import com.exp.mapper.DataMapper;
import com.exp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dataService")
public class DataServiceImpl implements DataService {
    @Autowired
    public DataMapper dataMapper;

    @Override
    public List<DataList> findAllData() {
        return dataMapper.findAllData();
    }
}
