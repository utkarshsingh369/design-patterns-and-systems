package com.utkarsh.design_patterns;

import com.utkarsh.shared.GlobalLogger;
import org.slf4j.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = GlobalLogger.getLoggerInstance(App.class);
        logger.error("Error encountered!");
        logger.info("This is a sample info");
    }
}