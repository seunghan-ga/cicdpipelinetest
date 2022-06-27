package com.test.app.controller;

import java.util.List;

import com.test.app.model.aws.dto.test_table_01;
import com.test.app.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TestController {
  private final TestService testService;

  @GetMapping("/test")
  public List<test_table_01> test() {

    return testService.getAllDataList();
  }
}
