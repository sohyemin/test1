package com.sample.test1.domain.test.service;

import ch.qos.logback.core.spi.ErrorCodes;
import com.sample.test1.domain.test.dto.TestRequest;
import com.sample.test1.domain.test.entity.Test;
import com.sample.test1.domain.test.repository.TestRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
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
    public Test readeById(Long id) {
        Test findTest = testRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("대상이 존재하지 않습니다.");
                    throw new RuntimeException("can't find a data by id : " + id);
                });

        return findTest;
    }

    @Override
    public void createTest(TestRequest test) {
        testRepository.save(test.toEntity());
    }

    @Override
    public void deleteTest(Long id) {
        testRepository.deleteById(id);
    }

    @Override
    public void updateTest(TestRequest test) {
        Test findtest = testRepository.findById(test.getId()).get();

        findtest.update(test.getName(), test.getCode());
        testRepository.save(findtest);

    }
}
