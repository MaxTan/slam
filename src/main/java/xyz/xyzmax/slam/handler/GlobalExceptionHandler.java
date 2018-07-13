package xyz.xyzmax.slam.handler;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.info("================全=========局========异==========常");
        String result = e.getMessage();
        log.info(e.getClass().getName());
        log.info("================全=========局========异==========常");
        return result;
    }
}