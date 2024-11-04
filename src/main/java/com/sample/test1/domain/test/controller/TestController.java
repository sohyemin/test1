package com.sample.test1.domain.test.controller;

import com.sample.test1.domain.test.dto.TestCreateRequest;
import com.sample.test1.domain.test.entity.Test;
import com.sample.test1.domain.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public List<Test> testList(){
        return testService.testList();
    }

    @PostMapping("/test")
    public void createTest(@RequestBody TestCreateRequest test){
        testService.createTest(test);
    }

}
