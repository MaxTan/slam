package xyz.xyzmax.slam.advice;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import xyz.xyzmax.slam.exception.CustomException;
import xyz.xyzmax.slam.model.JsonResultModel;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = Exception.class)
    public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.info("================全=========局========异==========常");
        log.error(e.getMessage());
        JsonResultModel result = new JsonResultModel();
        if (e instanceof CustomException) {
            CustomException ex = (CustomException) e;
            result.setErrorMessage(ex.getErrorMessage());
            result.setStatusCode(ex.getStatusCode());
            return result;
        }
        result.setErrorMessage(e.getMessage());
        result.setStatusCode(500);
        log.error(getStatckTrace(e));
        return result;
    }

    private String getStatckTrace(Exception e) {
        StringWriter sw = null;
        PrintWriter pw = null;
        try {
            sw = new StringWriter();
            pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            pw.flush();
            sw.flush();
        } finally {
            if (sw != null) {
                try {
                    sw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (pw != null) {
                pw.close();
            }
        }
        return sw.toString();
    }
}