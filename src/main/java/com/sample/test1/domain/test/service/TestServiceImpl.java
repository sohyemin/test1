package com.sample.test1.domain.test.service;

import com.sample.test1.domain.test.dto.TestCreateRequest;
import com.sample.test1.domain.test.entity.Test;
import com.sample.test1.domain.test.repository.TestRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TestServiceImpl implements TestService{

    private final TestRepository testRepository;

    @Override
    public List<Test> testList() {
        return testRepository.findAll();
    }

    @Override
    public void createTest(TestCreateRequest test) {
        testRepository.save(test.toEntity());
    }
}
