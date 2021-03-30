package com.SpringBootStudy.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Java 7 for循环实现{@link CalculateService}
 */
@Profile("Java7") // 条件装配
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... value) {
        System.out.println("Java 7 for循环实现");
        int sum = 0;
        for (int i = 0; i < value.length; i++) {
            sum += value[i]; // 通过下标来获取
        }
        return sum;
    }
}
