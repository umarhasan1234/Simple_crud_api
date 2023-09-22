package in.vpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"in.vpt","controller","model"})
@EntityScan(basePackages = "entity")
@EnableJpaRepositories(basePackages = "repository")
public class VptApplication {

	public static void main(String[] args) {
		SpringApplication.run(VptApplication.class, args);
	}

}
