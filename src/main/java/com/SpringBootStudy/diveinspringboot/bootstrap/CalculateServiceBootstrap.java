package com.SpringBootStudy.diveinspringboot.bootstrap;

import com.SpringBootStudy.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link CalculateService} 引导类
 */
@SpringBootApplication(scanBasePackages = "com.SpringBootStudy.diveinspringboot.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        // 方便
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        // CalculateService bean是否存在
        CalculateService serviceBootstrap = context.getBean(CalculateService.class);
        System.out.println("calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) = " + serviceBootstrap.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // 关闭上下文
        context.close();
    }
}
