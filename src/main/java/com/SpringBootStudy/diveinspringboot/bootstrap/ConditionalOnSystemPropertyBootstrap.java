package com.SpringBootStudy.diveinspringboot.bootstrap;

import com.SpringBootStudy.diveinspringboot.Condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 系统条件引导类
 */
public class ConditionalOnSystemPropertyBootstrap {

    @Bean // 交给Spring 容器初始化
    // 条件装配 要与系统的System.getProperty(propertyName)匹配才初始化
    @ConditionalOnSystemProperty(name="user.name", value = "Administrator")
    public String hello(){
        return "hello";
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        // 通过名称获取到hello Bean
        String hello = context.getBean("hello", String.class);
        System.out.println("hello Bean :" + hello);
        context.close();
    }
}

