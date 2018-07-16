package xyz.xyzmax.slam.aspect;

import com.google.gson.Gson;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final Gson gson = new Gson();

    @Pointcut("execution(public * xyz.xyzmax.slam.controller..*(..))")
    private void controllerAspect() {
    }

    @AfterReturning(returning = "o", pointcut = "controllerAspect()")
    public void methodAfterReturing(Object o) {
        log.info("--------------返回内容----------------");
        log.info("Response内容:" + gson.toJson(o));
        log.info("--------------返回内容----------------");
    }

}