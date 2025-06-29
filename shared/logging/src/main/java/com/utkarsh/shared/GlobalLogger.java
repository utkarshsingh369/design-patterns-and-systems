package com.utkarsh.shared;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Hello world!
 *
 */
public class GlobalLogger {
    private static final ConcurrentHashMap<String, Logger> loggerMap = new ConcurrentHashMap<>();

    private GlobalLogger(){

    }

    public static Logger getLoggerInstance(Class<?> clazz){
        return loggerMap.computeIfAbsent(clazz.getName(), k -> {
            return LoggerFactory.getLogger(clazz);
        });
    }
}
