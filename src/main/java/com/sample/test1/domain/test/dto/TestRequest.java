package com.sample.test1.domain.test.dto;

import com.sample.test1.domain.test.entity.Test;
import lombok.Data;

@Data
public class TestRequest {

    private Long id;
    private String name;
    private String code;

    public Test toEntity() {
        return new Test(name, code);
    }
}
