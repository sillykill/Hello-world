package com.control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping(value="/log")
@Controller
public class LogController {
     static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    @RequestMapping(value="/init")
    public String init(){
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("erroe message");
        logger.fatal("fatal message");
        return "log";
    }
}