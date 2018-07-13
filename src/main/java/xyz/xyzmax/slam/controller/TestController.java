package xyz.xyzmax.slam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import xyz.xyzmax.slam.exception.CustomException;
import xyz.xyzmax.slam.model.TestModel;

@RestController
@RequestMapping("/api")
public class TestController {

    @ApiOperation(value = "测试接口", notes = "测试接口详细描述")
    @RequestMapping("/test")
    public TestModel test() {
        TestModel sd = new TestModel();
        sd.setName("sdsds");
        return sd;
    }

    @ApiOperation(value = "测试接口", notes = "抛出自定义异常")
    @GetMapping(value = "/error")
    public String throwsErrorTest() throws Exception {
        throw new CustomException("出错啦");
    }
}