package my.projectlab.oauth2Lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "my.projectlab.oauth2Lab.dao")
public class MyOAuth2DBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOAuth2DBApplication.class, args);
	}
}
