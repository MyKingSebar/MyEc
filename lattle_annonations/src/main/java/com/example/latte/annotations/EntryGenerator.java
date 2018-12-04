package com.example.latte.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//告诉编译器方法是用在类上的
@Retention(RetentionPolicy.SOURCE)//编译器在处理注解的时候是在源码阶段
public @interface EntryGenerator {

    String packageName();

    Class<?> entryTemplate();


}
