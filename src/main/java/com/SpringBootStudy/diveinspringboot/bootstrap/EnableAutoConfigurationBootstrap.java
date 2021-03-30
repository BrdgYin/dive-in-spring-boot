package com.SpringBootStudy.diveinspringboot.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link EnableAutoConfiguration}
 */
@EnableAutoConfiguration  // 第一步：激活自动装配
public class EnableAutoConfigurationBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 通过名称获取到hello Bean
        String hello = context.getBean("helloWorld", String.class);
        System.out.println("hello Bean :" + hello);
        // 关闭上下文
        context.close();
    }
}
