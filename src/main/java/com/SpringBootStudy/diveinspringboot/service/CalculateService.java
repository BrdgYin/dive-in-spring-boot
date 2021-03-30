package com.SpringBootStudy.diveinspringboot.service;

/**
 * 计算服务
 */
public interface CalculateService {

    /**
     * 多个整数求和
     * @param value  多个整数
     * @return  累加和
     */
    Integer sum(Integer... value);
}
