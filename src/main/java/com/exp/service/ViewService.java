package com.exp.service;

import com.exp.domain.ViewList;

import java.util.List;

public interface ViewService {
    List<ViewList> findAllView(String id);
}
