package com.sample.test1.domain.test.service;

import com.sample.test1.domain.test.dto.TestCreateRequest;
import com.sample.test1.domain.test.entity.Test;

import java.util.List;

public interface TestService{

    public List<Test> testList();

    public void createTest(TestCreateRequest test);
}
