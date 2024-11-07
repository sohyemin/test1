package com.sample.test1.domain.test.service;

import com.sample.test1.domain.test.dto.TestRequest;
import com.sample.test1.domain.test.entity.Test;

import java.util.List;
import java.util.Optional;

public interface TestService{

    public List<Test> testList();

    public Test readeById(Long id);

    public void createTest(TestRequest test);

    public void deleteTest(Long id);

    public void updateTest(TestRequest test);
}