package com.SpringBootStudy.diveinspringboot.Condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/**
 * 系统属性的条件判断
 * 在springboot中的Profile是使用的Spring Framework中的Condition
 */
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 取得在用这个注解的参数和值
        Map<String, Object> attribute =  annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
        String propertyName = String.valueOf(attribute.get("name"));
        String propertyValue = String.valueOf(attribute.get("value"));

        // 取得系统的PropertyValue
        String javaPropertyValue = System.getProperty(propertyName);
        // 比较
        return propertyValue.equals(javaPropertyValue);
    }
}
