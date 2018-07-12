package xyz.xyzmax.slam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SlamApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlamApplication.class, args);
	}

	@RestController
	public class TestController {

		@RequestMapping("/test")
		public String Test() {
			return this.toString();
		}
	}
}
