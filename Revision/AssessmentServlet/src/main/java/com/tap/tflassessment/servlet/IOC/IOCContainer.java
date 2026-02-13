package com.tap.tflassessment.servlet.IOC;

import java.util.HashMap;
import java.util.Map;

import com.tap.tflassessment.servlet.Services.QuestionService;
import com.tap.tflassessment.servlet.Services.QuestionServiceImpl;

public class IOCContainer {

    private static Map<Class<?>, Object> beans = new HashMap<>();

    static {
        // register dependencies here
        beans.put(QuestionService.class, new QuestionServiceImpl());
    }

    public static <T> T getBean(Class<T> clazz) {
        return clazz.cast(beans.get(clazz));
    }
}