package com.sample.test1.domain.test.repository;

import com.sample.test1.domain.test.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
