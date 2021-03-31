package com.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * Java 8 for循环实现{@link CalculateService}
 */
@Profile("Java8") // 条件装配
@Service
public class Java8CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... value) {
        System.out.println("Java 8 for循环实现");
        int sum = Stream.of(value).reduce(0, Integer::sum);
        return sum;
    }
}
