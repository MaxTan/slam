package xyz.xyzmax.slam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import xyz.xyzmax.slam.exception.CustomException;
import xyz.xyzmax.slam.exception.ErrorEnum;
import xyz.xyzmax.slam.model.TestModel;

@RestController
@RequestMapping("/api")
public class TestController {

    @ApiOperation(value = "测试接口", notes = "测试接口详细描述")
    @RequestMapping("/test")
    public TestModel test() {
        TestModel result = new TestModel();
        result.setName("fxxk you");
        return result;
    }

    @ApiOperation(value = "测试接口", notes = "抛出自定义异常")
    @GetMapping(value = "/custom-error")
    public String throwsCustomErrorTest() throws CustomException {
        throw new CustomException(ErrorEnum.Nologin);
    }

    @ApiOperation(value = "测试接口", notes = "抛出系统异常")
    @GetMapping(value = "/system-error")
    public String throwsSystemErrorTest() {
        String[] arr = new String[1];
        String result = arr[2];
        return result;
    }
}