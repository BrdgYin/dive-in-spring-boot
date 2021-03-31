package com.Condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Java 系统属性条件判断
 * System下的getProperty
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * Java 系统属性的名称
     * @return
     */
    String name();

    /**
     * 系统属性匹配值
     * @return
     */
    String value();
}
