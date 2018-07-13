package xyz.xyzmax.slam.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import xyz.xyzmax.slam.model.JsonResultModel;

@RestControllerAdvice(basePackages = { "xyz.xyzmax.slam.controller" })
public class ResultResponseAdvice implements ResponseBodyAdvice<Object> {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
            Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        JsonResultModel result = new JsonResultModel();
        result.setData(body);
        result.setStatusCode(200);
        return result;
    }

}