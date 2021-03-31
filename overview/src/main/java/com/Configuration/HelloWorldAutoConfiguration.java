package com.Configuration;

import com.Condition.ConditionalOnSystemProperty;
import com.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring 模式注解
@EnableHelloWorld // Spring @Enable模块装配--会节约很多的模块开发
// 条件装配
@ConditionalOnSystemProperty(name="user.name", value = "Administrator")
public class HelloWorldAutoConfiguration {
}
