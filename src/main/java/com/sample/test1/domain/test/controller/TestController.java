package com.sample.test1.domain.test.controller;

import com.sample.test1.domain.test.dto.TestRequest;
import com.sample.test1.domain.test.entity.Test;
import com.sample.test1.domain.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/test/{id}")
    public Test findTestById(@PathVariable("id") Long id){
        return testService.readeById(id);
    }

    @PostMapping("/test")
    public void createTest(@RequestBody TestRequest test){
        testService.createTest(test);
    }

    @DeleteMapping("/test")
    public void deleteTest(@RequestBody TestRequest test){
        testService.deleteTest(test.getId());
    }

    @PutMapping("/test")
    public void updateTest(@RequestBody TestRequest test) {
        testService.updateTest(test);
    }

}
