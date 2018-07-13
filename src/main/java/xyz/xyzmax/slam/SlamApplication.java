package xyz.xyzmax.slam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.ApiOperation;

@SpringBootApplication
public class SlamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlamApplication.class, args);
	}

	@RestController
	public class TestController {

		@ApiOperation(value = "测试接口", notes = "测试接口详细描述")
		@RequestMapping(value = "/test", method = RequestMethod.GET)
		public String get() {
			return "get";
		}
	}
}
