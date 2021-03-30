package com.SpringBootStudy.diveinspringboot.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//HelloWorldImportSelector-> HelloWorldConfiguration->helloWorld
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
