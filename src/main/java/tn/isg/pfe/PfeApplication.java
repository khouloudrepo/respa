package tn.isg.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"tn.isg.pfe"})
@EnableAutoConfiguration
@SpringBootApplication
public class PfeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfeApplication.class, args);
		
		System.out.println("Khouloud....");
	}

}

