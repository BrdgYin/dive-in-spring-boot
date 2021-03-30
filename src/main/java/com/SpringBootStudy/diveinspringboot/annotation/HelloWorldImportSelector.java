package com.SpringBootStudy.diveinspringboot.annotation;
import com.SpringBootStudy.diveinspringboot.Configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * HelloWorld {@link ImportSelector} 实现
 */
public class HelloWorldImportSelector implements ImportSelector{
    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 用helloWorld导入--变成了bean
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
