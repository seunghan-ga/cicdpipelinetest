package com.test.app.model.aws.dao;

import java.util.List;

import com.test.app.model.aws.dto.test_table_01;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<test_table_01> getAllDataList();
}
