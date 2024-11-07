package com.sample.test1.domain.test.dto;

import com.sample.test1.domain.test.entity.Test;
import lombok.Data;

@Data
public class TestRequest {

    private Long id;
    private String name;
    private String code;

    public Test toEntity() {
        return Test.builder()
                .name(name)
                .code(code)
                .build();
    }
}
