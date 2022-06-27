package com.test.app.service;

import java.util.List;

import com.test.app.model.aws.dao.TestMapper;
import com.test.app.model.aws.dto.test_table_01;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<test_table_01> getAllDataList() {
        return testMapper.getAllDataList();
    }
}
